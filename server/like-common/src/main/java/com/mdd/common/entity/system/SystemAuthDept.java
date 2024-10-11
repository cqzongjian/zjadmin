package com.mdd.common.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统岗位实体")
public class SystemAuthDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="上级部门")
    private Integer pid;

    @Schema(description="部门名称")
    private String name;

    @Schema(description="负责人名")
    private String duty;

    @Schema(description="联系电话")
    private String mobile;

    @Schema(description="排序编号")
    private Integer sort;

    @Schema(description="是否禁用: [0=否, 1=是]")
    private Integer isStop;

    @Schema(description="是否删除: [0=否, 1=是]")
    private Integer isDelete;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
