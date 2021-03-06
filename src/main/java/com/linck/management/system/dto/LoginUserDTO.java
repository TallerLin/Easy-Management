package com.linck.management.system.dto;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;

/**
 * @program: MyManagement
 * @description
 * @author: Linck
 * @create: 2020-08-09 17:45
 **/
public class LoginUserDTO {

    @ApiModelProperty(value = "账号",required = true)
    @NotBlank(message = "账户不能为空")
    private String account;

    @ApiModelProperty(value = "密码",required = true)
    @NotBlank(message = "密码不能为空")
    private String pwd;

    @ApiModelProperty(value = "验证码",required = true)
    @NotBlank(message = "验证码不能为空")
    private String verificationCode;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    @Override
    public String toString() {
        return "LoginUserDTO{" +
                "account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                '}';
    }
}
