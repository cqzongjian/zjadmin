package com.mdd.admin.controller;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ICrontabService;
import com.mdd.admin.validate.crontab.CrontabCreateValidate;
import com.mdd.admin.validate.crontab.CrontabUpdateValidate;
import com.mdd.admin.validate.commons.IdValidate;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.vo.CrontabDetailVo;
import com.mdd.admin.vo.CrontabListedVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.quartz.SchedulerException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/crontab")
@Tag(name = "计划任务管理")
public class CrontabController {

    @Resource
    ICrontabService iCrontabService;

    @GetMapping("/list")
    @Operation(summary="计划任务列表")
    public AjaxResult< PageResult<CrontabListedVo>> list(@Validated PageValidate pageValidate) {
        PageResult<CrontabListedVo> list = iCrontabService.list(pageValidate);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="计划任务详情")
    public AjaxResult<Object> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        CrontabDetailVo vo = iCrontabService.detail(id);
        return AjaxResult.success(vo);
    }

    @Log(title = "计划任务新增")
    @PostMapping("/add")
    @Operation(summary="计划任务新增")
    public AjaxResult<Object> add(@Validated @RequestBody CrontabCreateValidate createValidate) throws SchedulerException {
        iCrontabService.add(createValidate);
        return AjaxResult.success();
    }

    @Log(title = "计划任务编辑")
    @PostMapping("/edit")
    @Operation(summary="计划任务编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody CrontabUpdateValidate updateValidate) throws SchedulerException {
        iCrontabService.edit(updateValidate);
        return AjaxResult.success();
    }

    @Log(title = "计划任务删除")
    @PostMapping("/del")
    @Operation(summary="计划任务删除")
    public AjaxResult<Object> del(@Validated @RequestBody IdValidate idValidate) throws SchedulerException {
        iCrontabService.del(idValidate.getId());
        return AjaxResult.success();
    }

}
