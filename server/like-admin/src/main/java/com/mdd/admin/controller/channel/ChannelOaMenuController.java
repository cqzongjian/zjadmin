package com.mdd.admin.controller.channel;

import com.alibaba.fastjson2.JSONArray;
import com.mdd.admin.service.IChannelOaMenusService;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/channel/oaMenu")
@Tag(name = "公众号菜单管理")
public class ChannelOaMenuController {

    @Resource
    IChannelOaMenusService iChannelOaMenusService;

    @GetMapping("/detail")
    @Operation(summary="菜单详情")
    public AjaxResult<JSONArray> detail() {
        JSONArray detail = iChannelOaMenusService.detail();
        return AjaxResult.success(detail);
    }

    @PostMapping("/save")
    @Operation(summary="仅是保存菜单")
    public AjaxResult<Object> save(@RequestBody List<Object> params) {
        iChannelOaMenusService.save(params, false);
        return AjaxResult.success();
    }

    @PostMapping("/publish")
    @Operation(summary="保存并发布菜单")
    public AjaxResult<Object> publish(@RequestBody List<Object> params) {
        iChannelOaMenusService.save(params, true);
        return AjaxResult.success();
    }

}
