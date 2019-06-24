<template>
    <div class="row no-gutters">
      <div class="col-3 sidebar">
        <Sidebar/>
      </div>

      <div class="col-9">
        <NavbarDash/>
        <div class="container">
          <div class="main_head">
            <h3>Bem vindo!</h3>
          </div>
          <div class="row content-dash">
            <div class="map_dashboard">
              <Map/>
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
import { mapGetters } from 'vuex'

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
      usuario: {}
    };
  },
  methods: {
    ...mapGetters([
      'getUser'
    ])
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
  font-size: 16pt;
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

@media (max-width: 850px) and (min-width: 100px){
  .map_dashboard{
  width: 100%;
  height: 300px;
}
}


</style>