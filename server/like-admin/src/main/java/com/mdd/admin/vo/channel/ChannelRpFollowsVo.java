package com.mdd.admin.vo.channel;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "公众号关注回复Vo")
public class ChannelRpFollowsVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="id")
    private Integer id;

    @Schema(description="规则名")
    private String name;

    @Schema(description="回复内容")
    private String content;

    @Schema(description="内容类型: [1=文本]")
    private Integer contentType;

    @Schema(description="排序编号")
    private Integer sort;

    @Schema(description="启动状态: [1=启动, 0=关闭]")
    private Integer status;

}
