<template>
  <div class="duvidas-wrapper">
    <Navbar></Navbar>
    <PageHeader :duvProps="pageHeader"></PageHeader>

    <div class="container">
      <div class="no-gutters row">
        <div class="col-4">
          <div class="card mt-4" style="width: 18rem;">
            <img class="card-img-top" src="../assets/favela.jpg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Card title</h5>
              <p
                class="card-text"
              >Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            </div>
            <ul class="list-group list-group-flush">
              <li class="list-group-item">Cras justo odio</li>
              <li class="list-group-item">Dapibus ac facilisis in</li>
              <li class="list-group-item">Vestibulum at eros</li>
            </ul>
          </div>
        </div>

        <div class="col-8">
          <div id="accordion" class="container mt-4 mb-4">
            <div class="alert alert-secondary" role="alert"><h2><b><center>DÚVIDAS FREQUENTES</center></b></h2></div>
            <div class="card mb-2">
              <div class="card-header" id="headingOne">
                <h5 class="mb-0">
                  <button
                    class="btn btn-link"
                    data-toggle="collapse"
                    data-target="#collapseOne"
                    aria-expanded="true"
                    aria-controls="collapseOne"
                  >
                    <b>Qual tipo de ocorrência posso registrar pelo MyAlert?</b>
                  </button>
                </h5>
              </div>

              <div
                id="collapseOne"
                class="collapse"
                aria-labelledby="headingOne"
                data-parent="#accordion"
              >
                <div class="card-body">
                  Ocorrências de que envolvam áreas de risco de desastres naturais como
                  deslizamento, alagamentos.
                </div>
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
                  >
                    <b>Posso registrar uma ocorrência sem ter cadastro?</b>
                  </button>
                </h5>
              </div>
              <div
                id="collapseTwo"
                class="collapse"
                aria-labelledby="headingTwo"
                data-parent="#accordion"
              >
                <div class="card-body">
                  Não. Para registrar uma ocorrência, é necessário possuir cadastro na plataforma.
                  Esta é uma medida que visa evitar trotes, visto que é necessário inserir dados pessoais no cadastro.
                </div>
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
                  ><b>Desejo dar uma sugestão ou retirar uma dúvida, como devo proceder?</b></button>
                </h5>
              </div>
              <div
                id="collapseThree"
                class="collapse"
                aria-labelledby="headingThree"
                data-parent="#accordion"
              >
                <div class="card-body">Entre em contato conosco através do ... e escreva sua dúvida ou sugestão</div>
              </div>
            </div>

            <div class="card mb-2">
              <div class="card-header" id="headingFour">
                <h5 class="mb-0">
                  <button
                    class="btn btn-link collapsed"
                    data-toggle="collapse"
                    data-target="#collapseFour"
                    aria-expanded="false"
                    aria-controls="collapseFour"
                  >Dúvida 4</button>
                </h5>
              </div>
              <div
                id="collapseFour"
                class="collapse"
                aria-labelledby="headingFour"
                data-parent="#accordion"
              >
                <div class="card-body">...</div>
              </div>
            </div>

            <div class="card mb-2">
              <div class="card-header" id="headingFive">
                <h5 class="mb-0">
                  <button
                    class="btn btn-link collapsed"
                    data-toggle="collapse"
                    data-target="#collapseFive"
                    aria-expanded="false"
                    aria-controls="collapseFive"
                  >Dúvida 5</button>
                </h5>
              </div>
              <div
                id="collapseFive"
                class="collapse"
                aria-labelledby="headingFive"
                data-parent="#accordion"
              >
                <div class="card-body">...</div>
              </div>
            </div>

            <div class="card mb-2">
              <div class="card-header" id="headingSix">
                <h5 class="mb-0">
                  <button
                    class="btn btn-link collapsed"
                    data-toggle="collapse"
                    data-target="#collapseSix"
                    aria-expanded="false"
                    aria-controls="collapseSix"
                  >Dúvida 6</button>
                </h5>
              </div>
              <div
                id="collapseSix"
                class="collapse"
                aria-labelledby="headingSix"
                data-parent="#accordion"
              >
                <div class="card-body">...</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
 
<script>
import { mapMutations } from "vuex";
import Navbar from "./Navbar.vue";
import PageHeader from "./PageHeader.vue";

export default {
  components: {
    Navbar,
    PageHeader
  },
  name: "servicos",
  data() {
    return {
      pageHeader: {
        title: "Dúvidas",
        description:
          "Veja algumas dúvidas frequentes que os usuários geralmente possuem. Não encontrou sua dúvida? Então entre em contato para mais informações."
      }
    };
  },
  methods: {
    ...mapMutations(["NAV_ATIVO"])
  },
  created() {
    this.NAV_ATIVO("duvidas");
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