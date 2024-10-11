package com.mdd.admin.vo.channel;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "H5渠道Vo")
public class ChannelH5Vo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="是否关闭")
    private Integer status;

    @Schema(description="关闭类型")
    private Integer close;

    @Schema(description="关闭访问")
    private String url;

}
