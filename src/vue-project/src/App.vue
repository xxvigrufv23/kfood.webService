<template>
    <div id="nav">
      <router-link to="/home">K-food</router-link>  |
      <router-link to="/about">소개</router-link>  |
      <router-link to="/shopping">Shop</router-link>
      <strong id="nav-right" style="position: inherit; margin-left:700px;">
        <router-link to="/member/login">로그인</router-link> |
        <router-link to="/member/signup">회원가입</router-link>
      </strong>
    </div>

    <router-view/>
</template>

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
  background-color: #000000;
  color: white;
  word-spacing: 23px;
}

#nav a {
  font-weight: bold;
  color: white;
}

#nav-right {
  word-spacing: 23px;
}
#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
<script>
export default {
}
</script>