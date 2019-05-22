import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        title: 'My custom title',
        links: [
            'www.google.com',
            'www.gsmarena.com'
        ],
        navActive: 'principal'
    },
    mutations: {
        NAV_ATIVO: (state,menuItem) => {
            return state.navActive = menuItem
        }
    },
    actions: {
        navAtivo: (context) => {
            context.commit("NAV_ATIVO")
        }
    },
    getters: {
        countLinks: state => {
            return state.links.length
        },
        isActive: state => menuItem => {
            return state.navActive == menuItem
        }
    }
})