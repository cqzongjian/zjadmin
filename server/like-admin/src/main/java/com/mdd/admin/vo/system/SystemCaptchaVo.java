package com.mdd.admin.vo.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "验证码")
public class SystemCaptchaVo {

    @Schema(description="标识")
    private String uuid;

    @Schema(description="图片")
    private String img;

}
