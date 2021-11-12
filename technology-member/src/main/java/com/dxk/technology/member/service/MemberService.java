package com.dxk.technology.member.service;

import com.dxk.technology.common.api.CommonResult;

/**
 * @Date: 2021/11/4 13:21
 * @Author: DingXingKai
 * @Description: 用户相关接口
 */
public interface MemberService {
    /**
     * @Description: 登录
     * @Date: 2021/11/4 13:22
     * @Author: DingXingKai
     */
    CommonResult login(String username, String password);
}
