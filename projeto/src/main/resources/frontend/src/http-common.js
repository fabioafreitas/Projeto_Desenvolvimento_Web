import axios from "axios";
 
export default axios.create({
 // baseURL: "http://eb333f79.ngrok.io",//,//api",
  baseURL: "http://localhost:8080",//,//api",
  headers: {
    "Content-type": "application/json",
  }
});