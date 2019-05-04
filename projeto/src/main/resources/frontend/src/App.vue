<template>
    <div id="app">
        <nav class="navbar navbar-expand-lg navbar-dark bg-custom">
          <div class="container">
            <a class="navbar-brand" href="/">
              <img class="logo-brand" src="./assets/logo_mylaert.png"/>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Alterna navegação">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <li class="nav-item active">
                  <a class="nav-link" href="/">Página Inicial <span class="sr-only">(Página atual)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Sobre Nós</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Dúvidas Frequentes</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Contato</a>
                </li>
                <li class="active nav-item">
                  <a href="/login" class="nav-link btn btn-danger px-3">Login</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <br/>

        <router-view/>
        <map-index></map-index>
      </div>
      
</template>

<script>
    export default {
      name: "app"
    };
</script>

<style>

    .logo-brand{
      width: 120px;
    }

    .navbar{
      background-color: #01a3a4;
    }
</style>
