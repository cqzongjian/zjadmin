package com.mdd.front.validate.users;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@Schema(description = "忘记密码参数")
public class UserForgetPwdValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "mobile参数缺失")
    @NotEmpty(message = "手机号不能为空")
    @Length(min = 11, max = 11, message = "手机号只能为11位")
    @Pattern(regexp = "^[1][3,4,5,6,7,8,9][0-9]{9}$", message = "手机号格式有误")
    @Schema(description="手机号", required = true)
    private String mobile;

    @NotNull(message = "code参数缺失")
    @NotEmpty(message = "验证码不能为空")
    @Schema(description="验证码", required = true)
    private String code;

    @NotNull(message = "password参数缺失")
    @NotEmpty(message = "新密码不能为空")
    @Schema(description="新密码", required = true)
    private String password;

}