<template>
  <div class="duvidas-wrapper">
    <Navbar></Navbar>
    <PageHeader :duvProps="pageHeader"></PageHeader>

    <div class="container">
      <div class="no-gutters row">
        <div class="col-4">
          <div class="card mt-4 mb-4" style="width: 18rem;">
            <img class="card-img-top" src="../assets/phone-girl.jpg" alt="Card image cap">

            <div class="card-body">
              <h5 class="card-title">Entre em contato</h5>
              <p class="card-text mb-4">
                Não conseguiu esclarecer suas dúvidas sem nosso SAQ? Entre em contato para mais informações.
              </p>

              
              <p><h6 class="float-left">Rua Dom Manuel de Medeiros</h6></p>
              <p><h6 class="float-left">Dois Irmãos, Recife - PE</h6></p>
              <p><h6 class="float-left">contato@myalert.com.br</h6></p>
              <p><h6 class="float-left">(081) 99999 - 9999</h6></p>

            </div>
            
          </div>
        </div>

        <div class="col-8">
          <div id="accordion" class="container mt-4 mb-4">
            
            <div class="card mb-2">
              <div class="card-header" id="headingOne">

                <h5 class="mb-0">
                  <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                    Qual tipo de ocorrência posso registrar pelo MyAlert?
                  </button>
                </h5>
              </div>

              <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordion">
                <div class="card-body">
                  Ocorrências de que envolvam áreas de risco de desastres naturais como deslizamento, alagamentos.
                </div>
              </div>
            </div>

            <div class="card mb-2">

              <div class="card-header" id="headingTwo">
                <h5 class="mb-0">
                  <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                    Posso registrar uma ocorrência sem ter cadastro?
                  </button>
                </h5>
              </div>

              <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                <div class="card-body">
                  Não. Para registrar uma ocorrência, é necessário possuir cadastro na plataforma.
                  Esta é uma medida que visa evitar trotes, visto que é necessário inserir dados pessoais no cadastro.
                </div>
              </div>
            </div>

            <div class="card mb-2">
              <div class="card-header" id="headingThree">
                <h5 class="mb-0">
                  <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                    Desejo dar uma sugestão ou retirar uma dúvida, como devo proceder?
                  </button>
                </h5>
              </div>

              <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                <div class="card-body">Entre em telefone conosco através do ... e escreva sua dúvida ou sugestão</div>
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
          "Veja algumas dúvidas frequentes que nossos usuários geralmente possuem."
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
  min-height: 100%;
}

.submitform {
  max-width: 400px;
  margin: 0 auto;
}

.logo-brand {
  width: 120px;
}
</style>