<template>
  <div>
<!--The div element for the map -->
        <div id="map" >
        </div>
    </div>
<!-- Replace the value of the key parameter with your own API key. -->

</template>
 
<script>
  export default {
    name: "map-index",
    methods: {
        initMap: function() {
  // The location of Uluru
  var uluru = {lat: -8.05428, lng:  -34.8813};
  // The map, centered at Uluru
  var map = new google.maps.Map(
      document.getElementById('map'), {zoom: 16, center: uluru});
  // The marker, positioned at Uluru
  var marker = new google.maps.Marker({position: uluru, map: map});
}
    },
      
 mounted(){
    this.initMap()
 }
  };

</script>
 
<style>
    #map {
        width: 100%;
        height: 400px;
        background-color: grey;
    }
</style>