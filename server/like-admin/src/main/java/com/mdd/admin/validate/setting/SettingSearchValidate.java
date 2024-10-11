package com.mdd.admin.validate.setting;

import com.mdd.admin.vo.setting.SettingSearchObjectVo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Schema(description = "热门搜索设置参数")
public class SettingSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="是否开启热门搜索")
    private Integer isHotSearch;

    @Schema(description="关键词列表")
    private List<SettingSearchObjectVo> list;

}
