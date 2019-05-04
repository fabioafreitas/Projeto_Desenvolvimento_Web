<template>
  <div class="submitform">
    <div v-if="!submitted">
        <div class="form-group">
          <label for="nome">Nome do Usuário</label>
          <input type="text" class="form-control" id="nome" required v-model="usuario.nome" name="nome">
        </div>
        <button v-on:click="saveUsuario" class="btn btn-success">Cadastrar</button>
    </div>
    
    <div v-else>
      <h4>Usuário M1L GR4US cadastrado!</h4>
    </div>
  </div>
</template>
 
<script>
  import http from "../http-common";
  
  export default {
    name: "add-usuario",
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
      saveUsuario() {
        var data = {
          name: this.usuario.nome,
        };
  
        http
          .post("/usuario", data)
          .then(response => {
            this.usuario.id = response.data.id;
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          });
  
        this.submitted = true;
      }
      /* eslint-enable no-console */
    }
  };
</script>
 
<style>
.submitform {
  max-width: 400px;
  margin: auto;
}
</style>