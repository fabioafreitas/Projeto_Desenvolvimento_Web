/* eslint-disable */
<template>
    <div id="app">
        <router-view/>
        <Footer/>
      </div>
</template>

<script>
    import Footer from "./components/Footer.vue";
    import Navbar from "./components/Navbar.vue";
    import { mapState, mapGetters, mapMutations } from 'vuex';
    // Módulo principal. Todo o projeto é um Single Page App.
    // O arquivo main.js renderiza essa módulo por meio da id "App"
    // Para simular multiplas páginas é usado o router do Vue.JS e a partir do router é possível
    // acessar outras páginas que estão modularizadas em componentes na pasta components.
    
    export default {
      components: {
        Footer,
        Navbar
      },
      name: "app",
      data(){
        return {
          active: this.isActive
        }
      },
      computed: {
        ...mapState([
          'navActive'
        ]),
        ...mapGetters([
          'isActive', 'isLoggedIn'
        ])
      },
      methods: {
        ...mapMutations([
          'NAV_ATIVO'
        ]),
        setActive: function(menuItem){
          this.NAV_ATIVO(menuItem)
        }
      }
    };    
</script>

<style>

    .logo-brand{
      width: 120px;
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
