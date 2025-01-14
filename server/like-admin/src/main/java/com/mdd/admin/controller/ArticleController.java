package com.mdd.admin.controller;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.IArticleService;
import com.mdd.admin.validate.article.ArticleCreateValidate;
import com.mdd.admin.validate.article.ArticleSearchValidate;
import com.mdd.admin.validate.article.ArticleUpdateValidate;

import com.mdd.admin.validate.commons.IdValidate;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.vo.article.ArticleDetailVo;
import com.mdd.admin.vo.article.ArticleListedVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/article")
@Tag(name = "文章数据管理")
public class ArticleController {

    @Resource
    IArticleService iArticleService;

    @GetMapping("/list")
    @Operation(summary="文章列表")
    public AjaxResult<PageResult<ArticleListedVo>> list(@Validated PageValidate pageValidate,
                                                        @Validated ArticleSearchValidate searchValidate) {
        PageResult<ArticleListedVo> vos = iArticleService.list(pageValidate, searchValidate);
        return AjaxResult.success(vos);
    }

    @GetMapping("/detail")
    @Operation(summary="文章详情")
    public AjaxResult<ArticleDetailVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        ArticleDetailVo vo = iArticleService.detail(id);
        return AjaxResult.success(vo);
    }

    @Log(title = "文章新增")
    @PostMapping("/add")
    @Operation(summary="文章新增")
    public AjaxResult<Object> add(@Validated @RequestBody ArticleCreateValidate createValidate) {
        iArticleService.add(createValidate);
        return AjaxResult.success();
    }

    @Log(title = "文章编辑")
    @PostMapping("/edit")
    @Operation(summary="文章编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody ArticleUpdateValidate updateValidate) {
        iArticleService.edit(updateValidate);
        return AjaxResult.success();
    }

    @Log(title = "文章删除")
    @PostMapping("/del")
    @Operation(summary="文章删除")
    public AjaxResult<Object> del(@Validated @RequestBody IdValidate idValidate) {
        iArticleService.del(idValidate.getId());
        return AjaxResult.success();
    }

    @Log(title = "文章状态")
    @PostMapping("/change")
    @Operation(summary="文章状态")
    public AjaxResult<Object> change(@Validated @RequestBody IdValidate idValidate) {
        iArticleService.change(idValidate.getId());
        return AjaxResult.success();
    }

}
