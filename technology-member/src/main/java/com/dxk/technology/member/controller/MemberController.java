package com.dxk.technology.member.controller;

import com.dxk.technology.common.api.CommonResult;
import com.dxk.technology.member.dto.MemberLoginParamDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2021/10/25 23:09
 * @Author: DingXingKai
 * @Description: 会员控制层
 */
@Api(tags = "MemberController", description = "会员用户控制层")
@RestController
@RequestMapping(value = "/member")
public class MemberController {

    @ApiOperation(value = "会员登录")
    @PostMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    public CommonResult login(@Validated @RequestBody MemberLoginParamDTO memberLoginParamDTO) {
        return CommonResult.success(null);
    }

}
