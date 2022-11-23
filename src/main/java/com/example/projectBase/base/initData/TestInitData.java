package com.example.projectBase.base.initData;

import com.example.projectBase.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev", "test"})
public class TestInitData {
    @Bean
    CommandLineRunner init(
            MemberService memberService
    ) {
        return args -> {
            memberService.create("user1", "user1", "user1@test.com", "minjjai");
        };
    }
}
