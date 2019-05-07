<template>
  <div class="submitform col-auto">
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
      <button class="btn btn-danger" v-on:click="submitted=true">Entrar</button>
      <a class="float-right" href="#">Esqueceu sua senha?</a>
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
        .submitform {
                max-width: 400px;
                margin: auto;
        }

        .logo-brand{
                width: 120px;
        }
</style>