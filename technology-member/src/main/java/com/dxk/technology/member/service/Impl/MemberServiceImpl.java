package com.dxk.technology.member.service.Impl;

import cn.hutool.core.util.StrUtil;
import com.dxk.technology.common.api.CommonResult;
import com.dxk.technology.common.api.ResultCode;
import com.dxk.technology.common.constant.AuthConstant;
import com.dxk.technology.common.exception.Asserts;
import com.dxk.technology.member.dao.AuthUserMapper;
import com.dxk.technology.member.feign.AuthService;
import com.dxk.technology.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date: 2021/11/4 13:22
 * @Author: DingXingKai
 * @Description: 用户相关接口实现类
 */
@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private AuthUserMapper authUserMapper;
    @Autowired
    private AuthService authService;

    /**
     * @param username:：用户名
     * @param password： 密码
     * @Description: 登录
     * @Date: 2021/11/4 13:22
     * @Author: DingXingKai
     */
    @Override
    public CommonResult login(String username, String password) {
        if (StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            Asserts.fail("用户名或密码不能为空");
        }
        Map<String,String> params = new HashMap<>();
        params.put("client_id", AuthConstant.ADMIN_CLIENT_ID);
        params.put("client_secret","123456");
        params.put("grant_type","password");
        params.put("username",username);
        params.put("password",password);
        CommonResult restResult = authService.getAccessToken(params);
        if(ResultCode.SUCCESS.getCode()==restResult.getCode()&&restResult.getData()!=null){
        }
        return restResult;
    }
}
