package com.koreait.springweb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserEntity {
    private int iuser;
    private String userid;
    private String userpw;
    private String nm;
    private int gender;
    private String profileimg;
    private String rdt;
}
