package com.mdd.admin.validate.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统管理员搜索参数")
public class SystemAdminSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="登录账号")
    private String username;

    @Schema(description="用户昵称")
    private String nickname;

    @Schema(description="角色ID")
    private Integer role;

}
