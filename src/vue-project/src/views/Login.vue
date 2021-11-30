<template>
<div>
  <div id="modals-container" style="margin-top: 110px;"></div>
  <div style="width:700px; margin-left: 600px">
    <div class="login-title">로그인</div>
    <p class="login-subtitle">이메일 로그인</p>
    <section class="login-form-box">
      <form class="login-form-input-form">
        <section class="login-form-input-area">
          <input id="login-form-input-email" type="email" placeholder="아이디(이메일)을 입력하세요" required="required">
          <br>
          <input id="login-form-input-password" type="password" placeholder="비밀번호를 입력하세요" required="required">
        </section>
        <button type="submit" class="login-form-input-submit">로그인</button>
      </form>
    </section>
    <section class="login-auth">
        <p class="login-identify">아이디 / 비밀번호 찾기</p>
    </section>
    <p class="login-register">
      "K-Food가 처음이신가요?"
      <span>
        <router-link to="/member/signup">회원가입</router-link>
      </span>
    </p>
  </div>

</div>
</template>

<script>
export default {
  name: "Login"
}
</script>

<style scoped>
.login-title {
  font-size: 25px;
  font-weight: bolder;
}
.login-subtitle {
  font-size: 20px;
  font-weight: bolder;
}
#login-form-input-email {
  width: 250px;
  height: 35px;
  position: relative;
  margin: 10px 0;
}
#login-form-input-password {
  width: 250px;
  height: 35px;
  position: relative;
}
.login-form-input-submit {
  width: 260px;
  height: 35px;
  position: relative;
  margin: 10px 0;
  background-color: #000;
  color: white;
}
</style>