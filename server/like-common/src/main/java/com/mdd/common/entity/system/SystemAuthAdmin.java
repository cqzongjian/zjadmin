package com.mdd.common.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统管理员实体")
public class SystemAuthAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type=IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="用户账号")
    private String nickname;

    @Schema(description="用户昵称")
    private String username;

    @Schema(description="用户密码")
    private String password;

    @Schema(description="用户头像")
    private String avatar;

    @Schema(description="加密盐巴")
    private String salt;

    @Schema(description="角色主键")
    private String roleIds;

    @Schema(description="部门主键")
    private String deptIds;

    @Schema(description="岗位主键")
    private String postIds;

    @Schema(description="排序编号")
    private Integer sort;

    @Schema(description="多端登录: [0=否, 1=是]")
    private Integer isMultipoint;

    @Schema(description="是否禁用: [0=否, 1=是]")
    private Integer isDisable;

    @Schema(description="是否删除: [0=否, 1=是]")
    private Integer isDelete;

    @Schema(description="最后登录IP")
    private String lastLoginIp;

    @Schema(description="最后登录时间")
    private Long lastLoginTime;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
