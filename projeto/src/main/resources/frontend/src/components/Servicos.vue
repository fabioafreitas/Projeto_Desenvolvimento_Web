 
 <template>

 <div class="service=wrapper">
    <Navbar/>
    <PageHeader/>
  </div>
</template>

<script>
  import { mapMutations } from 'vuex';
  import Navbar from "./Navbar.vue";
  import PageHeader from "./PageHeader.vue";

export default {
  components: {
    Navbar,
    PageHeader
  },
      name: "servicos",
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