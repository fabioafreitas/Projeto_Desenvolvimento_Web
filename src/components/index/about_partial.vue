
<template>
        <div class="about pb-sm-5 pt-sm-5">
          <div class="container d-sm-inline d-lg-block">
            <img class="icon-med pt-2 img-fluid" src="../../assets/conected.png"/>
            <article class="float-lg-right ">
              <p class="text-justify p-section-icon">
              O MyAlert é uma aplicação inteligente que automatiza o serviço de comunicação de órgãos do
              governo, afim de alertar os usuários que estão em situação de risco. 
              </p>

              <p class="text-justify p-section-icon">
              A plataforma unifica diversos órgãos de serviços públicos, 
              que são responsáveis por cada serviço em específico e filtra as ocorrências registradas na plataforma,
              e direcinamos para os destinatários corretos.
              </p>
              <button class="mt-3 mb-3 btn btn-primary">Saiba mais aqui</button>
            </article>
          </div>
        </div>
</template>
 
<script>

export default {   
  name: "about_partial"
};
</script>
 
<style>
    .about{
      font-size: 13pt;
      width: 100%;
      color: #414141;
      background-color: #f6f6f6;
    }

    .icon-small{
      transition-duration: .6s;
      padding-top: 35%;
      width: 250px;
    }

    .icon-small:hover{
      transition-duration: .6s;
      padding-top: 30%;
      width: 270px;
    }
</style>