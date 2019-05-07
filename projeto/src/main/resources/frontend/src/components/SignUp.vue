<template>
  <div class="submitform mb-5 col-auto">
    <div v-if="!submitted">
      <h2 class="text-center mb-5">Registre-se no MyAlert</h2>

      <div class="form-group">
        <label for="nome_completo">Nome completo</label>
        <input
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
          type="password"
          placeholder="******"
          class="form-control"
          id="senha-usuario"
          required
          name="confirmacao_senha"
        >
      </div>

      <button class="btn btn-danger px-2">Registrar</button>
      <a class="float-right" href="/login">Já possui uma conta? Entre aqui!</a>
    </div>

    <div v-else>
      <h4>Usuário cadastrado...!</h4>
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

.logo-brand {
  width: 120px;
}
</style>