package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingLoginService;
import com.mdd.admin.validate.setting.SettingLoginValidate;
import com.mdd.admin.vo.setting.SettingLoginVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("api/setting/login")
@Tag(name = "配置用户登录")
public class SettingLoginController {

    @Resource
    ISettingLoginService iSettingLoginService;

    @GetMapping("/detail")
    @Operation(summary="登录设置详情")
    public AjaxResult<SettingLoginVo> detail() {
        SettingLoginVo vo = iSettingLoginService.detail();
        return AjaxResult.success(vo);
    }

    @Log(title = "登录设置编辑")
    @PostMapping("/save")
    @Operation(summary="登录设置编辑")
    public AjaxResult<Object> save(@Validated @RequestBody SettingLoginValidate loginValidate) {
        iSettingLoginService.save(loginValidate);
        return AjaxResult.success();
    }

}
