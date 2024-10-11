package com.mdd.admin.vo.setting;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "通知设置列表Vo")
public class SettingNoticeListedVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="通知名称")
    private String name;

    @Schema(description="通知类型")
    private String type;

    @Schema(description="通知状态")
    private Integer systemStatus;

    @Schema(description="通知状态")
    private Integer smsStatus;

    @Schema(description="公众号状态")
    private Integer oaStatus;

    @Schema(description="小程序状态")
    private Integer mnpStatus;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

}
