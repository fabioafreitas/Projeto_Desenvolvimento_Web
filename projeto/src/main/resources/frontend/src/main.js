import Vue from "vue"
import App from "./App.vue"
import router from "./router"
import store from "./store"
import 'bootstrap/dist/js/bootstrap.js'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import './assets/css/custom.css'

Vue.config.productionTip = false

// Instância do Vue.JS para renderizar a SPA

new Vue({
    router,
    store,
    render: h => h(App),
}).$mount('#app')
