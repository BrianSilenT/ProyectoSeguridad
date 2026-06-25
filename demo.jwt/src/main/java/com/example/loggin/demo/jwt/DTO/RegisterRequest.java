package com.example.loggin.demo.jwt.DTO;

import com.example.loggin.demo.jwt.Enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String username;
    private String password;
    private Role role;
}

