package com.mdd.admin.vo.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "部门Vo")
public class SystemAuthDeptVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="部门父级")
    private Integer pid;

    @Schema(description="部门名称")
    private String name;

    @Schema(description="负责人")
    private String duty;

    @Schema(description="联系电话")
    private String mobile;

    @Schema(description="排序编号")
    private Integer sort;

    @Schema(description="是否停用: [0=否, 1=是]")
    private Integer isStop;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

}
