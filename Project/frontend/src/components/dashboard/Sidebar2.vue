<template>
        <div class="list-group mx-auto p-1 sidebar-2">

          <div class="sidebar-header">
            <form class="search_dashboard">
              <input type="text" placeholder="Buscar região...">
            </form>
          </div>
          
        </div>
</template>
 
<script>
export default {
  name: "sidebar"
};
</script>
 
<style scoped>

.sidebar-2{
  height: 100%;
}

.search_dashboard input{
  width: 200px;
  height: 30px;
  padding-left: 15px;
  padding-right: 15px;
  border: 1px solid #ecf0f1;
  background-color: #e2e8e9;
}

.search_dashboard input:focus{
  outline: none;
}

.list-group{
  border: 1px solid #e5e5e5;
}

.list-group-item{
  background-color: #fff;
}

.list-group-item:hover{
  background-color: #e2e8e9;
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