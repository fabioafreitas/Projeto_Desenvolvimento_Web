import Vue from 'vue'
import Vuex from 'vuex'
import http from './http-common'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        token: localStorage.getItem('access_token') || null,
        navActive: 'principal',
        logado: false,
        usuario: JSON.parse(localStorage.getItem('access_usuario')) || null,
        username: localStorage.getItem('access_username') || null
    },
    mutations: {
        NAV_ATIVO: (state, menuItem) => {
            return state.navActive = menuItem
        },
        LOGOU: (state, log) => {
            state.logado = log
        },
        retrieveToken(state, token) {
            state.token = token
        },
        destroyToken(state) {
            state.token = null
        },
        retrieveUsername(state, username){
            state.username = username
        },
        retrieveUser(state, usuario){
            state.usuario = usuario
        },
        destroyUser(state){
            state.usuario = null
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
                        const tokens = response.headers['authorization']
                        var a = tokens.split(' ')[1]
                        //var a = tokens.split(' ')[1]
                        localStorage.setItem('access_token', a)

                        localStorage.setItem('access_username', data.username)

                        console.log(response)
                        

                        context.commit('retrieveToken', a)
                        context.commit('retrieveUsername',data.username)
                        //this.LOGOU(true)
                        context.commit("LOGOU", response.url)
                        //console.log(response)
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
        deslogar(context) {
            //Enviar o seguinte código abaixo em uma requisição que precise de token para poder ser acessada.
            //Axios.//http.defaults.headers.common['Authorization'] = 'Bearer ' + context.state.token 
            if (context.getters.isLoggedIn) {
                //takvez colocar num new promise para apagar do backend o token
                //aí colocar as duas linhas no sucesso e no erro
                localStorage.removeItem('access_token')
                localStorage.removeItem('access_username')
                localStorage.removeItem('access_usuario')
                context.commit('destroyToken')
                context.commit('destroyUser')
            }
        },
        cadastrar(context, pessoa) {
            return new Promise((resolve, reject) => {
                http.post("/usuarios", pessoa)
                    .then(response => {
                        resolve(response)
                    })
                    .catch(error => {
                        reject(error)
                    });
            })
        },
        registrarOcorrencia(context, ocorrencia){
            http.defaults.headers.common['Authorization'] = 'Bearer ' + context.state.token 
            return new Promise((resolve, reject) => {
                http.post("/ocorrencias",ocorrencia)
                    .then(response => {
                        resolve(response)
                    })
                    .catch(error => {
                        reject(error)
                    });
            })
        },
        getUsuario(context, email) {
            http.defaults.headers.common['Authorization'] = 'Bearer ' + context.state.token
            return new Promise((resolve, reject) => {
                http.get('/profile',{
                    params:{
                        email: email
                    }
                })
                    .then(response => {
                        localStorage.setItem('access_usuario', JSON.stringify(response.data))
                        context.commit('retrieveUser',response.data)
                        resolve(response)
                    })
                    .catch(error => {
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
            return state.token != null
        },
        getUsername(state) {
            return state.username
        },
        getUser(state) {
            return state.usuario
        }

    }
})