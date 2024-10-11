package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingSmsService;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 短信设置管理
 */
@RestController
@RequestMapping("api/setting/sms")
@Tag(name = "配置短信引擎")
public class SettingSmsController {

    @Resource
    ISettingSmsService iSettingSmsService;

    @GetMapping("/list")
    @Operation(summary="短信引擎列表")
    public AjaxResult<List<Map<String, Object>>> list() {
        List<Map<String, Object>> list = iSettingSmsService.list();
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="短信引擎详情")
    public AjaxResult<Map<String, Object>> detail(String alias) {
        Map<String, Object> map = iSettingSmsService.detail(alias);
        return AjaxResult.success(map);
    }

    @Log(title = "短信引擎编辑")
    @PostMapping("/save")
    @Operation(summary="短信引擎编辑")
    public AjaxResult<Object> save(@RequestBody Map<String, String> params) {
        iSettingSmsService.save(params);
        return AjaxResult.success();
    }

}
