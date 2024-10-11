package com.mdd.admin.vo.setting;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "字典类型Vo")
public class SettingDictTypeVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="字典名称")
    private String dictName;

    @Schema(description="字典类型")
    private String dictType;

    @Schema(description="字典备注")
    private String dictRemark;

    @Schema(description="字典状态")
    private Integer dictStatus;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

}
