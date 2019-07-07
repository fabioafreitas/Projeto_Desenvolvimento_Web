# Parte do codigo foi implementada gracas ao seguinte projeto: https://gist.github.com/kevgathuku/51e30f08a552084b1130#file-flask_gridfs_server-py

from flask import Flask, request, make_response,  jsonify
from flask_cors import CORS
from werkzeug.utils import secure_filename
from pymongo import MongoClient
from bson.objectid import ObjectId
from gridfs import GridFS
from gridfs.errors import NoFile

ALLOWED_EXTENSIONS = set(['png', 'jpg', 'jpeg', 'gif'])
MONGO = MongoClient('mongodb+srv://maikpaixao:92368024@collenotes-faem7.mongodb.net/FileDB?retryWrites=true', maxPoolSize=50, connect=False)
COLL = MONGO['testeImagem'] #Collection que está sendo utilizada
FS = GridFS(COLL)


app = Flask(__name__)
cors = CORS(app, resources={r"/imagens/*": {"origins": "*"}})

def allowed_file(filename):
    return '.' in filename and \
            filename.rsplit('.', 1)[1] in ALLOWED_EXTENSIONS

#Retorna todos o nome de todas as imagens inseridas
@app.route('/imagens', methods=['GET'])
def getAll():
    return jsonify(FS.list()), 200

#Recupera uma imagem baseado em seu filename
@app.route('/imagens/<filename>', methods=['GET'])
def get(filename):
    try:
        file_object = FS.get_version(filename=filename, version=-1, session=None)
        response = make_response(file_object.read())
        response.mimetype = file_object.content_type
        return response
    except NoFile:
        return jsonify("Imagem nao existe"), 404

#Insere uma imagem e a insere baseado em seu filename
@app.route('/imagens', methods=['POST'])
def save():
    file = request.files['file']
    if file and allowed_file(file.filename):
        filename = secure_filename(file.filename)
        if not FS.exists({"filename": filename}):
            oid = FS.put(file, content_type=file.content_type, filename=filename)
            return jsonify(objectid=str(oid)), 200
        return jsonify("Nome de imagem ja existe"), 400
    return jsonify("Formato nao permitido"), 400

#Recebe uma imagem, atualiza o arquivo de acordo com seu filename TODO deletar o arquivo antes de atualizar
@app.route('/imagens', methods=['PUT'])
def update():
    file = request.files['file']
    if file and allowed_file(file.filename):
        filename = secure_filename(file.filename)
        if FS.exists({"filename": filename}):
            delete(filename)
            oid = FS.put(file, content_type=file.content_type, filename=filename)
            return jsonify(objectid=str(oid)), 200
        return jsonify("Nome de imagem nao existe"), 404
    return jsonify("Formato nao permitido"), 400

@app.route('/imagens/<fname>', methods=['DELETE'])
def delete(fname):
    DOCS = COLL["fs.files"]
    for x in DOCS.find():
        if x['filename'] == fname:
            objectid = ObjectId(x['_id'])
            FS.delete(objectid)
            return jsonify("Deletado com sucesso"), 200
    return jsonify("Imagem nao existe"), 404

if __name__ == '__main__':
    app.run()