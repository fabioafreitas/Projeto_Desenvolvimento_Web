<template>
        <div class="list-group mx-auto p-1">

          <div class="sidebar-header">
            <a class="navbar-brand" href="/logado">
              <img class="logo-brand" src="../../assets/logo_mylaert_dark.png"/>
            </a>
            <form class="search_dashboard">
              <input type="text" placeholder="Buscar região...">
            </form>
          </div>

          <a href="/ocorrencia" class="list-group-item list-group-item-action">Registrar Ocorrência</a>
        </div>
</template>
 
<script>
export default {
  name: "sidebar"
};
</script>
 
<style scoped>

.search_dashboard input{
  width: 250px;
  height: 32px;
  padding-left: 15px;
  padding-right: 15px;
  border: 1px solid #cecece;
  border-radius: 40px;
}

.search_dashboard input:focus{
  outline: none;

}

.list-group{
  background-color: #fff;
}

.list-group-item{
  background-color: #fff;
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