package com.kindergarden.animal.domain.member.vo;

import lombok.Data;

@Data
public class Member {
    private Long memberNo;
    private String memberId;
    private String memberPw;
    private String name;
    private String email;
    private String phone;
}
