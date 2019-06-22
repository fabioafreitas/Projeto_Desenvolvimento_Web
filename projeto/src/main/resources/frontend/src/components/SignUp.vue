<template>
  <div class="signup-wrapper">
    <Navbar/>
    <div class="signup submitform mt-4 mb-5 col-4">
        <h2 class="text-center mb-5">Registre-se no MyAlert</h2>
        <form action="#" @submit.prevent="realizarCadastro">
          <div class="form-group">
            <label for="nome_completo">Nome completo</label>
            <input
              v-model="usuario.nome"
              type="text"
              placeholder="Digite seu Nome"
              class="form-control"
              id="email-usuario"
              required
              name="nome_completo"
              v-on:blur="checkNomeValido"
            >
          </div>

          <div class="form-group">
            <label for="numero_cpf">CPF</label>
            <input
              v-model="usuario.cpf"
              type="text"
              placeholder="Digite seu CPF"
              class="form-control"
              id="email-usuario"
              required
              name="numero_cpf"
              pattern=".{11,11}"
              maxlength="11"
              title="o cpf deve possuir 11 dígitos"
              v-on:blur="checkCpfValido"
            >
          </div>

          <div class="form-group">
            <label for="email">Email</label>
            <input
              v-model="usuario.username"
              type="email"
              placeholder="Digite seu email"
              class="form-control"
              id="email-usuario"
              required
              name="email"
              v-on:blur="checkEmailValido"
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
              pattern=".{5,15}"
              required
              name="senha"
              title="mínimo de 5, máximo de 15 caracteres"
              :class="{'border border-success': confirmada}"
            >
          </div>

          <div class="form-group">
            <label for="confirmacao_senha">Confirmar senha</label>
            <input
              v-model="confirm"
              v-on:blur="compararSenha"
              type="password"
              placeholder="******"
              class="form-control"
              id="senha-usuario"
              pattern=".{5,15}"
              required
              name="confirmacao_senha"
              title="mínimo de 5, máximo de 15 caracteres"
              :class="{'border border-success': confirmada}"
            >
          </div>

          <button type="submit" class="btn btn-danger px-2">Registrar</button>
          <a class="float-right" href="/login">Já possui uma conta? Entre aqui!</a>
        </form>
      
    </div>
  </div>
</template>

<script>
import Navbar from "./Navbar.vue";
import { mapActions } from "vuex";

export default {
  components: {
    Navbar
  },
  name: "login",
  data() {
    return {
      usuario: {
        nome: "",
        cpf: "",
        username: "",
        password: ""
      },
      confirm: "",
      confirmada: false
    };
  },
  methods: {
    ...mapActions(["cadastrar"]),
    realizarCadastro() {
      this.cadastrar(this.usuario).then(response => {
        alert('Usuário cadastrado com sucesso!')
        this.$router.push("/login");
      });
    },
    checkCpfValido: function() {
      if(isNaN(this.usuario.cpf)){
        alert('Digite um CPF válido!')
        this.usuario.cpf=""
        return false
      }
      return true
    },
    checkNomeValido: function() {
      var regex= /^(?![\s.]+$)[a-zA-Z\s.]*$/;
      if (!this.usuario.nome.match(regex))
      {
          alert("Nomes não podem ter números!");
          return false;
      }
    },
    checkEmailValido: function() {
      var regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,24}))$/;
      if (!this.usuario.username.match(regex)) {
        alert("Email inválido");
        return false;
      }
    }
    //this.$store.actions.cadastrar
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  },

  computed: {
    compararSenha: function() {
      if (this.usuario.password == this.confirm) {
        if (this.usuario.password != "") {
          this.confirmada = true
        }
      } else {
        alert("As senhas não conferem!")
        this.confirmada=false
        return false
      }
    }
  }
};
</script>

<style>

.signup{
  padding: 35px;
  border: 1px solid #e5e5e5;
}

.submitform {
  max-width: 400px;
  margin: auto;
  color: #424242;
}

.logo-brand {
  width: 120px;
}
</style>
