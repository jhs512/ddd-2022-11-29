package com.ll.ddd_2022_11_29.member.application.port.in.service;

import com.ll.ddd_2022_11_29.member.application.domain.Member;
import com.ll.ddd_2022_11_29.member.application.port.in.JoinUseCase;
import com.ll.ddd_2022_11_29.member.application.port.out.MemberLoadPort;
import com.ll.ddd_2022_11_29.member.application.port.out.MemberSavePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MemberService implements JoinUseCase {

    private final MemberLoadPort memberLoadPort;
    private final MemberSavePort memberSavePort;

    @Override
    public void join(String username, String password) {
        memberLoadPort.load(username)
                .orElseThrow(NoSuchElementException::new);

        Member member = Member.join(username, password);

        memberSavePort.save(member);
    }
}
