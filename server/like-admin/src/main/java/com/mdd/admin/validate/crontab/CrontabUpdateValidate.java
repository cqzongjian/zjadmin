package com.mdd.admin.validate.crontab;

import com.mdd.common.validator.annotation.IDMust;
import com.mdd.common.validator.annotation.IntegerContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "计划任务更新参数")
public class CrontabUpdateValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @IDMust(message = "id参数必传且需大于0")
    @Schema(description="id", required = true)
    private Integer id;

    @NotNull(message = "types参数缺失")
    @Schema(description="任务分组", required = true)
    private String types;

    @NotNull(message = "name参数缺失")
    @Schema(description="任务名称", required = true)
    private String name;

    @NotNull(message = "command参数缺失")
    @Schema(description="执行指令", required = true)
    private String command;

    @NotNull(message = "rules参数缺失")
    @Schema(description="执行规则", required = true)
    private String rules;

    @Length(max = 200, message = "remark参数不能超出200个字符")
    @Schema(description="备注")
    private String remark;

    @NotNull(message = "status参数缺失")
    @IntegerContains(values = {1, 2, 3}, message = "status参数取值异常")
    @Schema(description="状态", required = true)
    private Integer status;

    @NotNull(message = "strategy参数缺失")
    @IntegerContains(values = {1, 2, 3}, message = "strategy参数取值异常")
    @Schema(description="strategy", required = true)
    private Integer strategy;

    @NotNull(message = "concurrent参数缺失")
    @IntegerContains(values = {0, 1}, message = "concurrent参数取值异常")
    @Schema(description="concurrent", required = true)
    private Integer concurrent;

}
