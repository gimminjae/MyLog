package com.example.projectBase.base.dto;

import com.example.projectBase.member.dto.MemberDto;
import com.example.projectBase.member.entity.Member;

public class DtoUt {
    public static MemberDto toDto(Member member) {
        return MemberDto.builder()
                .nickname(member.getNickname())
                .email(member.getEmail())
                .id(member.getId())
                .username(member.getUsername())
                .password(member.getPassword())
                .createDate(member.getCreateDate())
                .updateDate(member.getUpdateDate())
                .build();
    }
}
