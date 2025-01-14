package com.mdd.admin.controller;

import com.mdd.admin.aop.Log;
import com.mdd.common.aop.NotPower;
import com.mdd.admin.service.IArtCateService;
import com.mdd.admin.validate.article.ArtCateCreateValidate;
import com.mdd.admin.validate.article.ArtCateUpdateValidate;
import com.mdd.admin.validate.article.ArtCateSearchValidate;
import com.mdd.admin.validate.commons.IdValidate;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.vo.article.ArticleCateVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/article/cate")
@Tag(name = "文章分类管理")
public class ArtCateController {

    @Resource
    IArtCateService iArtCateService;

    @NotPower
    @GetMapping("/all")
    @Operation(summary="所有分类")
    public AjaxResult<List<ArticleCateVo>> all() {
        List<ArticleCateVo> list = iArtCateService.all();
        return AjaxResult.success(list);
    }

    @GetMapping("/list")
    @Operation(summary="分类列表")
    public AjaxResult<PageResult<ArticleCateVo>> list(@Validated PageValidate pageValidate,
                                                      @Validated ArtCateSearchValidate searchValidate) {
        PageResult<ArticleCateVo> list = iArtCateService.list(pageValidate, searchValidate);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="分类详情")
    public AjaxResult<ArticleCateVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        ArticleCateVo vo = iArtCateService.detail(id);
        return AjaxResult.success(vo);
    }

    @Log(title = "文章分类新增")
    @PostMapping("/add")
    @Operation(summary="分类新增")
    public AjaxResult<Object> add(@Validated @RequestBody ArtCateCreateValidate createValidate) {
        iArtCateService.add(createValidate);
        return AjaxResult.success();
    }

    @Log(title = "文章分类编辑")
    @PostMapping("/edit")
    @Operation(summary="分类编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody ArtCateUpdateValidate updateValidate) {
        iArtCateService.edit(updateValidate);
        return AjaxResult.success();
    }

    @Log(title = "文章分类删除")
    @PostMapping("/del")
    @Operation(summary="分类删除")
    public AjaxResult<Object> del(@Validated @RequestBody IdValidate idValidate) {
        iArtCateService.del(idValidate.getId());
        return AjaxResult.success();
    }

    @Log(title = "文章分类状态")
    @PostMapping("/change")
    @Operation(summary="分类状态")
    public AjaxResult<Object> change(@Validated @RequestBody IdValidate idValidate) {
        iArtCateService.change(idValidate.getId());
        return AjaxResult.success();
    }

}
