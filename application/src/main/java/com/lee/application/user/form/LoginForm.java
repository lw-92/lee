package com.lee.application.user.form;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author wei.li
 * @date 2018/10/9 21:56
 * @desc
 */
@ApiModel(value = "LoginForm",description="登录实体")
public class LoginForm {
    @ApiModelProperty(required=true,value="登录账号")
    private String loginName;
    @ApiModelProperty(required=true,value="登录密码")
    private String password;
    @ApiModelProperty(required=true,value="验证码")
    private String code;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
