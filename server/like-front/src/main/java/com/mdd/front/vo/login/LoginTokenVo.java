package com.mdd.front.vo.login;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统登录Vo")
public class LoginTokenVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="用户ID")
    private Integer id;

    @Schema(description="绑定手机")
    private Boolean isBindMobile;

    @Schema(description="登录令牌")
    private String token;

    @Schema(description="是否为新用户")
    private Integer isNew;

}
