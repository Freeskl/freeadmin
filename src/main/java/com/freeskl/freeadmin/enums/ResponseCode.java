package com.freeskl.freeadmin.enums;

/**
 * @ClassName ResponseCode
 * @Description 请求返回
 * @Author freeskl
 * @Date 2021/5/7
 */
public enum ResponseCode {

    ERROR(0,"操作失败"),

    OK(1, "操作成功"),

    BAD_REQUEST(400, "请求有异常"),

    UNAUTHORIZED(401, "未认证"),

    USER_ALREADY_REG(400, "该用户已经注册"),

    ROLE_KEY_EXIST(400, "角色key不能重复"),

    NOT_LOGIN(401, "未登录"),

    FORBIDDEN(403, "访问被禁止"),

    NOT_FOUND(404, "找不到资源");

    int code;

    String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
