<template>
  <div class="login submitform col-auto mt-4 mb-5">
    <div v-if="!submitted">
        <h2 class="text-center mb-5">Entrar no MyAlert</h2>

      <div class="form-group">
        <label for="email">Email do usuário</label>
        <input
          type="text"
          placeholder="Digite seu email..."
          class="form-control"
          id="email-usuario"
          required
          name="email"
        >
      </div>

      <div class="form-group">
        <label for="senha">Senha do usuário</label>
        <input
          type="password"
          placeholder="******"
          class="form-control"
          id="senha-usuario"
          required
          name="senha"
        >
      </div>
      <button class="btn btn-info" v-on:click="submitted=true" href="/logado">Entrar</button>
        <a class="float-right" href="/registrar">Esqueceu sua senha?</a>
    </div>

    <div v-else>
        
      <h4>Usuário logado...!</h4>
    </div>
  </div>
</template>
 
<script>
export default {
  name: "login",
  data() {
    return {
      usuario: {
        id: 0,
        name: "",
        active: false
      },
      submitted: false
    };
  },
  methods: {
    /* eslint-disable no-console */
    /* eslint-enable no-console */
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