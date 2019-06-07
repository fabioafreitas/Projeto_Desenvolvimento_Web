<template>
  <div class="signup-wrapper">
    <Navbar/>
    <div class="submitform mt-4 mb-5 col-4">
      <div v-if="!submitted">
        <h2 class="text-center mb-5">Registre-se no MyAlert</h2>
        <form action="#" @submit.prevent="realizarCadastro">
          <div class="form-group">
            <label for="nome_completo">Nome completo</label>
            <input
              v-model="usuario.nome"
              type="text"
              placeholder="Digite seu Nome..."
              class="form-control"
              id="email-usuario"
              required
              name="nome_completo"
            >
          </div>

          <div class="form-group">
            <label for="numero_cpf">CPF</label>
            <input
              v-model="usuario.cpf"
              type="text"
              placeholder="Digite seu CPF..."
              class="form-control"
              id="email-usuario"
              required
              name="numero_cpf"
            >
          </div>

          <div class="form-group">
            <label for="email">Email</label>
            <input
              v-model="usuario.username"
              type="text"
              placeholder="Digite seu email..."
              class="form-control"
              id="email-usuario"
              required
              name="email"
            >
          </div>

          <div class="form-group">
            <label for="senha">Senha</label>
            <input
              v-model="usuario.password"
              type="password"
              placeholder="******"
              class="form-control"
              id="senha-usuario"
              required
              name="senha"
            >
          </div>

          <div class="form-group">
            <label for="confirmacao_senha">Confirmar senha</label>
            <input
              v-model="usuario.confirm"
              v-on:input="compararSenha"
              type="password"
              placeholder="******"
              class="form-control"
              id="senha-usuario"
              required
              name="confirmacao_senha"
            >
          </div>

          <button type="submit" class="btn btn-danger px-2">Registrar</button>
          <a class="float-right" href="/login">Já possui uma conta? Entre aqui!</a>
        </form>
      </div>

      <div v-else>
        <h4>Usuário cadastrado...!</h4>
      </div>
    </div>
  </div>
</template>
 
<script>
import Navbar from "./Navbar.vue";
import { mapMutations, mapActions } from "vuex";

export default {
  components: {
    Navbar
  },
  name: "login",
  data() {
    return {
      usuario: {
        //id: 0,
        nome: "",
        cpf: "",
        username: "",
        password: ""
        //active: false
      },
      confirm: "",
      submitted: false
    };
  },
  methods: {
    ...mapActions(["cadastrar"]),
    realizarCadastro() {
      this.cadastrar(this.usuario).then(response => {
        this.$router.push("/login");
      });
    }
    //this.$store.actions.cadastrar
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  },

  computed: {
    compararSenha() {
      if (this.usuario.password == this.confirm) {
        if (this.usuario.password != "") {
          alert("Senhas iguais!");
        }
      } else {
        //alert("As senhas não conferem!")
      }
    }
  }
};
</script>
 
<style>
.submitform {
  max-width: 400px;
  margin: auto;
  color: #424242;
}

.logo-brand {
  width: 120px;
}
</style>
