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
                  src="imagens/samu-logo.png"
                  alt="logo"
                  style="max-width:60%; padding: 10%"
                >
              </a>
            </div>
          </div>
        </header>
        <button class="btn btn-primary" @click="getOcorrencias()">getOcorrencias</button>
        <table class="table table-hover">
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
  name: "samu",
  data() {
    return {
      uri: 'http://localhost:9999',
      ocorrencias: []
    };
  },
  methods: {
    getOcorrencias() {
      axios.get(this.uri+'/bombeiros').then(response => {
        this.ocorrencias = response.data
      })
    }
  },
  mounted() {
    axios.get(this.uri+'/bombeiros').then(response => {
        this.ocorrencias = response.data
      })
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
