package com.mdd.admin.vo.decorate;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@Schema(description = "装修底部导航Vo")
public class DecorateTabbarVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="样式")
    private Map<String, String> style;

    @Schema(description="列表")
    private List<DecorateTabsListsVo> list;

}
