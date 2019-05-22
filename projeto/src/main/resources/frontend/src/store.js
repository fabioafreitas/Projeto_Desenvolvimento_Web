import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        navActive: 'principal',
        logado: false
    },
    mutations: {
        NAV_ATIVO: (state,menuItem) => {
            return state.navActive = menuItem
        },
        LOGOU: (state,log) => {
            state.logado = log
        }
    },
    actions: { 
        navAtivo: (context) => { //Exemplo de um action
            context.commit("NAV_ATIVO")
        }
    },
    getters: {
        isActive: state => menuItem => {
            return state.navActive == menuItem
        },
        isLoggedIn(state) {
            return state.logado
        }
    }
})