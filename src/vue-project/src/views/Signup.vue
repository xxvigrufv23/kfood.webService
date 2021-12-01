<template>
<title class="signUp"></title>
 <div style="width:700px; margin-left: 600px">
    <div style="margin-top: 110px;">
      <div class="signUp-title"  style="font-size: 25px; font-weight: bolder;">회원가입</div>
      <p class="signUp-subtitle">이메일로 가입하기</p>
      <button class="signUp-register-btn" @click="memberRegister()">회원가입</button>
      <p class="signUp-first-login">
        "K-Food 회원이신가요?"
        <router-link to="/member/login">로그인 하기</router-link>
      </p>
    </div>
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
.signUp-subtitle{
  margin-top: 110px;
  font-size: 18px;
  font-weight: bolder;
}
.signUp-register-btn{
  width: 262px;
  height: 44px;
  margin: 10px 0;
  font-size: 16px;
  font-weight: bolder;
  background-color: burlywood;
  border-radius: 10px;
}
.signUp-first-login {
  font-weight: bolder;
}
</style>