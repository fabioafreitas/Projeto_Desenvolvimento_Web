<template>
    <div class="row no-gutters mb-5">
      <div class="col-3 sidebar">
        <Sidebar/>
      </div>

      <div class="col-9">
        <NavbarDash/>
        <div class="container mt-4">
            <h5 class="mb-4">Perfil do Usuário</h5>
              <div class="row">
                <div class="col-9">
                        <div class="row mb-4 mt-4 no-gutters profile-header">
                                <div class="col-4">
                                        <img class="w-75" src="../assets/default_user.png">
                                </div>

                                <div class="col-3">
                                        <h5>Nome: </h5>
                                        <h5>Email: </h5>
                                        <h5>Naturalidade: </h5>
                                        <h5>Endereço: </h5>
                                        <h5>Naturalidade </h5>
                                </div>

                                <div class="col-4">
                                        <h5> {{usuario.username}} </h5>
                                        <h5>  {{usuario.username}} </h5>
                                        <h5>  {{usuario.username}} </h5>
                                        <h5>  {{usuario.password}} </h5>
                                        <h5> {{usuario.password}} </h5>
                                </div>
                        </div>
                        
                        <nav>
                                <div class="nav nav-tabs" id="nav-tab" role="tablist">
                                <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Pessoais</a>
                                <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Profissionais</a>
                                <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Educação</a>
                                </div>
                        </nav>
                        <div class="tab-content" id="nav-tabContent">
                                <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                                        Consequat occaecat ullamco amet non eiusmod nostrud dolore irure incididunt est duis anim sunt officia.
                                        Fugiat velit proident aliquip nisi incididunt nostrud exercitation proident est nisi.
                                        Irure magna elit commodo anim ex veniam culpa eiusmod id nostrud sit cupidatat in veniam ad.
                                        Eiusmod consequat eu adipisicing minim anim aliquip cupidatat culpa excepteur quis.
                                        Occaecat sit eu exercitation irure Lorem incididunt nostrud.
                                </div>
                                <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                                        Consequat occaecat ullamco amet non eiusmod nostrud dolore irure incididunt est duis anim sunt officia.
                                        Fugiat velit proident aliquip nisi incididunt nostrud exercitation proident est nisi.
                                        Irure magna elit commodo anim ex veniam culpa eiusmod id nostrud sit cupidatat in veniam ad.
                                        Eiusmod consequat eu adipisicing minim anim aliquip cupidatat culpa excepteur quis.
                                        Occaecat sit eu exercitation irure Lorem incididunt nostrud.
                                </div>
                                <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
                                        Consequat occaecat ullamco amet non eiusmod nostrud dolore irure incididunt est duis anim sunt officia.
                                        Fugiat velit proident aliquip nisi incididunt nostrud exercitation proident est nisi.
                                        Irure magna elit commodo anim ex veniam culpa eiusmod id nostrud sit cupidatat in veniam ad.
                                        Eiusmod consequat eu adipisicing minim anim aliquip cupidatat culpa excepteur quis.
                                        Occaecat sit eu exercitation irure Lorem incididunt nostrud.
                                </div>
                        </div>

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
import Sidebar from "./dashboard/SideBar.vue";
import { mapActions, mapGetters } from 'vuex';

export default {
  components: {
    NavbarDash,
    Sidebar
    //AlertElement
  },
  name: "logado",
  data() {
    return {
      usuario: JSON.parse(localStorage.getItem('access_user')),

      submitted: true,
      hoje:""
    };
  },
  methods: {
    ...mapActions([
      'getUsuario'
    ]),
    ...mapGetters([
      'getUser'
    ]),
    getData() {
      this.getUsuario(this.usuario.username).then(response => {
        
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

.section-profile h5{
        font-size: 20pt;
}
.content-dash{
  padding: 20px;
}

.profile-header{
        padding:20px;
        background-color: #f6f6f6;
}

.profile-header .col-4 h5{
        font-style: normal;
        font-weight: normal;
        color: #393939;
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


</style>