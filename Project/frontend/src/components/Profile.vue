<template>
  <div>
    <div class="row no-gutters">
      <div class="col-3 sidebar">
        <Sidebar />
      </div>

      <div class="col-9">
        <NavbarDash />
        <div class="container mt-4">
          <h5 class="mb-4">Perfil do Usuário</h5>
          <div class="row">
            <div class="col-9">
              <div class="row mb-4 mt-4 no-gutters profile-header information">
                <div class="col-4">
                  <img class="w-75" src="../assets/default_user.png" />
                </div>

                <div class="col-2">
                  <h6>Nome:</h6>
                  <h6>Email:</h6>
                  <h6>Cpf:</h6>
                  <h6>Nascimento:</h6>
                  <h6>Contato</h6>
                  <h6>Endereço:</h6>
                </div>

                <div class="col-5">
                  <h6>{{usuario.nome}}</h6>
                  <h6>{{usuario.username}}</h6>
                  <h6>{{usuario.cpf}}</h6>
                  <h6>{{usuario.data_nascimento}}</h6>
                  <h6>{{usuario.password}}</h6>
                </div>
              </div>
            </div>
            <div class="col">
              <div class="card text-white bg-danger mb-3" style="max-width: 18rem;">
                <div class="card-header">Atenção!</div>
                <div class="card-body">
                  <h6 class="card-title">Danger card title</h6>
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
    <Footer/>
  </div>
</template>
 
<script>
import NavbarDash from "./NavbarDashboard.vue";
import Map from "./MapIndex.vue";
import AlertElement from "./dashboard/AlertaElement.vue";
import Sidebar from "./dashboard/SideBar.vue";
import Footer from "./Footer";
import { mapActions, mapGetters } from "vuex";

export default {
  components: {
    NavbarDash,
    Sidebar,
    Footer
    //AlertElement
  },
  name: "logado",
  data() {
    return {
      usuario: {
        username: "",
        password: ""
      },
      //JSON.parse(localStorage.getItem('access_user')),
      submitted: true,
      hoje: ""
    };
  },
  computed: {
    ...mapGetters(["getUser"])
  },
  methods: {
    ...mapActions(["getUsuario"]),
    dataHoje: function() {
      var today = new Date();
      var dd = today.getDate();
      var mm = today.getMonth() + 1; //January is 0!
      var yyyy = today.getFullYear();
      if (dd < 10) {
        dd = "0" + dd;
      }
      if (mm < 10) {
        mm = "0" + mm;
      }
      today = yyyy + "-" + mm + "-" + dd;
      this.hoje = today;
      //return today
    }
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  },
  created() {
    this.usuario = this.getUser;
    this.dataHoje();
    console.log(this.hoje);
  }
};
</script>
 
<style>
.section-profile h6 {
  font-size: 20pt;
}
.content-dash {
  padding: 20px;
}

.profile-header {
  padding: 20px;
  background-color: #f6f6f6;
}

.profile-header .col-4 h6 {
  font-style: normal;
  font-weight: normal;
  color: #393939;
}

.latest-occurences {
  overflow: scroll;
  border: 1px solid #ccc;
  height: 350px;
}

.title-alert-elements {
  font-size: 13pt;
}

.information h6 {
  margin: 0px 0px 25px 0px
}
</style>