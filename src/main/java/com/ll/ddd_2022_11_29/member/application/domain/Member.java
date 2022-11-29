package com.ll.ddd_2022_11_29.member.application.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
    @Id
    private Long id;
    private String username;
    private String password;

    public static Member join(String username, String password) {

        Member member = new Member();
        member.setUsername(username);
        member.setPassword(password);

        return member;
    }
}
