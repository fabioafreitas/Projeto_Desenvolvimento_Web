import Apac from "./components/Apac.vue";
import Bombeiros from "./components/Bombeiros.vue";
import Codecipe from "./components/Codecipe.vue";
import Samu from "./components/Samu.vue";
import Vue from "vue";
import Router from "vue-router";

Vue.use(Router);

export default new Router({
    mode: "history",
    routes:[
        {
            path: "/",
            name: "home"
        },
        {
            path: "/apac",
            name: "apac",
            component: Apac
        },
        {
            path: "/bombeiros",
            name: "bombeiros",
            component: Bombeiros
        },
        {
            path: "/codecipe",
            name: "codecipe",
            component: Codecipe
        },
        {
            path: "/samu",
            name: "samu",
            component: Samu
        }
    ]
});