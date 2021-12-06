package com.korea.kfood.springboot.service;

import com.korea.kfood.springboot.DTO.MemberDTO;
import com.korea.kfood.springboot.Mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MemberServiceImpl implements MemberService{

//    @Autowired
    MemberMapper memberMapper;

    @Override
    public void memberJoin(MemberDTO member) throws Exception {

        memberMapper.memberJoin(member);
    }
}

