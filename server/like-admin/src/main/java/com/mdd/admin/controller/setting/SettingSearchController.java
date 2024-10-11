package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingSearchService;
import com.mdd.admin.validate.setting.SettingSearchValidate;
import com.mdd.admin.vo.setting.SettingSearchDetailVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("api/setting/search")
@Tag(name = "配置热门搜索")
public class SettingSearchController {

    @Resource
    ISettingSearchService iSettingSearchService;

    @GetMapping("/detail")
    @Operation(summary="热门搜索详情")
    public AjaxResult<SettingSearchDetailVo> detail() {
        SettingSearchDetailVo vo = iSettingSearchService.detail();
        return AjaxResult.success(vo);
    }

    @Log(title = "热门搜索编辑")
    @PostMapping("/save")
    @Operation(summary="热门搜索编辑")
    public AjaxResult<Object> save(@Validated @RequestBody SettingSearchValidate searchValidate) {
        iSettingSearchService.save(searchValidate);
        return AjaxResult.success();
    }

}
