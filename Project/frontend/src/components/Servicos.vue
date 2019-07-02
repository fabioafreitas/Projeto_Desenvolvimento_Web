 
 <template>

 <div class="service=wrapper">
    <Navbar/>
    <PageHeader :duvProps="pageHeader"></PageHeader>
    <div class="container mt-5 mb-5">
                        <div class="card-deck">
                              <CardServices/>
                              <CardServices/>
                              <CardServices/>
                        </div>

                </div>

    <div class="section-text">
      <div class="container pt-4 text-center">
        <h5>Texto de exemplo...</h5>
      </div>
    </div>

    <Footer/>

  </div>
</template>

<script>
  import { mapMutations } from 'vuex';
  import Navbar from "./Navbar.vue";
  import PageHeader from "./PageHeader.vue";
  import CardServices from "./cards/CardServices.vue";
  import Footer from "./Footer.vue";

export default {
  components: {
    Navbar,
    PageHeader,
    CardServices,
    Footer
  },
      name: "servicos",
      data(){
        return{
          pageHeader: {
            title: 'Serviços',
            description: 'A nossa plataforma fornece diversos serviços que visam ajudar as pessoas que estejam em áreas de risco.'
          }
        }
      },
      methods: {
        ...mapMutations([
          'NAV_ATIVO'
        ])
      },
      created(){
        this.NAV_ATIVO('servicos')
      }
    };    
</script>

<style scoped>
  .section-text{
    widows: 100%;
    height: 70px;
    background-color: #e5e5e5;
  }
</style>