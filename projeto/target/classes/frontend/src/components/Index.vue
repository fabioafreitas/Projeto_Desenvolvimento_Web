
<template>
        <div id="index">
          <map-index></map-index>
          <about-partial></about-partial>
          <video-partial></video-partial>
          <info-partial></info-partial>
          <callback-partial></callback-partial>
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
        'map-index': MapIndex,
        'about-partial': AboutPartial,
        'video-partial': VideoPartial,
        'info-partial': InfoPartial,
        'callback-partial': CallbackPartial
      },      
  name: "index"
};
</script>
 
<style>
       
</style>