
<template>
  <div id="footer" class="pb-3 pt-3 sticky-bottom">
    <div class="container">
			<div class="row text-center text-xs-center text-sm-left text-md-left">
				<div class="col-xs-12 col-sm-4 col-md-4">
					<h5 class="mr-2">My Alert <i class="fas fa-home"></i></h5>
					<ul class="list-unstyled quick-links">
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Página Inicial</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Institucional</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Dúvidas Frequentes</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Serviços</a></li>
					</ul>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<h5 class="mr-2">Serviços APIS<i class="fas fa-cubes"></i></h5>
					<ul class="list-unstyled quick-links">
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Bombeiros API</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Polícia Civil API</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Defesa Civil API</a></li>
					</ul>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<h5 class="mr-2">Ajuda<i class="far fa-question-circle"></i></h5>
					<ul class="list-unstyled quick-links">
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Como faço meu cadastro?</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Como criar uma ocorrência?</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Como monitorar meu bairro?</a></li>
            </ul>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5">
					<ul class="list-unstyled list-inline social text-center">
						<li class="list-inline-item"><a href="#"><i class="fab fa-facebook-square"></i></a></li>
						<li class="list-inline-item"><a href="#"><i class="fab fa-twitter-square"></i></a></li>
						<li class="list-inline-item"><a href="#"><i class="fab fa-instagram"></i></a></li>
						<li class="list-inline-item"><a href="#"><i class="fab fa-youtube-square"></i></a></li>
						<li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
					</ul>
				</div>
				</hr>
			</div>	
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white">
					<p> Recife, Pernambuco - | BR |</p>
					<p class="h6">&copy Todos os direitos reservados.<a class="text-green ml-2" href="#">My Alert</a></p>
				</div>
				</hr>
			</div>	
		</div>
  </div>
</template>
 
<script>
export default {
  name: "footer"
};
</script>
 
<style>
#footer {
  width: 100%;
  height: 100%;
  background-color: #2980b9;
  color: aliceblue;
}

#footer p {
  position: relative;
}

#footer {
    background: #2980b9;
}
#footer h5{
  padding-top: 20px;
	padding-left: 10px;
    padding-bottom: 6px;
    margin-bottom: 20px;
    color:#ffffff;
}
#footer a {
    color: #ffffff;
    text-decoration: none;
    background-color: transparent;
    -webkit-text-decoration-skip: objects;
}
#footer ul.social li{
	padding: 3px 0;
}
#footer ul.social li a i {
    margin-right: 5px;
	font-size:25px;
	-webkit-transition: .5s all ease;
	-moz-transition: .5s all ease;
	transition: .5s all ease;
}
#footer ul.social li:hover a i {
	font-size:30px;
	margin-top:-10px;
}
#footer ul.social li a,
#footer ul.quick-links li a{
	color:#ffffff;
}

#footer ul.quick-links li{
	padding: 3px 0;
	-webkit-transition: .5s all ease;
	-moz-transition: .5s all ease;
	transition: .5s all ease;
}

#footer ul.quick-links li a i{
	margin-right: 5px;
}

</style>