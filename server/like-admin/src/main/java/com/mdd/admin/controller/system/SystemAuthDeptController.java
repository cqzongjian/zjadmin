package com.mdd.admin.controller.system;

import com.alibaba.fastjson2.JSONArray;
import com.mdd.common.aop.NotPower;
import com.mdd.admin.service.ISystemAuthDeptService;
import com.mdd.admin.validate.commons.IdValidate;
import com.mdd.admin.validate.system.SystemDeptCreateValidate;
import com.mdd.admin.validate.system.SystemDeptSearchValidate;
import com.mdd.admin.validate.system.SystemDeptUpdateValidate;
import com.mdd.admin.vo.system.SystemAuthDeptVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/system/dept")
@Tag(name = "系统部门管理")
public class SystemAuthDeptController {

    @Resource
    ISystemAuthDeptService iSystemAuthDeptService;

    @NotPower
    @GetMapping("/all")
    @Operation(summary="部门所有")
    public AjaxResult<List<SystemAuthDeptVo>> all() {
        List<SystemAuthDeptVo> list = iSystemAuthDeptService.all();
        return AjaxResult.success(list);
    }

    @GetMapping("/list")
    @Operation(summary="部门列表")
    public AjaxResult<JSONArray> list(@Validated SystemDeptSearchValidate searchValidate) {
        JSONArray list = iSystemAuthDeptService.list(searchValidate);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="部门详情")
    public AjaxResult<SystemAuthDeptVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        SystemAuthDeptVo vo = iSystemAuthDeptService.detail(id);
        return AjaxResult.success(vo);
    }

    @PostMapping("/add")
    @Operation(summary="部门新增")
    public AjaxResult<Object> add(@Validated @RequestBody SystemDeptCreateValidate createValidate) {
        iSystemAuthDeptService.add(createValidate);
        return AjaxResult.success();
    }

    @PostMapping("/edit")
    @Operation(summary="部门编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody SystemDeptUpdateValidate updateValidate) {
        iSystemAuthDeptService.edit(updateValidate);
        return AjaxResult.success();
    }

    @PostMapping("/del")
    @Operation(summary="部门删除")
    public AjaxResult<Object> del(@Validated @RequestBody IdValidate idValidate) {
        iSystemAuthDeptService.del(idValidate.getId());
        return AjaxResult.success();
    }

}
