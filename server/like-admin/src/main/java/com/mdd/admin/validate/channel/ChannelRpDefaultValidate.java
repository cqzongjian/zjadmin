package com.mdd.admin.validate.channel;

import com.mdd.common.validator.annotation.IntegerContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "公众号默认回复参数")
public class ChannelRpDefaultValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotNull(message = "name参数缺失")
    @NotEmpty(message = "规则名称不能为空")
    @Schema(description="名称", required = true)
    private String name;

    @NotNull(message = "content参数缺失")
    @NotEmpty(message = "回复内容不能为空")
    @Schema(description="回复内容", required = true)
    private String content;

    @NotNull(message = "contentType参数缺失")
    @IntegerContains(values = {1, 2}, message = "contentType值不符合规范")
    @Schema(description="内容类型", required = true)
    private Integer contentType;

    @NotNull(message = "status参数缺失")
    @IntegerContains(values = {0, 1}, message = "状态选择异常")
    @Schema(description="状态", required = true)
    private Integer status;

    @NotNull(message = "sort参数缺失")
    @Schema(description="排序", required = true)
    private Integer sort;

}
