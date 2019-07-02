<template>
        <div class="list-group mx-auto sidebar-1">

          <div class="sidebar-header">
            <a class="navbar-brand" href="/logado">
              <img class="logo-brand" src="../../assets/logo_mylaert_dark.png"/>
            </a>
            <form class="search_dashboard">
              <input type="text" placeholder="Buscar região...">
            </form>
          </div>

          <a href="/ocorrencia" class="list-group-item list-group-item-action">Registrar Ocorrência</a>
          <a href="/ocorrencia" class="list-group-item list-group-item-action">Registrar Ocorrência</a>
          <a href="/ocorrencia" class="list-group-item list-group-item-action">Registrar Ocorrência</a>
          <a href="/ocorrencia" class="list-group-item list-group-item-action">Registrar Ocorrência</a>
        </div>
</template>
 
<script>
export default {
  name: "sidebar"
};
</script>
 
<style scoped>

.sidebar-1{
  background-color: #2c3e50;
  height: 100%;
}

.search_dashboard input{
  width: 200px;
  height: 30px;
  padding-left: 15px;
  padding-right: 15px;
  color: #e5e5e5;
  border: 1px solid #2c3e50;
  background-color: #1b2631;
}

.search_dashboard input:focus{
  outline: none;
}

.list-group{
  background-color: #2c3e50;
}

.list-group-item{
  background-color: #243342;
  color: #ccc;
}

@media (max-width: 1000px) {
  .search_dashboard input{
    width: 200px;
  }
}

@media (max-width: 850px) and (min-width: 100px){
  .search_dashboard input{
    width: 150px;
  }
}

@media (max-width: 500px) and (min-width: 100px){
  .search_dashboard input{
    width: 100px;
  }
}

</style>