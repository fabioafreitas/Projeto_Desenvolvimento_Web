import Vue from "vue";
import Router from "vue-router";
import AddUsuario from "./components/AddUsuarios.vue";
import Login from "./components/Login.vue";
import SignUp from "./components/SignUp.vue";
import Duvidas from "./components/Duvidas.vue";
import LoggedIn from "./components/LoggedIn.vue";
import MapIndex from "./components/MapIndex.vue";
import Index from "./components/Index.vue";
import Sobre from "./components/Sobre.vue";
import Servicos from "./components/Servicos.vue";


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
    },
      {
      path: "/logado",
      name: "logado",
      component: LoggedIn
    },
    {
      path: "/institucional",
      name: "institucional",
      component: Sobre
    },
    {
      path: "/servicos",
      name: "servicos",
      component: Servicos
    },
      {
      path: "/",
      name: "index",
      component: Index
    }
  ]
});