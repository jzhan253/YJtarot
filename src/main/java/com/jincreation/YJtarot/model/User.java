package com.jincreation.YJtarot.model;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class User {

    private UUID id;
    private String email;
    private String username;
    private String password;
    private List<Divination> records;


}
