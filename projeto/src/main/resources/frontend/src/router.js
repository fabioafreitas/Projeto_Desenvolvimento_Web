import Vue from "vue";
import Router from "vue-router";
import AddUsuario from "./components/AddUsuarios.vue";
import Login from "./components/Login.vue";
import SignUp from "./components/SignUp.vue";
import Duvidas from "./components/Duvidas.vue";
 
Vue.use(Router);
 
// o router simula a multiplicidade de páginas na aplicação.
// path indica  a url que deve ser mostrada o componente.
// nome indica o nome da rota
// component indica o componente

export default new Router({
  mode: "history",
  routes:[
    {
      path: "/add",
      name: "add",
      component: AddUsuario
    },
    {
      path: "/login",
      name: "login",
      component: Login
    },
    {
      path: "/registrar",
      name: "registrar",
      component: SignUp
    },
    {
      path: "/duvidas",
      name: "duvidas",
      component: Duvidas
    }
  ]
});