package com.jincreation.YJtarot.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int responseCode;
    private String message;
    private T data;

}
