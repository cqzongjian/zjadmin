package com.mdd.admin.validate.article;

import com.mdd.common.validator.annotation.IntegerContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "文章分类创建参数")
public class ArtCateCreateValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "分类名称不能为空")
    @Length(min = 1, max = 60, message = "分类名称不能大于60个字符")
    @Schema(description="分类名称", required = true)
    private String name;

    @NotNull(message = "排序号不能为空")
    @DecimalMin(value = "0", message = "排序号值不能少于0")
    @Schema(description="排序", required = true)
    private Integer sort;

    @NotNull(message = "缺少isShow参数")
    @IntegerContains(values = {0, 1}, message = "isShow不是合法值")
    @Schema(description="是否显示", required = true)
    private Integer isShow;

}
