package com.mdd.admin.validate.setting;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "登录信息设置参数")
public class SettingLoginValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="登录方式")
    private String loginWay = "";

    @Schema(description="强制绑定手机")
    private Integer forceBindMobile = 0;

    @Schema(description="政策协议")
    private Integer openAgreement = 0;

    @Schema(description="第三方登录")
    private Integer openOtherAuth = 0;

    @Schema(description="微信开放平台")
    private String autoLoginAuth = "";

}
