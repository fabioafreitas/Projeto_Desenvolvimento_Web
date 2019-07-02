<template>
    <div id="map"></div>
</template>
 
<script>
/* eslint-disable */
export default {
  name: "map-index",
  methods: {
    initMap: function() {
      var recife = { lat: -8.05428, lng: -34.8813 };
      var map = new google.maps.Map(document.getElementById("map"), {
        zoom: 16,
        center: recife,
        styles: [
            {elementType: 'geometry', stylers: [{color: '#dfe4ea'}]},
            {elementType: 'labels.text.stroke', stylers: [{color: '#232323'}]},
            {elementType: 'labels.text.fill', stylers: [{visibility: 'off'}]},
            {
              featureType: 'administrative.locality',
              elementType: 'labels.text.fill',
              stylers: [{color: '#2980b9', visibility: 'off'}]
            },
            {
              featureType: 'poi',
              elementType: 'labels.text.fill',
              stylers: [{visibility: 'off'}]
            },
            {
              featureType: 'poi.park',
              elementType: 'geometry',
              stylers: [{color: '#dfe4ea'}]
            },
            {
              featureType: 'poi.park',
              elementType: 'labels.text.fill',
              stylers: [{color: '#6b9a76'}]
            },
            {
              featureType: 'road',
              elementType: 'geometry',
              stylers: [{color: '#ecf0f1'}]
            },
            {
              featureType: 'road',
              elementType: 'geometry.stroke',
              stylers: [{color: '#212a37'}]
            },
            {
              featureType: 'road',
              elementType: 'labels.text.fill',
              stylers: [{color: '#9ca5b3'}]
            },
            {
              featureType: 'road.highway',
              elementType: 'geometry',
              stylers: [{color: '#ecf0f1'}]
            },
            {
              featureType: 'road.highway',
              elementType: 'geometry.stroke',
              stylers: [{color: '#1f2835'}]
            },
            {
              featureType: 'road.highway',
              elementType: 'labels.text.fill',
              stylers: [{color: '#f3d19c'}]
            },
            {
              featureType: 'transit',
              elementType: 'geometry',
              stylers: [{color: '#95a5a6'}]
            },
            {
              featureType: 'transit.station',
              elementType: 'labels.text.fill',
              stylers: [{color: '#d59563'}]
            },
            {
              featureType: 'water',
              elementType: 'geometry',
              stylers: [{color: '#74b9ff'}]
            },
            {
              featureType: 'water',
              elementType: 'labels.text.fill',
              stylers: [{color: '#515c6d'}]
            },
            {
              featureType: 'water',
              elementType: 'labels.text.stroke',
              stylers: [{color: '#17263c'}]
            }
          ]
      });
      var marker = new google.maps.Marker({ position: recife, map: map });
    }
  },

  async mounted() {
    this.initMap();
  }
};
</script>
 
<style>
#map {
  width: 100%;
  height: 100%;
  background-color: grey;
}
</style>