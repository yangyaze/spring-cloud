package com.example.users1.domin;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private String email;
    private String password;
    private Integer loginCount;
    private LocalDateTime lastLoginTime;
}
