package com.mdd.front.controller;

import com.mdd.common.aop.NotLogin;
import com.mdd.common.core.AjaxResult;
import com.mdd.front.service.IWechatService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import javax.validation.constraints.NotEmpty;
import java.util.Map;

@RestController
@RequestMapping("api/wechat")
@Tag(name = "微信管理")
public class WechatController {

    @Resource
    IWechatService iWechatService;

    @NotLogin
    @GetMapping("/jsConfig")
    @Operation(summary="微信jsConfig")
    public AjaxResult<Object> jsConfig(@Validated @NotEmpty() @RequestParam("url") String url) throws Exception {
        Map<String, Object> map = iWechatService.jsConfig(url);
        return AjaxResult.success(map);
    }

}
