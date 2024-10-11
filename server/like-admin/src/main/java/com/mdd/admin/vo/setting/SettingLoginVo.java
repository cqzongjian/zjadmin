package com.mdd.admin.vo.setting;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Schema(description = "登录设置Vo")
public class SettingLoginVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="登录方式")
    private List<Integer> loginWay;

    @Schema(description="强制绑定手机")
    private Integer forceBindMobile;

    @Schema(description="是否开启协议")
    private Integer openAgreement;

    @Schema(description="第三方的登录")
    private Integer openOtherAuth;

    @Schema(description="自动登录授权")
    private List<Integer> autoLoginAuth;

}
