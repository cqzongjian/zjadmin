package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingCopyrightService;
import com.mdd.admin.validate.setting.SettingCopyrightValidate;
import com.mdd.admin.vo.setting.SettingCopyrightVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/setting/copyright")
@Tag(name = "配置网站版权")
public class SettingCopyrightController {

    @Resource
    ISettingCopyrightService iSettingCopyrightService;

    @GetMapping("/detail")
    @Operation(summary="网站版权信息")
    public AjaxResult<List<SettingCopyrightVo>> detail() {
        List<SettingCopyrightVo> list = iSettingCopyrightService.detail();
        return AjaxResult.success(list);
    }

    @Log(title = "网站版权编辑")
    @PostMapping("/save")
    @Operation(summary="网站版权编辑")
    public AjaxResult<Object> save(@Validated @RequestBody SettingCopyrightValidate copyrightValidate) {
        iSettingCopyrightService.save(copyrightValidate);
        return AjaxResult.success();
    }

}
