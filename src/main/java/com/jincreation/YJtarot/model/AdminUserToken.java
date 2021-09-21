package com.jincreation.YJtarot.model;

import lombok.Data;

import java.util.Date;

@Data
public class AdminUserToken {
    private Long adminId;
    private String token;
    private Date updateDate;
    private Date expiryDate;
}
