package com.mdd.admin.controller;

import com.mdd.common.aop.NotLogin;
import com.mdd.admin.service.IIndexService;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("api/index")
@Tag(name = "主页数据管理")
public class IndexController {

    @Resource
    IIndexService iIndexService;

    @GetMapping("/console")
    @Operation(summary="控制台")
    public AjaxResult<Map<String, Object>> console() {
        Map<String, Object> map = iIndexService.console();
        return AjaxResult.success(map);
    }

    @NotLogin
    @GetMapping("/config")
    @Operation(summary="公共配置")
    public AjaxResult<Map<String, Object>> config() {
        Map<String, Object> map = iIndexService.config();
        return AjaxResult.success(map);
    }

}
