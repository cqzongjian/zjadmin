package com.mdd.admin.vo.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统登录Vo")
public class SystemLoginVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="管理员ID")
    private Integer id;

    @Schema(description="登录令牌")
    private String token;

}
