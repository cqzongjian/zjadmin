package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISettingNoticeService;
import com.mdd.admin.vo.setting.SettingNoticeDetailVo;
import com.mdd.admin.vo.setting.SettingNoticeListedVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/setting/notice")
@Tag(name = "配置消息通知")
public class SettingNoticeController {

    @Resource
    ISettingNoticeService iSettingNoticeService;

    @GetMapping("/list")
    @Operation(summary="通知设置列表")
    public AjaxResult<List<SettingNoticeListedVo>> list(@RequestParam Integer recipient) {
        List<SettingNoticeListedVo> list = iSettingNoticeService.list(recipient);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="通知设置详情")
    public AjaxResult<SettingNoticeDetailVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        SettingNoticeDetailVo vo = iSettingNoticeService.detail(id);
        return AjaxResult.success(vo);
    }

    @Log(title = "通知设置编辑")
    @PostMapping("/save")
    @Operation(summary="通知设置编辑")
    public AjaxResult<Object> save(@RequestBody Map<String, Object> params) {
        iSettingNoticeService.save(params);
        return AjaxResult.success();
    }

}
