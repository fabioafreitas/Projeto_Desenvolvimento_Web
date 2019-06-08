<template>
    <div class="row no-gutters">
      <div class="col-3 sidebar">
        <Sidebar/>
      </div>

      <div class="col-9">
        <NavbarDash/>
        <div class="container">
          <div class="main_head">
            <button class="btn btn-dark btn-head btn-text">
              <i class="fas fa-1x fa-cloud-rain mr-2"></i>Tempo
            </button>
            <button class="btn btn-dark btn-head btn-text">
              <i class="fas fa-1x fa-wallet mr-2"></i>Crimes
            </button>
            <button class="btn btn-dark btn-head btn-text">
              <i class="fas fa-1x fa-traffic-light mr-2"></i>Acidentes
            </button>
          </div>
          
          <div class="row content-dash">
            <div class="col-8 map_dashboard">
              <Map/>
            </div>

            <div class="col-4 latest-occurences">
              <p class="title-alert-elements mt-1">Alertas Recentes (10)</p>
              <AlertElement/>
              <AlertElement/>
              <AlertElement/>
              <AlertElement/>
              <AlertElement/>
            </div>
          </div>

          <div class="graph">
            <img src="../assets/graph.png">
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

export default {
  components: {
    NavbarDash,
    Map,
    AlertElement,
    Sidebar
  },
  name: "logado",
  data() {
    return {
      usuario: {
        id: 0,
        name: "",
        active: false
      },
      submitted: true
    };
  },
  methods: {
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  }
};
</script>
 
<style scoped>

.btn-dark{
  background-color: #fff;
  border: 1px solid #ccc;
}

.btn-text{
  font-size: 18pt;
  border-radius: 3px;
}

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