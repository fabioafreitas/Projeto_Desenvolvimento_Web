<template>
        <div class="info-section">
          <div class="container d-sm-inline d-lg-inline-block">
            <img class="icon-med img-fluid" src="../../assets/user.png"/>
            <article class="mt-4 float-lg-right">
              <p class="text-justify p-section-icon ">
                Nossa plataforma é totalmente responsiva, isso significa que nossos usuários poderão acessá-la em qualquer lugar
                e a qualquer hora, precisando apenas de um smartphone com acesso à internet.

                Com isso garantimos que a plataforma seja completamente portável, facilitando a comunicação dos cidadãos com os
                orgãos provedores de serviços à população.
              </p>

              <p class="text-justify p-section-icon ">
                Uma cidade eficiente depende prioritariamente da ação consciente de seus cidadãos.
                Cadastre-se agora mesmo gratuitamente no MyAlert e ajude a melhorar sua cidade sendo um cidadão ativo.
              </p>
            </article>
          </div>
        </div>
</template>
 
<script>

export default {   
  name: "info-partial"
};
</script>
 
<style>
       .info-section{
      width: 100%;
      height:100%;
      font-size: 13pt;
      color: #414141;
      background-color: #f6f6f6;
    }

    .video-section h2{
      color: #f6f6f6;
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