package com.dxk.technology.common.exception;

import com.dxk.technology.common.api.IErrorCode;

/**
 * @Description: 自定义API异常
 * @Date: 2021/11/4 13:26
 * @Author: DingXingKai
 */
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
