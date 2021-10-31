package com.dxk.technology.member.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * @Date: 2021/10/26 11:24
 * @Author: DingXingKai
 * @Description: 会员登录参数实体
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MemberLoginParamDTO {
    @NotEmpty
    @ApiModelProperty(value = "用户名")
    private String username;

    @NotEmpty
    @ApiModelProperty(value = "密码")
    private String password;
}
