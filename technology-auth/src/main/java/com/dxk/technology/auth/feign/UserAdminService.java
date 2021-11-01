package com.dxk.technology.auth.feign;

import com.dxk.technology.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date: 2021/10/30 16:03
 * @Author: DingXingKai
 * @Description: 管理员远程接口
 */
@FeignClient(value = "member-service")
public interface UserAdminService {
    @GetMapping("/member/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);

}
