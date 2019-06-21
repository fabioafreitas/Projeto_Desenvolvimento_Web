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
                        </div> <br>
                          <label for="exampleFormControlSelect1">Selecione uma imagem:</label>
                          <br/>
                            <input 
                              type="file" 
                              multiple
                            >
                            <br/> <br>
                              <label for="exampleFormControlTextarea1">Informe a data:</label> <br>
                              <input 
                                type="date"
                                v-model="ocorrencia.date"
                                required
                                :max="hoje"
                              > <br> <br>
                              <div class="form-group">
                                <label for="exampleFormControlTextarea1">Descreva melhor o ocorrido</label>
                                <textarea 
                                v-model="ocorrencia.descricao"
                                class="form-control" 
                                id="exampleFormControlTextarea1" 
                                rows="3"></textarea>
                              </div>
                              <button class="btn btn-primary">Registrar Ocorrência</button>
                                </form>
                        </div>
                        <div class="col">
                                <div class="card text-white bg-danger mb-3" style="max-width: 18rem;">
                                <div class="card-header"><h4>Avisos</h4></div>
                                <div class="card-body">
                                <h5 class="card-title">Atenção!</h5>
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
import Sidebar from "./dashboard/SideBar.vue";
import { mapActions } from 'vuex';

export default {
  components: {
    NavbarDash,
    Sidebar
    //AlertElement
  },
  name: "logado",
  data() {
    return {
      ocorrencia: {
        cpf: '',
        titulo: '',///////
        descricao: '', //////////
        date: '',///////////
        numero: '',
        endereco: '',
        categoria: '',
        imagens: {}
      },
      submitted: true,
      hoje:""
    };
  },
  methods: {
    ...mapActions([
      'registrarOcorrencia'
    ]),
    cadastroOcorrencia() {
      this.registrarOcorrencia(this.ocorrencia).then(response => {
       alert('Ocorrência registrada com sucesso!')
      })
    },
    dataHoje: function(){
      var today = new Date();
      var dd = today.getDate();
      var mm = today.getMonth()+1; //January is 0!
      var yyyy = today.getFullYear();
      if(dd<10){
         dd='0'+dd
      } 
      if(mm<10){
         mm='0'+mm
      } 
      today = yyyy+'-'+mm+'-'+dd;
      this.hoje=today
      //return today
    }
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  },
  created(){
  this.dataHoje()
  console.log(this.hoje)
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