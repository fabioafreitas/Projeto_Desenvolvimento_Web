
<template>
        <div id="index">
            <MapIndex/>
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

export default {
  components: {
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
       
</style>