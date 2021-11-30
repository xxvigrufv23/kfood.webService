<template>
  <h1>Hello, gslnbwobnewobnerojgera{{title}}!</h1>
  <Footer />
</template>

<script>
import Footer from "@/components/Layout/Footer";
export default {
  components: {Footer},
  data() {
    return {
      title: 'world'
    };
  }
}
</script>

<style scoped>

</style>