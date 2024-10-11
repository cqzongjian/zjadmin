package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingProtocolService;
import com.mdd.admin.validate.setting.SettingProtocolValidate;
import com.mdd.admin.vo.setting.SettingProtocolDetailVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/setting/protocol")
@Tag(name = "配置政策协议")
public class SettingProtocolController {

    @Resource
    ISettingProtocolService iSettingProtocolService;

    @GetMapping("/detail")
    @Operation(summary="政策协议信息")
    public AjaxResult<SettingProtocolDetailVo> detail() {
        SettingProtocolDetailVo detail = iSettingProtocolService.detail();
        return AjaxResult.success(detail);
    }

    @Log(title = "政策协议编辑")
    @PostMapping("/save")
    @Operation(summary="政策协议编辑")
    public AjaxResult<Object> save(@Validated @RequestBody SettingProtocolValidate protocolValidate) {
        iSettingProtocolService.save(protocolValidate);
        return AjaxResult.success();
    }

}
