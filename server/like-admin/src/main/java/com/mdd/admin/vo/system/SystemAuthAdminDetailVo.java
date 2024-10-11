package com.mdd.admin.vo.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Schema(description = "管理员详情Vo")
public class SystemAuthAdminDetailVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="角色ID")
    private List<Integer> roleIds;

    @Schema(description="部门ID")
    private List<Integer> deptIds;

    @Schema(description="岗位ID")
    private List<Integer> postIds;

    @Schema(description="账号")
    private String username;

    @Schema(description="昵称")
    private String nickname;

    @Schema(description="头像")
    private String avatar;

    @Schema(description="多端登录: [0=否, 1=是]")
    private Integer isMultipoint;

    @Schema(description="是否禁用: [0=否, 1=是]")
    private Integer isDisable;

    @Schema(description="最后登录IP")
    private String lastLoginIp;

    @Schema(description="最后登录时间")
    private String lastLoginTime;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

}
