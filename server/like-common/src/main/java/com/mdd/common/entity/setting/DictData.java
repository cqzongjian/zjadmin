package com.mdd.common.entity.setting;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "字典数据实体")
public class DictData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="类型")
    private Integer typeId;

    @Schema(description="键名")
    private String name;

    @Schema(description="数值")
    private String value;

    @Schema(description="备注")
    private String remark;

    @Schema(description="排序")
    private Integer sort;

    @Schema(description="状态: [0=停用, 1-正常]")
    private Integer status;

    @Schema(description="是否删除: [0=否, 1=是]")
    private Integer isDelete;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
