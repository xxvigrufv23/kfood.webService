<template>
<title class="signUp"></title>
<div>
  <div class="signUp-title">회원가입</div>
  <p class="signUp-subtitle" style="margin-top: 32px;">이메일로 가입하기</p>
  <button class="signUp-register-btn" @click="memberRegister()">회원가입</button>
  <p class="signUp-first-login">
    "K-Food 회원이신가요?"
    <router-link to="/member/login">로그인 하기</router-link>
  </p>
</div>
</template>

<script>
export default {
  name: "Signup",
  methods: {
    memberRegister() {
      window.location.href=window.location.origin + "/member/register";
    }
  },
}
</script>

<style scoped>

</style>