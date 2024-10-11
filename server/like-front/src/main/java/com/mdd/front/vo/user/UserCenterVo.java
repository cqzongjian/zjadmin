package com.mdd.front.vo.user;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Schema(description = "个人中心Vo")
public class UserCenterVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="用户ID")
    private Integer id;

    @Schema(description="用户编号")
    private Integer sn;

    @Schema(description="用户头像")
    private String avatar;

    @Schema(description="真实姓名")
    private String realName;

    @Schema(description="用户昵称")
    private String nickname;

    @Schema(description="用户账号")
    private String username;

    @Schema(description="手机号码")
    private String mobile;

    @Schema(description="钱包余额")
    private BigDecimal money;

    @Schema(description="是否新用户")
    private Integer isNew;

    @Schema(description="是否绑定微信")
    private Boolean isBindWechat;

    @Schema(description="是否有设置登录密码")
    private Boolean hasPwd;

}
