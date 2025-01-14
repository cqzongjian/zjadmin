package com.mdd.admin.controller.decorate;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.IDecoratePageService;
import com.mdd.admin.validate.decorate.DecoratePageValidate;
import com.mdd.admin.vo.decorate.DecoratePageVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/decorate/pages")
@Tag(name = "装修页面管理")
public class DecoratePagesController {

    @Resource
    IDecoratePageService iDecoratePageService;

    @GetMapping("/detail")
    @Operation(summary="页面装修详情")
    public AjaxResult<DecoratePageVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        DecoratePageVo vo = iDecoratePageService.detail(id);
        return AjaxResult.success(vo);
    }

    @Log(title = "页面装修保存")
    @PostMapping("/save")
    @Operation(summary="页面装修保存")
    public AjaxResult<Object> save(@RequestBody DecoratePageValidate decoratePageValidate) {
        iDecoratePageService.save(decoratePageValidate);
        return AjaxResult.success();
    }

}
