package com.mdd.admin.vo.decorate;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "装修页面Vo")
public class DecoratePageVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="id")
    private Integer id;

    @Schema(description="页面类型")
    private Integer pageType;

    @Schema(description="页面数据")
    private String pageData;

}
