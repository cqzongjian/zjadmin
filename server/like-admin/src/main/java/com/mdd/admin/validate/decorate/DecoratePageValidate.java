package com.mdd.admin.validate.decorate;

import com.mdd.common.validator.annotation.IDMust;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "页面装修参数")
public class DecoratePageValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @IDMust(message = "id参数必传且需大于0")
    @Schema(description="id", required = true)
    private Integer id;

    @NotNull(message = "pageData参数缺失")
    @Schema(description="装修数据", required = true)
    private String pageData;

}
