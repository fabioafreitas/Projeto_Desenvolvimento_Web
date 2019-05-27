 
 <template>
  <div class="container">
    <div class="row">
      <div class="col-6">
        <div class="container">
          <div class="row align-items-center">
            <div class="col-1"></div>
            <div class="col-10">
              <div class="container">
                <div class="row">
                  <div id="botao" class="col-12">
                    <!-- Button trigger modal -->
                    <button
                      type="button"
                      class="btn btn-primary"
                      data-toggle="modal"
                      data-target="#exampleModal"
                    >Registrar Ocorrência</button>

                    <!-- Modal -->
                    <div
                      class="modal fade"
                      id="exampleModal"
                      tabindex="-1"
                      role="dialog"
                      aria-labelledby="exampleModalLabel"
                      aria-hidden="true"
                    >
                      <div class="modal-dialog modal-lg" role="document">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Registrar Ocorrência</h5>
                            <button
                              type="button"
                              class="close"
                              data-dismiss="modal"
                              aria-label="Close"
                            >
                              <span aria-hidden="true">&times;</span>
                            </button>
                          </div>
                          <div class="modal-body">
                            <div class="container">
                              <div class="row">
                                <!-- col 1 -->
                                <div class="col-4">
                                  <form>
                                    <!-- CAMPO TIPO OCORRÊNCIA -->
                                    <select class="custom-select">
                                      <option selected>Selecione o tipo de ocorrência</option>
                                      <option value="1">Criminal</option>
                                      <option value="2">Desastre natural</option>
                                      <option value="3">Incêncio</option>
                                      <option value="4">Acidente</option>
                                      <option value="5">Animal na rua</option>
                                      <option value="6">Outro</option>
                                    </select>
                                  </form>
                                  <!-- CAMPO TÍTULO -->
                                  <div class="form-group">
                                    <label for="titulo">Título</label>
                                    <input
                                      type="text"
                                      class="form-control"
                                      id="titulo"
                                      placeholder="Informe seu título"
                                    >
                                  </div>
                                  <!-- CAMPO DESCRIÇÃO -->
                                  <div class="form-group">
                                    <label for="descricao">Descrição do fato</label>
                                    <textarea
                                      class="form-control"
                                      id="descricao"
                                      rows="3"
                                      placeholder="Informe aqui a descrição do fato com detalhes..."
                                    ></textarea>
                                  </div>
                                  <!-- CAMPO DATA -->
                                  <input id="date" type="date">
                                </div>

                                <!-- col 2 -->
                                <div class="col-4">
                                  <!-- URGÊNCIA -->
                                  <form>
                                    <div class="form-group">
                                      <label for="formControlRange">Urgência</label>
                                      <input
                                        type="range"
                                        class="form-control-range"
                                        id="formControlRange"
                                      >
                                    </div>
                                  </form>
                                </div>

                                <!-- col 3 -->
                                <div class="col-4"></div>
                              </div>
                            </div>
                          </div>
                          <div class="modal-footer">
                            <button
                              type="button"
                              class="btn btn-secondary"
                              data-dismiss="modal"
                            >Close</button>
                            <button type="button" class="btn btn-primary">Save</button>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-3"></div>
                </div>
              </div>

              <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                  <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                  <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                  <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img src="../assets/enchentes.png" class="d-block w-100" alt="...">
                  </div>
                  <div class="carousel-item">
                    <img src="../assets/enchentes.png" class="d-block w-100" alt="...">
                  </div>
                  <div class="carousel-item">
                    <img src="../assets/enchentes.png" class="d-block w-100" alt="...">
                  </div>
                </div>
                <a
                  class="carousel-control-prev"
                  href="#carouselExampleIndicators"
                  role="button"
                  data-slide="prev"
                >
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a
                  class="carousel-control-next"
                  href="#carouselExampleIndicators"
                  role="button"
                  data-slide="next"
                >
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="sr-only">Next</span>
                </a>
              </div>
            </div>
            <div class="col-1"></div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
  import { mapMutations } from 'vuex';
    export default {
      name: "servicos",
      methods: {
        ...mapMutations([
          'NAV_ATIVO'
        ])
      },
      created(){
        this.NAV_ATIVO('servicos')
      }
    };    
</script>