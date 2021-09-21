package com.jincreation.YJtarot.controller.admin.param;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class AdminLoginParam implements Serializable {
    @NotEmpty(message = "Username can't be empty!")
    private String username;

    @NotEmpty(message = "Password can't be empty!")
    private String encryptedPassword;
}
