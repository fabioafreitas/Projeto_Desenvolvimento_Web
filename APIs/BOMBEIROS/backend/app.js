const express = require('express');
const app = express();

app.use((req, res, next) => {
    /*res.status(200).json({
        message: 'API dos bombeiros'
    });*/
    res.status(200).json(
        'API dos bombeiros'
    );
});

module.exports = app;