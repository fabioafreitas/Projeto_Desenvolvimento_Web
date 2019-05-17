 
 <template>

  <div class="container">
    <div class="row">
      <div class="col-3">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  id="navbarDropdownMenuLink"
                  role="button"
                  data-toggle="dropdown"
                  aria-haspopup="true"
                  aria-expanded="false"
                >Menu</a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                  <a class="dropdown-item" href="#">Tasks</a>
                  <a class="dropdown-item" href="#">Ranking</a>
                  <a class="dropdown-item" href="#">Feedy</a>
                  <br>
                  <br>
                  <br>
                  <br>
                  <br>
                  <br>CONTA
                  <br>
                  <br>
                  <button type="button" class="btn btn-danger">LOGOUT</button>
                </div>
              </li>
            </ul>
          </div>
        </nav>
      </div>

      <div class="col-9">
        <div class="container">
          <div class="row align-items-center">
            <div class="col-1"></div>
            <div class="col-10">
              <h1>To Do &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; HOME</h1>
              <div class="container">
                <div class="row">
                  <div id="botao" class="col-12">
                    <!-- Button trigger modal -->
                    <button
                      type="button"
                      class="btn btn-primary"
                      data-toggle="modal"
                      data-target="#exampleModal"
                    >+ ADD List</button>

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
                            <h5 class="modal-title" id="exampleModalLabel">ADD List</h5>
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
                                    <!-- CAMPO TÍTULO -->
                                    <div class="form-group">
                                      <label for="exampleInputEmail1">Título</label>
                                      <input
                                        type="email"
                                        class="form-control"
                                        id="exampleInputEmail1"
                                        aria-describedby="emailHelp"
                                        placeholder="Informe seu título"
                                      >
                                    </div>
                                    <!-- CAMPO NOTA/OBS -->
                                    <div class="form-group">
                                      <label for="exampleFormControlTextarea1">Nota / OBS</label>
                                      <textarea
                                        class="form-control"
                                        id="exampleFormControlTextarea1"
                                        rows="3"
                                        placeholder="Deixe aqui sua observação"
                                      ></textarea>
                                    </div>
                                    <!-- CAMPO DATA -->
                                    <input id="date" type="date">
                                    <!-- CAMPO OUTRA PESSOA -->
                                    <div class="form-group">
                                      <label for="exampleInputEmail1">Outra pessoa?</label>
                                      <input
                                        type="email"
                                        class="form-control"
                                        id="exampleInputEmail1"
                                        aria-describedby="emailHelp"
                                        placeholder="Outra pessoa?"
                                      >
                                    </div>
                                  </form>
                                  <!-- FIM FORM -->
                                </div>

                                <!-- col 2 -->
                                <div class="col-4"></div>

                                <!-- col 3 -->
                                <div class="col-4">
                                  <!-- INPUT IMAGEM -->
                                  <input type="file">

                                  <!-- IMPORTANCIA -->
                                  <br>
                                  <br>
                                  <form>
                                    <div class="form-group">
                                      <label for="formControlRange">Importância</label>
                                      <input
                                        type="range"
                                        class="form-control-range"
                                        id="formControlRange"
                                      >
                                    </div>
                                  </form>
                                </div>
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