package com.zanchenko.alexey.JWT.Authentication.api.dto;

import lombok.Data;

@Data
public class LoginDTO {
    private String username;
    private String password;
}
