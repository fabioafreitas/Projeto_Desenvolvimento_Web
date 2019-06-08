<template>
    <div class="row no-gutters">
      <div class="col-3 sidebar">
        <div class="list-group mx-auto">

          <div class="sidebar-header">
            <a class="navbar-brand" href="/">
              <img class="logo-brand" src="../assets/logo_mylaert_dark.png"/>
            </a>
            <form class="search_dashboard">
              <input type="text" placeholder="Search..">
            </form>
          </div>

          <a href="#" class="list-group-item list-group-item-action">Funcionalidade...</a>
          <a href="#" class="list-group-item list-group-item-action">Funcionalidade...</a>
          <a href="#" class="list-group-item list-group-item-action">Funcionalidade...</a>
          <a href="#" class="list-group-item list-group-item-action">Funcionalidade...</a>
        </div>
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
                          <label for="exampleFormControlSelect1">Selecione uma imagem:</label>
                          <br/>
                            <input 
                              type="file" 
                              multiple
                            >
                            <br/>
                              <label for="exampleFormControlTextarea1">Informe a data:</label>
                              <input 
                                type="date"
                                v-model="ocorrencia.date"
                                required
                              >
                              <div class="form-group">
                                <label for="exampleFormControlTextarea1">Descreva melhor o ocorrido</label>
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                              </div>
                              <button class="btn btn-primary">Registrar Ocorrencia</button>
                                </form>
                        </div>
                        <div class="col">
                                <div class="card text-white bg-danger mb-3" style="max-width: 18rem;">
                                <div class="card-header">Atenção!</div>
                                <div class="card-body">
                                <h5 class="card-title">Danger card title</h5>
                                <p class="card-text">Ao registrar uma ocorrência
                                                você garante que essas informações sejam verdadeiras e que
                                                a falsificação da mesma pode configurar crime de acordo com
                                                a lei 00-00-00</p>
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
import { mapActions } from 'vuex';

export default {
  components: {
    NavbarDash,
   // Map,
    //AlertElement
  },
  name: "logado",
  data() {
    return {
      ocorrencia: {
        cpf: "123",
        titulo:"",
        date:"",
        numero:"",
        endereco:"Rua 2 irmaos",
        categoria:"Enchente",
        imagens:null
      },
      submitted: true
    };
  },
  methods: {
    ...mapActions([
      'registrarOcorrencia'
    ]),
    cadastroOcorrencia() {
      this.registrarOcorrencia(this.ocorrencia).then(response => {
       
      })
    }
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  }
};
</script>
 
<style>

.logo-brand{
width: 160px;
margin: 10px;

}

.map_dashboard{
  width: 600px;
  height: 350px;
}

.content-dash{
  padding: 20px;
}

.search_dashboard input{
  width: 250px;
  height: 30px;
  padding-left: 10px;
  padding-right: 10px;
  border: 1px solid #cecece;
  border-radius: 40px;
}

.search_dashboard input:focus{
  outline: none;

}

.latest-occurences{
  overflow: scroll;
  border: 1px solid #ccc;
  height: 350px;
}

.title-alert-elements{
  font-size: 13pt;
}

.graph img{
  width: 100%;
}

</style>