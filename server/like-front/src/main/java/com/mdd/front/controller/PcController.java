package com.mdd.front.controller;

import com.mdd.common.aop.NotLogin;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.validator.annotation.IDMust;
import com.mdd.front.LikeFrontThreadLocal;
import com.mdd.front.service.IPcService;
import com.mdd.front.vo.article.PcArticleCenterVo;
import com.mdd.front.vo.article.PcArticleDetailVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/pc")
@Tag(name = "电脑管理")
public class PcController {

    @Resource
    IPcService iPcService;

    @NotLogin
    @GetMapping("/index")
    @Operation(summary="主页数据")
    public AjaxResult<Map<String,Object>> index() {
        Map<String, Object> index = iPcService.index();
        return AjaxResult.success(index);
    }

    @NotLogin
    @GetMapping("/getConfig")
    @Operation(summary="公共配置")
    public AjaxResult<Map<String, Object>> getConfig() {
        Map<String, Object> config = iPcService.getConfig();
        return AjaxResult.success(config);
    }

    @NotLogin
    @GetMapping("/articleCenter")
    @Operation(summary="资讯中心")
    public AjaxResult<List<PcArticleCenterVo>> articleCenter() {
        List<PcArticleCenterVo> list = iPcService.articleCenter();
        return AjaxResult.success(list);
    }

    @NotLogin
    @GetMapping("/articleDetail")
    @Operation(summary="文章详情")
    public AjaxResult<PcArticleDetailVo> articleDetail(@Validated @IDMust() @RequestParam("id") Integer id) {
        Integer userId = LikeFrontThreadLocal.getUserId();

        PcArticleDetailVo vo = iPcService.articleDetail(id, userId);
        return AjaxResult.success(vo);
    }

}
