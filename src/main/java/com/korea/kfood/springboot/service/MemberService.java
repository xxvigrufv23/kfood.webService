package com.korea.kfood.springboot.service;


import com.korea.kfood.springboot.DTO.MemberDTO;

public interface MemberService {

    public void memberJoin(MemberDTO member) throws Exception;

}
