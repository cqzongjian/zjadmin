package com.mdd.front.validate.login;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Schema(description = "微信登录参数")
public class LoginCodeValidate {

    @NotNull(message = "code参数缺失")
    @Schema(description="微信code", required = true)
    private String code;

}
