
<template>
        <div class="video-section pb-sm-5 pt-sm-5">
          <div class="d-flex justify-content-center">
            <a href="#"><img class="icon-small" src="../../assets/play2.png"/></a>
          </div>
        </div>
</template>
 
<script>

export default {   
  name: "video-partial"
};
</script>
 
<style>
       .video-section{
      width: 100%;
      height: 500px;
      background-image: url("../../assets/favela.jpg");
      background-size: cover;
      background-repeat: no-repeat;
    }

    .video-section h2{
      color: aliceblue;
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