<template>
    <div class="row no-gutters">
      <div class="d-flex col-3 sidebar justify-content-center">
        <div class="list-group">
          <div class="sidebar-header">
            <a class="navbar-brand" href="/">
              <img class="logo-brand mx-auto d-bloc" src="../assets/logo_mylaert_dark.png"/>
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
        <div class="container">
          <div class="main_head">
            <button class="btn btn-dark btn-head btn-main">Registrar Ocorrência</button>
            <button class="btn btn-dark btn-head">Funcionalidade2</button>
            <button class="btn btn-dark btn-head">Funcionalidade3</button>
          </div>
          
          <div class="row content-dash">
            <div class="col-8 map_dashboard">
              <Map/>
            </div>

            <div class="col-4 latest-occurences">
              
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

export default {
  components: {
    NavbarDash,
    Map
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
  padding-left: 10px;
  padding-right: 10px;
  border: 1px solid #cecece;
  border-radius: 40px;
}

.search_dashboard input:focus{
  outline: none;

}

.latest-occurences{
  border: 1px solid #ccc;
}

</style>