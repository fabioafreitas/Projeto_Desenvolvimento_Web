const history = require('connect-history-api-fallback')
const express = require('express')
const path    = require('path')

const app = express()
const staticFileMiddleware = express.static(path.join(__dirname, 'dist'))

app.use(staticFileMiddleware)
app.use(history())
app.use(staticFileMiddleware)

app.get('/', function (req, res) {
    res.render(path.join(__dirname + '/index.html'))
})

var port = process.env.PORT || 4200
app.listen(port, function () {
    console.log( 'Express serving on 4200!' )
})