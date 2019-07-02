 
 <template>
        <div class="">
                <div class="page_header">
                        <div class="d-flex container justify-content-center">
                                <div>
                                <p class="text-center">{{duvProps.title}}</p>
                                <p class="text_block ">
                                        {{duvProps.description}}
                                </p>
                                </div>
                        </div>
                </div>

                </div>
</template>

<script>

export default {
  name: "PageHeader",
  props: [
          'duvProps'
  ]
};    
</script>

<style scoped>
        .page_header{
                padding: 20px;
                width: 100%;
                height: 100%;
                background-image: url('../assets/pageHeader.png');
                font-size: 18pt;
                color: whitesmoke;
        }

        .text_block{
                width: 600px;
                text-align: center;
        }
</style>