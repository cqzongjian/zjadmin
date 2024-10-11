package com.mdd.front.validate.users;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "绑定微信小程序或公众号")
public class UserBindWechatValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "code参数缺失")
    @Schema(description="微信code", required = true)
    private String code;

}
