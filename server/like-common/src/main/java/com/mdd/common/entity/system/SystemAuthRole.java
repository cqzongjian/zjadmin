package com.mdd.common.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统角色实体")
public class SystemAuthRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="角色名称")
    private String name;

    @Schema(description="备注信息")
    private String remark;

    @Schema(description="角色排序")
    private Integer sort;

    @Schema(description="是否禁用: [0=否, 1=是]")
    private Integer isDisable;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;   

}
