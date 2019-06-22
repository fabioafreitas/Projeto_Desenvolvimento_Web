<template>
	<div class="container-fluid lay-site-shadow" style="height:700px">
		<div class="lay-site">
			<header class="lay-header ">
					<div class="row justify-content-center">
						<div class="col text-center">
							<a class="navbar-brand" href="/">
								<img class="img-fluid" src="imagens/logo.png" alt="logo"
										style="max-width:200%; padding: 10%">
							</a>
							<a class="navbar-brand" href="#">
								<img class="img-fluid" src="imagens/apac-logo.png" alt="logo"
										style="max-width:80%; padding: 10%">
							</a>
						</div>
					</div>
			</header>
			<table class="table table-hover">
				<thead class="thead-info">
					<tr>
						<th>TÍTULO</th>
						<th>CPF</th>
						<th>DESCRIÇÃO</th>
						<th>URGÊNCIA</th>
						<th>CATEGORIA</th>
					</tr>
				</thead>
				<tbody>
					<tr v-for="ocorrencia of ocorrencias" :key="ocorrencia.key">
						<td>{{ ocorrencia.titulo }}</td>
						<td>{{ ocorrencia.cpf }}</td>
						<td>{{ ocorrencia.descricao }}</td>
						<td>{{ ocorrencia.urgencia }}</td>
						<td>{{ ocorrencia.categoria }}</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</template>

<script>
export default {
name: "apac",
data() {
    return {
    ocorrencias: []
    };
},
methods: {}
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
