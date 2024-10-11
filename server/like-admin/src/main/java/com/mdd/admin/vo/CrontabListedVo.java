package com.mdd.admin.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "计划任务列表Vo")
public class CrontabListedVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="任务ID")
    private Integer id;           // 执行ID

    @Schema(description="任务分组")
    private String groups;

    @Schema(description="任务名称")
    private String name;

    @Schema(description="执行命令")
    private String command;

    @Schema(description="执行规则")
    private String rules;

    @Schema(description="错误信息")
    private String error;

    @Schema(description="执行状态: [1=正在运行, 2=任务停止, 3=发生错误]")
    private Integer status;

    @Schema(description="执行策略: [1=立即执行, 2=执行一次, 3=放弃执行]")
    private Integer strategy;

    @Schema(description="并发执行: [0=否, 1=是]")
    private Integer concurrent;

    @Schema(description="开始时间")
    private String startTime;

    @Schema(description="结束时间")
    private String endTime;

    @Schema(description="执行耗时")
    private Long taskTime;

}
