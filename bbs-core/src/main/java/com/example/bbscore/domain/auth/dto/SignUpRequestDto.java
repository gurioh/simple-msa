package com.example.bbscore.domain.auth.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignUpRequestDto {

    private String name;
    private String mobileNum;
    private String email;
    private String password;
}
