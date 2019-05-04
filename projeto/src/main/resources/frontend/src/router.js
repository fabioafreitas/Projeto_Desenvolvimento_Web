import Vue from "vue";
import Router from "vue-router";
import AddUsuario from "./components/AddUsuarios.vue";
import Login from "./components/Login.vue";
 
Vue.use(Router);
 
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
    }
  ]
});