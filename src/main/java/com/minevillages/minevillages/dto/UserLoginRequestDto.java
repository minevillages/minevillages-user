package com.minevillages.minevillages.dto;

import lombok.Getter;

@Getter
public class UserLoginRequestDto {
    private String email;
    private String password;
    private String clientLanguage;
}