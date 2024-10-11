package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingWebsiteService;
import com.mdd.admin.validate.setting.SettingWebsiteValidate;
import com.mdd.admin.vo.setting.SettingWebsiteVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("api/setting/website")
@Tag(name = "配置网站信息")
public class SettingWebsiteController {

    @Resource
    ISettingWebsiteService iSettingWebsiteService;

    @GetMapping("/detail")
    @Operation(summary="网站配置信息")
    public AjaxResult<SettingWebsiteVo> detail() {
        SettingWebsiteVo detail = iSettingWebsiteService.detail();
        return AjaxResult.success(detail);
    }

    @Log(title = "网站配置编辑")
    @PostMapping("/save")
    @Operation(summary="网站配置编辑")
    public AjaxResult<Object> save(@Validated @RequestBody SettingWebsiteValidate websiteValidate) {
        iSettingWebsiteService.save(websiteValidate);
        return AjaxResult.success();
    }

}
