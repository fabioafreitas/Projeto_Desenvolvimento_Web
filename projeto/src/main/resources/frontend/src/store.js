import Vue from 'vue'
import Vuex from 'vuex'
import http from './http-common'

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
        },
        addUsuarios(context, data) {
            return new Promise((resolve, reject) => {
                http.post("/api/usuario", data)
                .then(response => {
                    //this.usuario.id = response.data.id;
                    resolve(response)  
                    //console.log(response.data);
                })
                .catch(error => {
                    //console.log(error);
                    reject(error)
                });
            })
        },
        logar(context, data) {
            return new Promise((resolve, reject) => {
                http.post("/login", data)
                    .then(response => {
                        //this.LOGOU(true)
                        context.commit("LOGOU",response.data)
                    //this.usuario.id = response.data.id;
                    resolve(response)
                    //console.log(response.data);
                })
        .catch(error => {
                //console.log(error);
                reject(error)
            });
        })
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