package com.dxk.technology.common.exception;

import com.dxk.technology.common.api.IErrorCode;

/**
 * @Date: 2021/11/4 13:24
 * @Author: DingXingKai
 * @Description: 断言，抛出异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }
    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
