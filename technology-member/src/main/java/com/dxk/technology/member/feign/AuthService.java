package com.dxk.technology.member.feign;

import com.dxk.technology.common.api.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Date: 2021/11/13 0:18
 * @Author: DingXingKai
 * @Description:
 */
@FeignClient(value = "auth-service")
public interface AuthService {
    @PostMapping(value = "/oauth/token")
    CommonResult getAccessToken(@RequestParam Map<String, String> parameters);
}
