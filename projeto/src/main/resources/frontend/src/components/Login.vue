<template>
  <div class="login-wrapper">
    <Navbar/>
  <div class="login submitform col-4 mt-4 mb-5">
    <h2 class="text-center mb-5">Entrar no MyAlert</h2>
    <form action="#" @submit.prevent="realizarLogin">


      <div class="form-group">
        <label for="email-usuario">Email do usuário</label>
        <input
                type="text"
                placeholder="Digite seu email..."
                class="form-control"
                id="email-usuario"
                required
                name="email"
                v-model="login.username"
        >
      </div>

      <div class="form-group">
        <label for="senha-usuario">Senha do usuário</label>
        <input
                type="password"
                placeholder="******"
                class="form-control"
                id="senha-usuario"
                required
                name="senha"
                v-model="login.password"
        >
      </div>
      <div class="form-group">
        <button type="submit" class="btn btn-info">Login</button>
                           <!--<form v-bind:action="enderecoLogin"></form>
          <input type="submit" value="Entrar" class="btn btn-info" v-on:click="realizarLogin">-->
        <a class="float-right" href="/registrar">Esqueceu sua senha?</a>

      </div>

    </form>
  </div>
  </div>
</template>

<script>
//import Login from '../services/login'
import { mapMutations, mapActions } from 'vuex'
import Navbar from "./Navbar.vue";

export default {
  components: {
    Navbar
  },
  name: "login",
  data() {
    return {
      enderecoLogin: "#",
      booleanLogin: false,
      error: "",
      login: {
        //id:"",
        username:"",
        password:""
      }
    };
  },
  methods: {
    /* eslint-disable no-console */
    /* eslint-enable no-console */
    ...mapMutations([
       'LOGOU'
    ]),
    ...mapActions([
      'logar'
    ]),
    realizarLogin() {
      this.logar(this.login).then(response => {
        this.enderecoLogin=response.headers.Authorization
        this.booleanLogin=response.data
        this.$router.push('/logado')
      })

      /*Login.realizarLogin(this.login).then(resposta => {

        this.booleanLogin = resposta.data
        if(this.booleanLogin) {
          //this.LOGOU(booleanLogin)
          this.LOGOU(true)
          this.$router.push('/logado')
          //this.enderecoLogin = "/logado"
        }
      }).catch(e => {
        this.error = e.response.data.errorMessage
      })*/
    }
  }
};
</script>
 
<style>

        .login{
          width: 100%;
          min-height: 500px;
          color: #424242;
        }

        .submitform {
                max-width: 400px;
                margin: auto;
        }

        .logo-brand{
                width: 120px;
        }

        button{
          background-color: #01a3a4;
        }
</style>