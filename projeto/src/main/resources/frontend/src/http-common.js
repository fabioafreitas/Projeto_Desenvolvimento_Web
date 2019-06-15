import axios from "axios";
 
export default axios.create({
  //baseURL: "https://my-alert-backend.herokuapp.com"    /* Antes do deploy, lembrar de utilizar esta URL */
  baseURL: "http://localhost:8080",
  headers: {
    "Content-type": "application/json",
  }
});