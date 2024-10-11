package com.mdd.admin.validate.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Schema(description = "系统登录参数")
public class SystemAdminLoginsValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "账号不能为空")
    @Length(min = 2, max = 20, message = "账号或密码错误")
    @Schema(description="登录账号", required = true)
    private String username;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, max = 18, message = "账号或密码错误")
    @Schema(description="登录密码", required = true)
    private String password;

    @Schema(description="验证码")
    private String code;

    @Schema(description="标识码")
    private String uuid;

}
