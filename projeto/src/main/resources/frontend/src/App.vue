/* eslint-disable */
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
            <div class="collapse navbar-collapse justify-content-start" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <li class="nav-item active">
                  <a class="nav-link" href="/">Página Inicial <span class="sr-only">(Página atual)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/institucional">Institucional</a>
                </li>
                <li class="nav-item" >
                  <a class="nav-link" href="/duvidas">Dúvidas Frequentes</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/servicos">Serviços</a>
                </li>
              </ul>
            </div>
            <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <li class="active nav-item  mr-2">
                  <a href="/login" class="nav-link btn rounded-pill btn-outline-dark border px-3">Login</a>
                </li>
                <li class="nav-item active">
                  <a class="nav-link btn btn-danger" href="/registrar">Registre-se</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <router-view/>
        <Footer/>

      </div>
</template>

<script>
    import Footer from "./components/Footer.vue";
    import Index from "./components/Index.vue";
    // Módulo principal. Todo o projeto é um Single Page App.
    // O arquivo main.js renderiza essa módulo por meio da id "App"
    // Para simular multiplas páginas é usado o router do Vue.JS e a partir do router é possível
    // acessar outras páginas que estão modularizadas em componentes na pasta components.
    
    export default {
      components: {
        Footer
      },
      name: "app"
    };    
</script>

<style>

    .logo-brand{
      width: 120px;
    }

    .navbar{
      background-color: #2980b9;
    }

    .about{
      font-size: 13pt;
      width: 100%;
      color: #414141;
      background-color: aliceblue;
    }

    .icon-small{
      transition-duration: .6s;
      padding-top: 35%;
      width: 250px;
    }

    .icon-small:hover{
      transition-duration: .6s;
      padding-top: 30%;
      width: 270px;
    }

    .icon-small-2{
      position: relative;
      top: 50px;
      width: 500px;
    }

    .icon-med{
      width: 550px;
    }

    .p-section-icon{
      width: 500px;
    }

    .video-section{
      width: 100%;
      height: 500px;
      background-image: url("./assets/favela.jpg");
      background-size: cover;
      background-repeat: no-repeat;
    }

    .video-section h2{
      color: aliceblue;
    }

    .title-section{
      width: 500px;
    }

    .info-section{
      width: 100%;
      height: 400px;
      font-size: 13pt;
      color: #414141;
      background-color: aliceblue;
    }

    .callback-section{
      width: 100%;
      height: 100px;
      color: #414141;
      background-color: #d1ccc0;
    }

</style>
