<template>
  <div class="submitform mb-5 col-auto">
    <div v-if="!submitted">
      <h2 class="text-center mb-5">Usuário</h2>
      <button class="btn btn-success px-2">Registrar</button>
      <a class="float-right" href="/login">Já possui uma conta? Entre aqui!</a>
    </div>

    <div v-else>
      <h4>Usuário cadastrado...!</h4>
    </div>
  </div>
</template>
 
<script>
export default {
  name: "logado",
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

.logo-brand {
  width: 120px;
}
</style>