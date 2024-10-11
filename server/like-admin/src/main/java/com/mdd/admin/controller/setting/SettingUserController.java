package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingUserService;
import com.mdd.admin.validate.setting.SettingUserValidate;
import com.mdd.admin.vo.setting.SettingUserVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/setting/user")
@Tag(name = "配置用户参数")
public class SettingUserController {

    @Resource
    ISettingUserService iSettingUserService;

    @GetMapping("/detail")
    @Operation(summary="用户设置详情")
    public AjaxResult<SettingUserVo> detail() {
        SettingUserVo vo = iSettingUserService.detail();
        return AjaxResult.success(vo);
    }

    @Log(title = "用户设置编辑")
    @PostMapping("/save")
    @Operation(summary="用户设置编辑")
    public AjaxResult<Object> save(@Validated @RequestBody SettingUserValidate userValidate) {
        iSettingUserService.save(userValidate);
        return AjaxResult.success();
    }

}
