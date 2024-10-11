package com.mdd.front.validate.login;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "扫码登录验证")
public class LoginScanValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "code参数缺失")
    @NotEmpty(message = "code不能为空")
    @Schema(description="微信code", required = true)
    private String code;

    @NotNull(message = "二维码已失效或不存在,请重新操作")
    @NotEmpty(message = "二维码已失效或不存在,请重新操作")
    @Schema(description="state码", required = true)
    private String state;

}
