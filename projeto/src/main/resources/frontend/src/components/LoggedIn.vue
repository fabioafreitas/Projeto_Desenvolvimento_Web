<template>
  <div class="container">
    <div class="row">
      <div class="col-2">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  id="navbarDropdownMenuLink"
                  role="button"
                  data-toggle="dropdown"
                  aria-haspopup="true"
                  aria-expanded="false"
                >Menu</a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                  <a class="dropdown-item" href="#"> [username]</a>
                  <a class="dropdown-item" href="#"> [...] </a>
                  <a class="dropdown-item" href="#"> [...] </a>
                  <br>
                  <br>
                  <br> 
                  <br> [emailuser]
                  <br>
                  <button type="button" class="btn btn-danger">LOGOUT</button>
                </div>
              </li>
            </ul>
          </div>
        </nav>
      </div>

      <div class="col-3">
        <div class="card" style="width: 18rem;">
          <img
            src="../assets/enchentes.png"
            class="card-img-top"
            alt="..."
            width="150"
            height="150"
          >
          <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <p
              class="card-text"
            >Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="#" class="btn btn-primary">Acessar</a>
          </div>
        </div>
      </div>
      <div class="col-3">
        <div class="card" style="width: 18rem;">
          <img src="../assets/user.png" class="card-img-top" alt="..." width="150" height="150">
          <div class="card-body">
            <h5 class="card-title">Card title</h5>
            <p
              class="card-text"
            >Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="#" class="btn btn-primary">Acessar</a>
          </div>
        </div>
      </div>

      <div class="col-4">
        <br>
        <center>feed noticias (?)</center>
      </div>
    </div>
  </div>
  <!--</div>
  </div>-->
</template>
 
<script>
export default {
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
.submitform {
  max-width: 400px;
  margin: auto;
}

.logo-brand {
  width: 120px;
}
</style>