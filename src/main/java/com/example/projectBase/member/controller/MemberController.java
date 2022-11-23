package com.example.projectBase.member.controller;

import com.example.projectBase.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "member/login";
    }
}