<template>
  <div class="duvidas-wrapper">
    <Navbar/>
  <div id="accordion" class="container mt-4 mb-4">
    <h3 class="mb-5">Dúvidas Frequentes</h3>
    <div class="card mb-2">
      <div class="card-header" id="headingOne">
        <h5 class="mb-0">
          <button
            class="btn btn-link"
            data-toggle="collapse"
            data-target="#collapseOne"
            aria-expanded="true"
            aria-controls="collapseOne"
          >Dúvida 1</button>
        </h5>
      </div>

      <div
        id="collapseOne"
        class="collapse show"
        aria-labelledby="headingOne"
        data-parent="#accordion"
      >
        <div class="card-body">...</div>
      </div>
    </div>
    <div class="card mb-2">
      <div class="card-header" id="headingTwo">
        <h5 class="mb-0">
          <button
            class="btn btn-link collapsed"
            data-toggle="collapse"
            data-target="#collapseTwo"
            aria-expanded="false"
            aria-controls="collapseTwo"
          >Dúvida 2</button>
        </h5>
      </div>
      <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
        <div class="card-body">...</div>
      </div>
    </div>

    <div class="card mb-2">
      <div class="card-header" id="headingThree">
        <h5 class="mb-0">
          <button
            class="btn btn-link collapsed"
            data-toggle="collapse"
            data-target="#collapseThree"
            aria-expanded="false"
            aria-controls="collapseThree"
          >Dúvida 3</button>
        </h5>
      </div>
      <div
        id="collapseThree"
        class="collapse"
        aria-labelledby="headingThree"
        data-parent="#accordion"
      >
        <div class="card-body">...</div>
      </div>
    </div>

    <div class="card mb-2">
      <div class="card-header" id="headingThree">
        <h5 class="mb-0">
          <button
            class="btn btn-link collapsed"
            data-toggle="collapse"
            data-target="#collapseThree"
            aria-expanded="false"
            aria-controls="collapseThree"
          >Dúvida 4</button>
        </h5>
      </div>
      <div
        id="collapseThree"
        class="collapse"
        aria-labelledby="headingThree"
        data-parent="#accordion"
      >
        <div class="card-body">...</div>
      </div>
    </div>

    <div class="card mb-2">
      <div class="card-header" id="headingThree">
        <h5 class="mb-0">
          <button
            class="btn btn-link collapsed"
            data-toggle="collapse"
            data-target="#collapseThree"
            aria-expanded="false"
            aria-controls="collapseThree"
          >Dúvida 5</button>
        </h5>
      </div>
      <div
        id="collapseThree"
        class="collapse"
        aria-labelledby="headingThree"
        data-parent="#accordion"
      >
        <div class="card-body">...</div>
      </div>
    </div>

    <div class="card mb-2">
      <div class="card-header" id="headingThree">
        <h5 class="mb-0">
          <button
            class="btn btn-link collapsed"
            data-toggle="collapse"
            data-target="#collapseThree"
            aria-expanded="false"
            aria-controls="collapseThree"
          >Dúvida 6</button>
        </h5>
      </div>
      <div
        id="collapseThree"
        class="collapse"
        aria-labelledby="headingThree"
        data-parent="#accordion"
      >
        <div class="card-body">...</div>
      </div>
    </div>
  </div>
  </div>
</template>
 
<script>
  import {  mapMutations } from 'vuex';
  import Navbar from "./Navbar.vue";

  export default {
    components: {
      Navbar
    },
      name: "servicos",
      methods: {
        ...mapMutations([
          'NAV_ATIVO'
        ]),
      },
      created(){
        this.NAV_ATIVO('duvidas')
      }
    };    
</script>
 
<style>
#accordion {
  min-height: 500px;
}

.submitform {
  max-width: 400px;
  margin: 0 auto;
}

.logo-brand {
  width: 120px;
}
</style>