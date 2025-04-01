package org.example.demo_travel.member;

import lombok.Data;

@Data
public class MemberVO {
    private int num;
    private String id;
    private String pw;
    private String name;
    private String tel;
    private String email;

    private String regdate;
    private String user_role;

}
