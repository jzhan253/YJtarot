package com.jincreation.YJtarot.util;

public class ResponseMaker {
    private static final String SUCCESS_MSG = "Success!";
    private static final String FAIL_MSG = "Fail!";
    private static final int SUCCESS_CODE = 200;
    private static final int FAIL_INTERNAL_CODE = 500;

    public static Response getSuccessResponse(){
        Response r = new Response();
        r.setResponseCode(SUCCESS_CODE);
        r.setMessage(SUCCESS_MSG);
        return r;
    }

    public static Response getSuccessResponse(String msg){
        Response r = new Response();
        r.setResponseCode(SUCCESS_CODE);
        if(msg == null || msg.length() == 0) r.setMessage(SUCCESS_MSG);
        r.setMessage(msg);
        return r;
    }

    public static Response getSuccessResponse(Object data){
        Response r = new Response();
        r.setResponseCode(SUCCESS_CODE);
        r.setMessage(SUCCESS_MSG);
        r.setData(data);
        return r;
    }

    public static Response getFailedResponse(String msg){
        Response r = new Response();
        r.setResponseCode(FAIL_INTERNAL_CODE);
        if(msg == null || msg.length() == 0) r.setMessage(FAIL_MSG);
        else r.setMessage(msg);
        return r;
    }

    public static Response getFailedResponse(int code, String msg){
        Response r = new Response();
        r.setResponseCode(code);
        if(msg == null || msg.length() == 0) r.setMessage(FAIL_MSG);
        else r.setMessage(msg);
        return r;
    }




}
