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
import Ocorrencia from "./components/Ocorrencia.vue";
import Profile from "./components/Profile.vue";
import Settings from "./components/Settings.vue";


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
      component: Login,
      meta: {
        requiresVisitor: true,
      }
    },
    {
      path: "/registrar",
      name: "registrar",
      component: SignUp,
      meta: {
        requiresVisitor: true,
      }
    },
    {
      path: "/duvidas",
      name: "duvidas",
      component: Duvidas
    },
      {
      path: "/logado",
      name: "logado",
      component: LoggedIn,
      meta: {
        requiresAuth: true,
      }
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
    },
    {
      path: "/profile",
      name: "profile",
      component: Profile,
      meta: {
        requiresAuth: true,
      }
    },
    {
    path: "/ocorrencia",
    name: "ocorrencia",
    component: Ocorrencia,
    meta: {
      requiresAuth: true,
    }
    }, 
    {
    path: "/setting",
    name: "setting",
    component: Settings,
    meta: {
      requiresAuth: true,
    }
    },
    {
        path: "*",
        redirect: '/'
    }
  ]
});