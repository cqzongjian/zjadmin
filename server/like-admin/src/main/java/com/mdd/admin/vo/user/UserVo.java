package com.mdd.admin.vo.user;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "用户Vo")
public class UserVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="用户ID")
    private Integer id;

    @Schema(description="用户编码")
    private Integer sn;

    @Schema(description="用户头像")
    private String avatar;

    @Schema(description="真实姓名")
    private String realName;

    @Schema(description="用户昵称")
    private String nickname;

    @Schema(description="登录账号")
    private String username;

    @Schema(description="手机号码")
    private String mobile;

    @Schema(description="用户性别")
    private String sex;

    @Schema(description="注册渠道")
    private String channel;

    @Schema(description="最后登录IP")
    private String lastLoginIp;

    @Schema(description="最后登录时间")
    private String lastLoginTime;

    @Schema(description="创建时间")
    private String createTime;

    public void setSex(Integer sex) {
        switch (sex) {
            case 0:
                this.sex = "未知";
                break;
            case 1:
                this.sex = "男";
                break;
            case 2:
                this.sex = "女";
                break;
        }
    }

}
