package com.mdd.front.validate.common;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@Schema(description = "短信发送参数")
public class SmsValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "scene参数缺失")
    @Schema(description="场景码")
    private Integer scene;

    @NotNull(message = "mobile参数缺失")
    @NotEmpty(message = "手机号不能为空")
    @Length(min = 11, max = 11, message = "手机号只能为11位")
    @Pattern(regexp = "^[1][3,4,5,6,7,8,9][0-9]{9}$", message = "手机号格式有误")
    @Schema(description="手机号")
    private String mobile;

}
