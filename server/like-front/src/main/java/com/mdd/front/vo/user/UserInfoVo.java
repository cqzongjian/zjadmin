package com.mdd.front.vo.user;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "个人信息Vo")
public class UserInfoVo implements Serializable {

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

    @Schema(description="用户性别")
    private String sex;

    @Schema(description="是否设置密码")
    private Boolean isPassword;

    @Schema(description="是否绑定微信")
    private Boolean isBindMnp;

    @Schema(description="版本信息")
    private String version;

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
