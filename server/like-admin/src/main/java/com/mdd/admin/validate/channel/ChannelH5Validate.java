package com.mdd.admin.validate.channel;

import com.mdd.common.validator.annotation.IntegerContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "H5渠道参数")
public class ChannelH5Validate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "status参数缺失")
    @IntegerContains(values = {0, 1}, message = "status不是合法值")
    @Schema(description="渠道状态", required = true)
    private Integer status;

    @NotNull(message = "close参数确实")
    @IntegerContains(values = {0, 1}, message = "close不是合法值")
    @Schema(description="渠道开关", required = true)
    private Integer close;

    @Length(max = 500, message = "url不能超500个字符")
    @Schema(description="关闭链接")
    private String url;

}
