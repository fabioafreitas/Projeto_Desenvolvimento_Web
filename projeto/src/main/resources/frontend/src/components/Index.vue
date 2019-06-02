
<template>
        <div id="index">
            <Navbar/>
            <div class="map_index">
              <MapIndex/>
            </div>

            <AboutPartial/>
            <VideoPartial/>
            <InfoPartial/>
            <CallbackPartial/>
        </div>
</template>
 
<script>
import MapIndex from "./MapIndex.vue";
import AboutPartial from "./index/about_partial.vue";
import VideoPartial from "./index/video_partial.vue";
import InfoPartial from "./index/info_partial.vue";
import CallbackPartial from "./index/callback_partial.vue";
import Navbar from "./Navbar.vue";

export default {
  components: {
    Navbar,
        MapIndex,
        AboutPartial,
        VideoPartial,
        InfoPartial,
        CallbackPartial
      },      
  name: "index"
};
</script>
 
<style>
.map_index{
  width: 100%;
  height: 600px;
}
       
</style>