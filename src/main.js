import Vue from "vue"
import App from "./App.vue"
import router from "./router"
import store from "./store"
import 'bootstrap/dist/js/bootstrap.js'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import './assets/css/custom.css'

Vue.config.productionTip = false

router.beforeEach((to, from, next) => {
    if (to.matched.some(record => record.meta.requiresAuth)) {
      // this route requires auth, check if logged in
      // if not, redirect to login page.
      if (!store.getters.isLoggedIn) {
        next({
          path: '/login',
          //query: { redirect: to.fullPath } //eh pra mostrar ou nao o caminho que iria direcionar na pagina
        })
      } else {
        next()
      }
    } else if (to.matched.some(record => record.meta.requiresVisitor)) {
        // this route requires auth, check if logged in
        // if not, redirect to login page.
        if (store.getters.isLoggedIn) {
          next({
            path: '/logado',
            //query: { redirect: to.fullPath } //eh pra mostrar ou nao o caminho que iria direcionar na pagina
          })
        } else {
          next()
        }
      } else {
      next() // make sure to always call next()!
    }
  })

// Instância do Vue.JS para renderizar a SPA
new Vue({
    router,
    store,
    render: h => h(App),
}).$mount('#app')
