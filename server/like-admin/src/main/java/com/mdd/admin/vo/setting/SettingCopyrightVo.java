package com.mdd.admin.vo.setting;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "版权设置Vo")
public class SettingCopyrightVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="名称")
    private String name;

    @Schema(description="链接")
    private String link;

}
