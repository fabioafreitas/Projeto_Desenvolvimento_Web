<template>
  <div id="app">
    <div class="lay-barra"></div>
    <div class="lay-all">
      <div class="row">
        <a class="nav-link" href="/apac">Apac</a>
        <a class="nav-link" href="/bombeiros">Bombeiros</a>
        <a class="nav-link" href="/codecipe">Codecipe</a>
        <a class="nav-link" href="/samu">Samu</a>
        </div>
      <router-view/>
    </div>
  </div>
</template>

<script>
  import Apac from './components/Apac.vue';
  import Bombeiros from './components/Bombeiros.vue';
  import Codecipe from './components/Codecipe.vue';
  import Samu from './components/Samu.vue';
  

  export default {
    components: {
      Apac,
      Bombeiros,
      Codecipe,
      Samu
    },
    name: 'app',
    data() {
      return {

      }
    }
  }
</script>

<style>
</style>
