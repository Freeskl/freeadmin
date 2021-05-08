package com.freeskl.freeadmin.core;


import com.freeskl.freeadmin.enums.ResponseCode;

/**
 * @ClassName Result
 * @Description 请求返回基类
 * @Author freeskl
 * @Date 2021/5/7
 */
public class Result {


    private int code;

    private String msg;

    public Result() {
        this(ResponseCode.OK);
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(ResponseCode httpCode) {
        this.code = httpCode.getCode();
        this.msg = httpCode.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
