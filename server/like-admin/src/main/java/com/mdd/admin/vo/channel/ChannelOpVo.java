package com.mdd.admin.vo.channel;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "开发平台Vo")
public class ChannelOpVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="appId")
    private String appId;

    @Schema(description="appSecret")
    private String appSecret;

}
