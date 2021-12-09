package com.korea.kfood.springboot.Mapper;

import com.korea.kfood.springboot.DTO.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberMapper {

    public void memberJoin(MemberDTO member);
}
