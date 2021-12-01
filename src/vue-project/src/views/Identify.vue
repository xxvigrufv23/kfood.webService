<template>
<title class="identify"></title>
<div>
  <div id="modals-container" style="margin: 0 630px; width: 600px;">
    <article class="identify-box" style="margin: 170px 0;">
      <section class="identify-section">
        <p id="identify-find-id">아이디 찾기</p>
        <input id="identify-id" type="tel" placeholder="등록된 전화번호를 입력해주세요">
        <button id="identify-id-send">아이디 전송</button>
      </section>
      <hr style="margin: 70px 0; size: A3;">
      <section class="identify-section">
        <p id="identify-find-password">비밀번호 찾기</p>
        <input id="identify-password" type="tel" placeholder="등록된 전화번호를 입력해주세요">
        <button id="identify-password-send">비밀번호 재설정 문자 전송</button>
      </section>
    </article>
  </div>
</div>
</template>

<script>
export default {
  name: "Identify"
}
</script>

<style scoped>
#identify-find-id{
  font-size: 23px;
  font-weight: bolder;
}
#identify-id {
  width: 240px;
  height: 30px;
  border-width: unset;
}
#identify-id-send {
  width: 250px;
  height: 37px;
  border-width: medium;
  margin: 6px 176px;
  background-color: burlywood;
  font-size: medium;
  font-weight: bolder;
  border-radius: 3px;
}

#identify-find-password{
  font-size: 23px;
  font-weight: bolder;
}
#identify-password {
  width: 240px;
  height: 30px;
  border-width: unset;
}
#identify-password-send {
  width: 250px;
  height: 37px;
  border-width: medium;
  margin: 6px 176px;
  background-color: burlywood;
  font-size: medium;
  font-weight: bolder;
  border-radius: 3px;
}
</style>