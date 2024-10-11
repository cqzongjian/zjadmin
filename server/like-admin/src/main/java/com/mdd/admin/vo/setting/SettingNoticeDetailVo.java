package com.mdd.admin.vo.setting;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "通知设置详情Vo")
public class SettingNoticeDetailVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="id")
    private Integer id;

    @Schema(description="场景名称")
    private String name;

    @Schema(description="通知类型: [1=业务, 2=验证]")
    private String type;

    @Schema(description="场景描述")
    private String remarks;

    @Schema(description="系统的通知设置")
    private Object systemNotice;

    @Schema(description="公众号通知设置")
    private Object oaNotice;

    @Schema(description="小程序通知设置")
    private Object mnpNotice;

    @Schema(description="短信的通知设置")
    private Object smsNotice;

}
