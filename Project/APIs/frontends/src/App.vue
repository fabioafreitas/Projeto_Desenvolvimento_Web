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

  export default {
    name: 'app'
  }
</script>

<style>
</style>
