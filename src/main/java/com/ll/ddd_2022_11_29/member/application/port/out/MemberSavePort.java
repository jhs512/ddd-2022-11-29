package com.ll.ddd_2022_11_29.member.application.port.out;

import com.ll.ddd_2022_11_29.member.application.domain.Member;

public interface MemberSavePort {
    void save(Member member);
}