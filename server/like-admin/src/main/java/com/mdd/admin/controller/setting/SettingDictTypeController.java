package com.mdd.admin.controller.setting;

import com.mdd.admin.aop.Log;
import com.mdd.common.aop.NotPower;
import com.mdd.admin.service.ISettingDictTypeService;
import com.mdd.admin.validate.commons.IdsValidate;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.validate.setting.DictTypeCreateValidate;
import com.mdd.admin.validate.setting.DictTypeUpdateValidate;
import com.mdd.admin.vo.setting.SettingDictTypeVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/setting/dict/type")
@Tag(name = "配置字典类型")
public class SettingDictTypeController {

    @Resource
    ISettingDictTypeService iSettingDictTypeService;

    @NotPower
    @GetMapping("/all")
    @Operation(summary="字典类型所有")
    public AjaxResult<List<SettingDictTypeVo>> all() {
        List<SettingDictTypeVo> list = iSettingDictTypeService.all();
        return AjaxResult.success(list);
    }

    @GetMapping("/list")
    @Operation(summary="字典类型列表")
    public AjaxResult<PageResult<SettingDictTypeVo>> list(@Validated PageValidate pageValidate,
                       @RequestParam Map<String, String> params) {
        PageResult<SettingDictTypeVo> list = iSettingDictTypeService.list(pageValidate, params);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="字典类型详情")
    public AjaxResult<SettingDictTypeVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        SettingDictTypeVo vo = iSettingDictTypeService.detail(id);
        return AjaxResult.success(vo);
    }

    @Log(title = "字典类型新增")
    @PostMapping("/add")
    @Operation(summary="字典类型新增")
    public AjaxResult<Object> add(@Validated @RequestBody DictTypeCreateValidate createValidate) {
        iSettingDictTypeService.add(createValidate);
        return AjaxResult.success();
    }

    @Log(title = "字典类型编辑")
    @PostMapping("/edit")
    @Operation(summary="字典类型编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody DictTypeUpdateValidate updateValidate) {
        iSettingDictTypeService.edit(updateValidate);
        return AjaxResult.success();
    }

    @Log(title = "字典类型删除")
    @PostMapping("/del")
    @Operation(summary="字典类型删除")
    public AjaxResult<Object> del(@Validated @RequestBody IdsValidate idsValidate) {
        iSettingDictTypeService.del(idsValidate.getIds());
        return AjaxResult.success();
    }

}
