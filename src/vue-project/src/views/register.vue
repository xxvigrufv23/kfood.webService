<template>
<title class="register"></title>
<div>
  <div>
    <p style="font-weight: bolder; font-size: 25px; margin-top: 40px;" >회원가입</p>
    <section class="register-input-container">
      <p style="display: flex;">★가입정보★</p>
      <div class="register-input-box">

        <div class="register-input-line">
          <div class="register-input-title">
            <p>이름</p>
          </div>
          <div class="register-input-content">
            <input type="name" v-bind="userName" class="register-input-content-input">
          </div>
        </div>

        <div class="register-input-line">
          <div class="register-input-title">
            <p>아이디(e-mail)</p>
          </div>
          <div class="register-input-content">
            <input type="email"  v-bind="userEmail" class="register-input-content-input">
          </div>
        </div>

        <div class="register-input-line">
          <div class="register-input-title">
            <p>비밀번호</p>
          </div>
          <div class="register-input-content">
            <input type="password" v-bind="userPassword" class="register-input-content-input">
          </div>
        </div>

        <div class="register-input-line">
          <div class="register-input-title">
            <p>비밀번호 확인</p>
          </div>
          <div class="register-input-content">
            <input type="password" v-bind="userConfPassword" class="register-input-content-input">
          </div>
        </div>

        <div class="register-input-line">
          <div class="register-input-title">
            <p>전화번호</p>
          </div>
          <div class="register-input-content">
            <input type="tel" v-bind="userPhoneNumber" class="register-input-content-input">
          </div>
        </div>

        <div class="register-input-line">
          <div class="register-input-title">
            <p>자택 주소</p>
          </div>
          <div class="register-input-content">
            <input type="text" v-bind="userAddress" class="register-input-content-input">
          </div>
        </div>

        <div class="register-input-line">
          <div class="register-input-title">
            <p>주소2</p>
          </div>
          <div class="register-input-content">
            <input type="text" v-bind="userAddressTwo" class="register-input-content-input">
          </div>
        </div>

      </div>
      <div>
        <button @click="registerCancle">이전으로</button>
        <button @click="registerAsMember">가입완료</button>
     </div>
    </section>

  </div>
</div>
  <hr>
<Footer />
</template>

<script>
import Footer from "@/components/Layout/Footer";
import axios from 'axios';


export default {
  name: "/register",
  data() {
    return {
      userName:'',
      userEmail:'',
      userPassword:'',
      userConfPassword:'',
      userPhoneNumber:'',
      userAddress:'',
      userAddressTwo:'',
    }
  },

  components: {
    Footer
  },
  methods: {
    registerCancle() {
      window.location.href=window.location.origin + "/member/signup";
    },
    registerAsMember() {
       axios.get('/member/register')
          .then(function(response) {
            console.log(response);
            })
            .catch(function(error) {
            let errorObject=JSON.parse(JSON.stringify(error));
            console.log(errorObject);
            });
    },

  },
}
</script>

<style scoped>
.register-input-container {
  width: 780px;
  margin: 46px auto 80px;
}

.register-input-box {
  margin-bottom: 34px;
  width: 778px;
  height: 569px;
  border: 1px solid #e1dedf;
}
.register-input-line {
  overflow: hidden;
  border-bottom: 1px solid #e1dedf;
}
.register-input-title {
  float: left;
  width: 179px;
  border-right: 1px solid #e1dedf;
  background-color: #f7f7f7;
  font-size: 13px;
  line-height: 68px;
}
.register-input-content {
  float: left;
}
.register-input-content-input {
  margin-left: 20px;
  margin-top: 15px;
  padding-left: 22px;
  font-size: 13px;
  width: 456px;
  height: 38px;
  border: 1px solid #e1dedf;
}
</style>