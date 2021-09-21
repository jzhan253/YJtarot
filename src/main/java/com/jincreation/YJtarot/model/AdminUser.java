package com.jincreation.YJtarot.model;

import lombok.Data;

@Data
public class AdminUser {
    private Long adminId;
    private String username;
    private String email;
    private String password;
    private String nickname;
    private Byte locked;
}
