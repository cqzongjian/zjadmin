package com.mdd.admin.vo.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统岗位Vo")
public class SystemAuthPostVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="岗位编号")
    private String code;

    @Schema(description="岗位名称")
    private String name;

    @Schema(description="岗位备注")
    private String remarks;

    @Schema(description="岗位排序")
    private Integer sort;

    @Schema(description="是否停用: [0=否, 1=是]")
    private Integer isStop;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

}
