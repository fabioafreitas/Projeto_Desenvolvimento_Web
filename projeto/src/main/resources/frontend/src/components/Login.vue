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
                placeholder="Digite seu email"
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
                pattern=".{5,15}"
                title="mínimo de 5, máximo de 15 caracteres"
        >
      </div>
      <div class="form-group">
        <button type="submit" class="btn btn-info">Login</button>
        <a class="float-right" href="/registrar">Esqueceu sua senha?</a>

      </div>

    </form>
  </div>
  </div>
</template>

<script>
import { mapActions, mapMutations } from 'vuex'
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
        username:"",
        password:""
        
      }
    };
  },
  methods: {
    /* eslint-disable no-console */
    /* eslint-enable no-console */
    ...mapActions([
      'logar'
    ]),
    ...mapMutations([
          'NAV_ATIVO'
    ]),
    realizarLogin() {
      this.logar(this.login).then(response => {
        this.enderecoLogin=response.headers.Authorization
        this.booleanLogin=response.data
        this.$router.push('/logado')
      }).catch(error => {
        alert('Usuario ou senhas incorretos.')
      })
    }
  },
  created(){
        this.NAV_ATIVO('login')
      }
};
</script>

<style>

        .login{
          width: 100%;
          min-height: 500px;
          color: #424242;
          padding: 35px;
          border: 1px solid #e5e5e5;
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