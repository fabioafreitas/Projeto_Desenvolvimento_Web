/* eslint-disable */

<template>
    <div id="map"></div>
</template>
 
<script>
export default {
  name: "map-index",
  methods: {
    initMap: function() {
      var uluru = { lat: -8.05428, lng: -34.8813 };
      var map = new google.maps.Map(document.getElementById("map"), {
        zoom: 16,
        center: uluru
      });
      var marker = new google.maps.Marker({ position: uluru, map: map });
    }
  },

  mounted() {
    this.initMap();
  }
};
</script>
 
<style>
#map {
  width: 100%;
  height: 550px;
  background-color: grey;
}
</style>