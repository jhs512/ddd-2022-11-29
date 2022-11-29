package com.ll.ddd_2022_11_29.member.adapter.in.web;

import com.ll.ddd_2022_11_29.member.adapter.in.web.request.JoinRequest;
import com.ll.ddd_2022_11_29.member.application.port.in.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/join")
    public String join(JoinRequest request) {
        memberService.join(request.getUsername(), request.getPassword());

        return "join";
    }
}
