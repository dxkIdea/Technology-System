package com.dxk.technology.common.api;

/**
 * @Date: 2021/10/25 23:37
 * @Author: DingXingKai
 * @Description: 枚举常用操作状态码+描述
 */
public enum ResultCode implements IErrorCode{
    SUCCESS(200,"SUCCESS"),
    FAILED(500, "系统异常"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
