package com.dxk.technology.common.api;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @Date: 2021/10/25 23:38
 * @Author: DingXingKai
 * @Description: 封装API的错误码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
