package com.mdd.admin.validate.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统操作日志搜索参数")
public class SystemSearchOperateValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="标题")
    private String title;

    @Schema(description="账号")
    private String username;

    @Schema(description="IP")
    private String ip;

    @Schema(description="类型")
    private String type;

    @Schema(description="状态")
    private String status;

    @Schema(description="路由")
    private String url;

    @Schema(description="开始时间")
    private String startTime;

    @Schema(description="结束时间")
    private String endTime;

}
