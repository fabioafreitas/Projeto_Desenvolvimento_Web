 
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
  </div>
</template>

<script>
  import { mapMutations } from 'vuex';
  import Navbar from "./Navbar.vue";
  import PageHeader from "./PageHeader.vue";
  import CardServices from "./cards/CardServices.vue";

export default {
  components: {
    Navbar,
    PageHeader,
    CardServices
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