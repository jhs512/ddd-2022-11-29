package com.ll.ddd_2022_11_29.member.adapter.out.jpa;

import com.ll.ddd_2022_11_29.member.application.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUsername(String username);
}
