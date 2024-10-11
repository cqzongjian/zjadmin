package com.mdd.common.entity.setting;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "字典类型实体")
public class DictType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="字典名称")
    private String dictName;

    @Schema(description="字典类型")
    private String dictType;

    @Schema(description="字典备注")
    private String dictRemark;

    @Schema(description="字典状态: [0=停用, 1=正常]")
    private Integer dictStatus;

    @Schema(description="是否删除: [0=否, 1=是]")
    private Integer isDelete;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
