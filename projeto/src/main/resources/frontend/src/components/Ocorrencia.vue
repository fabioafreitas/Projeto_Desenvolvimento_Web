<template>
  <div class="row no-gutters">
    <div class="col-3 sidebar">
      <Sidebar/>
    </div>

    <div class="col-9">
      <NavbarDash/>
      <div class="container mt-4">
        <h5 class="mb-4">Registrar Ocorrência</h5>
        <div class="row">
          <div class="col-9">
            <form action="#" @submit.prevent="cadastroOcorrencia" class="form_ocorrencia mb-4">
              <div class="form-row">
                <div class="col">
                  <input
                    type="text"
                    class="form-control"
                    v-model="ocorrencia.titulo"
                    placeholder="Título da Ocorrência"
                    required
                  >
                </div>
              </div>
              <br>
              <div class="row">
                <div class="col-5">
                  <label for="exampleFormControlSelect1">Selecione as imagens:</label>
                  <br>
                  <input type="file" multiple>
                </div>
                <div class="col-2"></div>
                <div class="col-5">
                  <label for="exampleFormControlTextarea1">Informe a data:</label>
                  <br>
                  <input type="date" v-model="ocorrencia.dataOcorrencia" required :max="hoje">
                </div>
              </div>
              <br>
              <div class="row">
                <div class="col-4">
                  <label for="exampleFormControlUrgencia1">Grau de urgência:</label>
                  <br>
                  <select class="custom-select" v-model="ocorrencia.urgencia">
                      <option 
                      v-for="urgencia in urgencias" 
                      v-bind:value="urgencia[0]"
                      :key="urgencia.key"
                      >{{urgencia[1]}}</option>
                  </select>
                </div>
                <div class="col-3"></div>
                <div class="col-4">
                  <label for="exampleFormControlCategoria1">Selecione o orgão:</label>
                  <br>
                  <select class="custom-select" v-model="ocorrencia.categoria" >
                      <option 
                      v-for="categoria in categorias" 
                      v-bind:value="categoria[0]"
                      :key="categoria.key"
                      >{{categoria[1]}}</option>
                  </select>
                </div>
                <div class="col-2"></div>
              </div>
              <br>
              <div class="form-group">
                <label for="exampleFormControlTextarea1">Descreva melhor o ocorrido</label>
                <textarea
                  v-model="ocorrencia.descricao"
                  class="form-control"
                  id="exampleFormControlTextarea1"
                  rows="3"
                ></textarea>
              </div>
              <button class="btn btn-primary">Registrar Ocorrência</button>
            </form>
          </div>
          <div class="col">
            <div class="card text-white bg-danger mb-3" style="max-width: 18rem;">
              <div class="card-header">
                <h4>Avisos</h4>
              </div>
              <div class="card-body">
                <h5 class="card-title">Atenção!</h5>
                <p class="card-text">
                  Ao registrar uma ocorrência
                  você garante que essas informações sejam verdadeiras e que
                  a falsificação da mesma pode configurar crime de acordo com
                  a lei 00-00-00
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--</div>
  </div>-->
</template>
 
<script>
import NavbarDash from "./NavbarDashboard.vue";
import Map from "./MapIndex.vue";
import AlertElement from "./dashboard/AlertaElement.vue";
import Sidebar from "./dashboard/SideBar.vue";
import { mapActions, mapGetters } from "vuex";

export default {
  components: {
    NavbarDash,
    Sidebar
    //AlertElement
  },
  name: "logado",
  data() {
    return {
      urgencias: [
        ["URGENTE", "Urgente"],
        ["ALTA", "Alta"],
        ["NORMAL", "Normal"],
        ["BAIXA", "Baixa"],
        ["MINIMA", "Mínima"]
      ],
      categorias: [
        [1, "Apac"],
        [2, "Bombeiros"],
        [3, "Defesa Cívil"],
        [4, "Samu"]
      ],
      ocorrencia: {
        cpf: "",
        titulo: "",
        descricao: "",
        dataCriacao: "", //dd-MM-yyyy hh:mm:ss
        dataOcorrencia: "", //dd-MM-yyyy
        urgencia: "",
        endereco: null, // TODO geolocalização
        categoria: "",
        imagens: null // TODO enviar as imagens
      },
      submitted: true,
      hoje: ""
    };
  },
  methods: {
    ...mapActions(["registrarOcorrencia"]),
    cadastroOcorrencia() {
      this.dataCriacaoOcorrencia
      this.registrarOcorrencia(this.ocorrencia).then(response => {
        alert(response.data);
      });
    }
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  },
  computed: {
    ...mapGetters([
      'getUser'
    ]),
    dataCriacaoOcorrencia: function() {
      var today = new Date();
      var dd = today.getDate();
      var mm = today.getMonth() + 1; //January is 0!
      var yyyy = today.getFullYear();
      var hh = today.getHours();
      var min = today.getMinutes();
      var ss = today.getSeconds();
      if (dd < 10) dd = "0" + dd;
      if (mm < 10) mm = "0" + mm;
      if (hh < 10) hh = "0" + hh;
      if (min < 10) min = "0" + min;
      if (ss < 10) ss = "0" + ss;
      this.ocorrencia.dataCriacao = "" +dd+ "-" +mm+ "-" +yyyy+ " " +hh+ ":" +min+ ":" +ss+ "";
    },
    dataHoje: function() {
      var today = new Date();
      var dd = today.getDate();
      var mm = today.getMonth() + 1; //January is 0!
      var yyyy = today.getFullYear();
      if (dd < 10) dd = "0" + dd;
      if (mm < 10) mm = "0" + mm;
      today = yyyy + "-" + mm + "-" + dd;
      this.hoje = today;
    }
  },
  created() {
    this.ocorrencia.cpf = this.getUser.cpf
    this.dataHoje;
    console.log(this.hoje);
  }
};
</script>
 
<style>
.logo-brand {
  width: 160px;
  margin: 10px;
}

.map_dashboard {
  width: 600px;
  height: 350px;
}

.content-dash {
  padding: 20px;
}

.search_dashboard input {
  width: 200px;
  height: 30px;
  padding-left: 10px;
  padding-right: 10px;
  border: 1px solid #cecece;
  border-radius: 4px;
}

.search_dashboard input:focus {
  outline: none;
}

.latest-occurences {
  overflow: scroll;
  border: 1px solid #ccc;
  height: 350px;
}

.title-alert-elements {
  font-size: 13pt;
}

.graph img {
  width: 100%;
}
</style>