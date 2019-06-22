<template>
  <div>
    <div class="container lay-site-shadow" style="height:700px">
      <div class="lay-site">
        <header class="lay-header">
          <div class="row justify-content-center">
            <div class="col text-center">
              <a class="navbar-brand" href="/">
                <img
                  class="img-fluid"
                  src="imagens/logo.png"
                  alt="logo"
                  style="max-width:200%; padding: 10%"
                >
              </a>
              <a class="navbar-brand" href="#">
                <img
                  class="img-fluid"
                  src="imagens/bombeiros-logo.png"
                  alt="logo"
                  style="max-width:60%; padding: 10%"
                >
              </a>
            </div>
          </div>
        </header>
        <table class="table table-hover text-center">
          <thead class="thead-info">
            <tr>
              <th style="width:15%">CPF</th>
              <th style="width:15%">TÍTULO</th>
              <th style="width:30%">DESCRIÇÃO</th>
              <th style="width:15%">DATA</th>
              <th style="width:15%">URGÊNCIA</th>
              <th style="width:10%">CATEGORIA</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="ocorrencia of ocorrencias" :key="ocorrencia.key">
              <td>{{ ocorrencia.cpf }}</td>
              <td>{{ ocorrencia.titulo }}</td>
              <td>{{ ocorrencia.descricao }}</td>
              <td>{{ ocorrencia.data }}</td>
              <td>{{ ocorrencia.urgencia }}</td>
              <td>{{ ocorrencia.categoria }}</td>
            </tr>
          </tbody>
        </table>
        <div class="lay-main-bg"></div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: "bombeiros",
  data() {
    return {
      //uri: 'http://localhost:9997/bombeiros',
      uri: 'https://orgao-bombeiros-api.herokuapp.com/bombeiros',
      ocorrencias: []
    };
  },
  mounted() {
    axios.get(this.uri).then(response => {
        this.ocorrencias = response.data
      })
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
