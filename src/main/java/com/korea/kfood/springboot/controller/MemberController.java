package com.korea.kfood.springboot.controller;

import com.korea.kfood.springboot.DTO.MemberDTO;
import com.korea.kfood.springboot.Service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Member;

@Controller
@RequestMapping("/member")
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberService memberService;

    //회원가입
    @PostMapping("/register")
    public String registerMemberToSignUp(MemberDTO member) throws Exception {

        logger.info("회원가입 페이지 진입");

        memberService.memberJoin(member);

        logger.info("회원가입 성공");

        return "redirect: /main";
    }

    //로그인 페이지
    @PostMapping("/login")
    public String login(MemberDTO member) throws Exception{


        logger.info("로그인 페이지  진입");


        logger.info("로그인 성공");

        return "redirect:/main";
    }

    @GetMapping("/signup")
    public String signUp() {
        return "forward:/index.html";
    }

    @GetMapping("/identify")
    public String identify() {
        return "forward:/index.html";
    }


}
