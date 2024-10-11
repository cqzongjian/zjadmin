package com.mdd.admin.vo.setting;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "政策协议设置对象Vo")
public class SettingProtocolObjectVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="协议名称")
    private String name;

    @Schema(description="协议内容")
    private String content;

}
