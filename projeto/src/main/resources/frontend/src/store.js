import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        navActive: 'principal'
    },
    mutations: {
        NAV_ATIVO: (state,menuItem) => {
            return state.navActive = menuItem
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
        }
    }
})