package com.korea.kfood.springboot.Service;

import com.korea.kfood.springboot.DTO.MemberDTO;

public interface MemberService {

    //회원가입
    public void memberJoin(MemberDTO member) throws Exception;

}
