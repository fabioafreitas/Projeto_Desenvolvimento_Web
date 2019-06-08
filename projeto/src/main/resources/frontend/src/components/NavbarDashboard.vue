/* eslint-disable */
<template>
    <div id="main_navbar">
        <nav id="nav_white" class="navbar navbar-expand-lg navbar-light">
          <div class="container">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Alterna navegação">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-start" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <select class="custom-select custom-select">
                  <option selected>Filtrar Painel</option>
                  <option value="1">Deslizamentos</option>
                  <option value="2">Enchentes</option>
                  <option value="3">Incêndio</option>
                </select>
              </ul>
            </div>

            <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link" href="/perfil">Usuario Atual</a>
                </li>
                  <a class="nav-link" href="/servicos"><img class="img_profile" src="../assets/default_user.png"/></a>
                  <form action="/login">
                  <button @click="sair" class="btn btn-primary">Sair</button>
                  </form>
              </ul>
            </div>
            
          </div>
        </nav>
      </div>
</template>

<script>
    import { mapState, mapGetters, mapActions } from 'vuex';

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
        ]),
        ...mapActions([
          'deslogar'
        ])
      },
      methods: {
        sair() {
          this.deslogar()
          this.$router.push('/login')
        }
      }
    };    
</script>

<style scoped>

#nav_white{
  margin-top: 5px;
  margin-bottom: 5px;
  width: 100%;
  background-color: #fff;
}

.img_profile{
  width: 45px;
  border-radius: 50%;
}

.nav-item{
  padding-top: 7px;
}
</style>
