package com.mdd.admin.controller.channel;

import com.mdd.admin.service.IChannelOpService;
import com.mdd.admin.validate.channel.ChannelOpValidate;
import com.mdd.admin.vo.channel.ChannelOpVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/channel/op")
@Tag(name = "微信开放渠道")
public class ChannelOpController {

    @Resource
    IChannelOpService iChannelOpService;

    @GetMapping("/detail")
    @Operation(summary="开放平台设置详情")
    public AjaxResult<Object> detail() {
        ChannelOpVo vo = iChannelOpService.detail();
        return AjaxResult.success(vo);
    }

    @PostMapping("/save")
    @Operation(summary="开放平台设置保存")
    public AjaxResult<Object> save(@Validated @RequestBody ChannelOpValidate opValidate) {
        iChannelOpService.save(opValidate);
        return AjaxResult.success();
    }

}
