package com.ll.ddd_2022_11_29.member.adapter.out.jpa;

import com.ll.ddd_2022_11_29.member.application.domain.Member;
import com.ll.ddd_2022_11_29.member.application.port.out.MemberLoadPort;
import com.ll.ddd_2022_11_29.member.application.port.out.MemberSavePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MemberRepository implements MemberLoadPort, MemberSavePort {
    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Optional<Member> load(Long id) {
        return memberJpaRepository.findById(id);
    }

    @Override
    public Optional<Member> load(String username) {
        return memberJpaRepository.findByUsername(username);
    }

    @Override
    public void save(Member member) {
        memberJpaRepository.save(member);
    }
}
