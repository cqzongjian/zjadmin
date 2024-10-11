package com.mdd.admin.vo.setting;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "政策协议详情Vo")
public class SettingProtocolDetailVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="服务协议")
    private SettingProtocolObjectVo service;

    @Schema(description="隐私协议")
    private SettingProtocolObjectVo privacy;

}
