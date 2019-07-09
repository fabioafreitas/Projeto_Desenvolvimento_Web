import axios from "axios";

export default axios.create({
    baseURL: "https://flask-imagens.herokuapp.com"
    //baseURL: "http://localhost:5000"
});