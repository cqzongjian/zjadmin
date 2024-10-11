package com.mdd.admin.controller.decorate;

import com.mdd.common.aop.NotPower;
import com.mdd.admin.service.IDecorateDataService;
import com.mdd.admin.vo.decorate.DecorateDataArticleVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/decorate/data")
@Tag(name = "装修数据管理")
public class DecorateDataController {

    @Resource
    IDecorateDataService iDecorateDataService;

    @NotPower
    @GetMapping("/article")
    @Operation(summary="获取文章数据")
    public AjaxResult<List<DecorateDataArticleVo>> article(@RequestParam(defaultValue = "10") Integer limit) {
        List<DecorateDataArticleVo> list = iDecorateDataService.article(limit);
        return AjaxResult.success(list);
    }

}
