<template>
  <div class="login submitform col-auto mt-4 mb-5">
    <h2 class="text-center mb-5">Entrar no MyAlert</h2>

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

    <form v-bind:action="enderecoLogin">
      <input type="submit" value="Entrar" class="btn btn-info" v-on:click="realizarLogin">
      <a class="float-right" href="/registrar">Esqueceu sua senha?</a>
    </form>
  </div>
</template>

<script>
import Login from '../services/login'
export default {
  name: "login",
  data() {
    return {
      enderecoLogin: "#",
      booleanLogin: false,
      error: "",
      login: {
        id:"",
        username:"",
        password:""
      }
    };
  },
  methods: {
    /* eslint-disable no-console */
    /* eslint-enable no-console */
    realizarLogin() {
      Login.realizarLogin(this.login).then(resposta => {
        this.booleanLogin = resposta.data
        if(this.booleanLogin) {
          this.enderecoLogin = "/logado"
        }
      }).catch(e => {
        this.error = e.response.data.errorMessage
      })
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