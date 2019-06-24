
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
 
<style scoped>
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
      padding-top: 43%;
      width: 200px;
    }

    .icon-small:hover{
      transition-duration: .6s;
      padding-top: 40%;
      width: 210px;
    }

    @media (max-width: 550px) and (min-width: 100px){
      .video-section{
        width: 100%;
        height: 180px;
      }

      .icon-small{
      transition-duration: .6s;
      padding-top: 43%;
      width: 80px;
    }

    .icon-small:hover{
      transition-duration: .6s;
      padding-top: 40%;
      width: 85px;
    }
    }
</style>