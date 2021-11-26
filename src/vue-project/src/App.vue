<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/>
  안녕하세요 최재윤입니다.
</template>
<script>
import HelloWorld from "@/components/HelloWorld";
import request from "request"

export default {
  name:'App',
  components:{
    HelloWorld
  },
  mounted() {
    request('http://localhost:8080/api/home', function (error, response, body) {
      window.console.log('에러남:', error);
      window.console.log('상태코드 : ', response && response.statusCode);
      window.console.log('body:', body);
    })
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
