package com.korea.kfood.springboot.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

    private String memberId; //회원 ID(E-Mail)
    private String memberPw; //회원 비밀번호
    private String memberName; //회원 이름
    private String memberAdd1; //회원 우편번호
    private String memberAdd2; //회원 주소
    private String memberPhone;  //회원 전화번호
    private String regDate;  //회원 등록일
    private String point; //회원 포인트

}
