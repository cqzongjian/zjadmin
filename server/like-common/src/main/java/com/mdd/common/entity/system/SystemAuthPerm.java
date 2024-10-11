package com.mdd.common.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统角色菜单实体")
public class SystemAuthPerm implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_UUID)
    @Schema(description="ID")
    private String id;

    @Schema(description="角色ID")
    private Integer roleId;

    @Schema(description="菜单ID")
    private Integer menuId;

}
