/* eslint-disable */
<template>
    <div id="main_navbar">
        <nav id="nav_blue" class="navbar navbar-expand-lg navbar-dark bg-custom">
          <div class="container">
            <a class="navbar-brand" href="/">
              <img class="logo" src="../assets/logo_mylaert.png"/>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Alterna navegação">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-start" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <li class="nav-item" :class="{ active: isActive('principal')}">
                  <a class="nav-link" href="/">Página Inicial<span class="sr-only">(Página atual)</span></a>
                </li>
                <li class="nav-item" :class="{ active: isActive('institucional')}">
                  <a class="nav-link" href="/institucional">Institucional</a>
                </li>
                <li class="nav-item" :class="{ active: isActive('duvidas')}">
                  <a class="nav-link" href="/duvidas">Dúvidas Frequentes</a>
                </li>
                <li class="nav-item" :class="{ active: isActive('servicos')}">
                  <a class="nav-link" href="/servicos">Serviços</a>
                </li>
              </ul>
            </div>
            <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <li v-if="!isLoggedIn" class="active nav-item  mr-2">
                  <a href="/login" class="nav-link btn btn-outline-secondary border px-3" 
                  :class="{ 'btn-secondary': isActive('login') }">Login</a>
                </li>
                <li v-if="!isLoggedIn" class="nav-item active">
                  <a class="nav-link btn btn-danger" href="/registrar">Registre-se</a>
                </li>
                <li v-if="isLoggedIn" class="active nav-item  mr-2">
                  <a href="/login" class="nav-link btn btn-outline-dark border px-3">Sair</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </div>
</template>

<script>
    import { mapState, mapGetters, mapMutations } from 'vuex';

    export default {
      name: "navbar",
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

    .logo{
      width: 120px;
    }

    #nav_blue{
      background-color: #2980b9;
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

</style>
