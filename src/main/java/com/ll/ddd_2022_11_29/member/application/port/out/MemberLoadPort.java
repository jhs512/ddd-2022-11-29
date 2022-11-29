package com.ll.ddd_2022_11_29.member.application.port.out;

import com.ll.ddd_2022_11_29.member.application.domain.Member;

import java.util.Optional;

public interface MemberLoadPort {
    Optional<Member> load(Long id);
    Optional<Member> load(String username);
}