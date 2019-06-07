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
                                <form class="form_ocorrencia mb-4">
                                        <div class="form-row">
                                        <div class="col">
                                        <input type="text" class="form-control" placeholder="First name">
                                        </div>
                                        <div class="col">
                                        <input type="text" class="form-control" placeholder="Last name">
                                        </div>
                                        </div>

                                        <div class="form-group">
                                        <label for="exampleFormControlInput1">Endereço de email</label>
                                        <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="nome@exemplo.com">
                                        </div>
                                        <div class="form-group">
                                        <label for="exampleFormControlSelect1">Select de exemplo</label>
                                        <select class="form-control" id="exampleFormControlSelect1">
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                        <label for="exampleFormControlSelect2">Exemplo de select múltiplo</label>
                                        <select multiple class="form-control" id="exampleFormControlSelect2">
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                        </select>
                                        </div>
                                        <div class="form-group">
                                        <label for="exampleFormControlTextarea1">Exemplo de textarea</label>
                                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                                        </div>
                                        <button class="btn btn-primary">Registrar Ocorrencai</button>
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

export default {
  components: {
    NavbarDash,
    Map,
    AlertElement
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