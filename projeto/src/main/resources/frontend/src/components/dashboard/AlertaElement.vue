<template>
        <div class="alert-element">
                <div class="row no-gutters">
                        <figure class="photo-alert float-left">
                                <img src="../../assets/default_user.png"/>
                        </figure>

                        <p>Usuario Mil Graus</p>
                </div>

                <div class="row no-gutters">
                        <p class="text-justify">
                                Petierunt uti sibi concilium totius Galliae in diem certam indicere. 
                                Cras mattis iudicium purus sit amet fermentum.
                        </p>
                </div>
        </div>
</template>
 
<script>
export default {
  name: "logado",
  data() {
    return {
      usuario: {
        id: 0,
        name: "",
        active: false
      },
      submitted: true
    };
  },
  methods: {
    /* eslint-disable no-console */
    /* eslint-enable no-console */
  }
};
</script>
 
<style>

.alert-element{
        width: 100%;
}

.photo-alert img{
        width: 25px;
}

p{
        font-size: 10pt;
        padding: 4px;
}

</style>