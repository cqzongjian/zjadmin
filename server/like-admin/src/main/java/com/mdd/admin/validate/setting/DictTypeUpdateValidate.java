package com.mdd.admin.validate.setting;

import com.mdd.common.validator.annotation.IDMust;
import com.mdd.common.validator.annotation.IntegerContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "字典类型更新参数")
public class DictTypeUpdateValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @IDMust(message = "id参数必传且需大于0")
    @Schema(description="ID", required = true)
    private Integer id;

    @NotNull(message = "dictName参数缺失")
    @Length(max = 200, message = "名称不能超出200个字符")
    @Schema(description="名称", required = true)
    private String dictName;

    @NotNull(message = "dictType参数缺失")
    @Length(max = 200, message = "类型不能超出200个字符")
    @Schema(description="类型", required = true)
    private String dictType;

    @Length(max = 200, message = "备注不能超出200个字符")
    @Schema(description="备注")
    private String dictRemark;

    @NotNull(message = "dictStatus参数缺失")
    @IntegerContains(values = {0, 1}, message = "dictStatus参数不在合法值内")
    @Schema(description="状态", required = true)
    private Integer dictStatus;

}
