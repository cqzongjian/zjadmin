package com.mdd.front.validate.users;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "微信手机参数")
public class UserPhoneMnpValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "code参数缺失")
    @Schema(description="微信code", required = true)
    private String code;

}
