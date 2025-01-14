package com.mdd.admin.controller.channel;

import com.mdd.admin.service.IChannelOaReplyDefaultService;
import com.mdd.admin.validate.channel.ChannelRpDefaultValidate;
import com.mdd.admin.validate.commons.IdValidate;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.vo.channel.ChannelRpDefaultVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/channel/oaReplyDefault")
@Tag(name = "公众号默认回复")
public class ChannelOaReplyDefaultController {

    @Resource
    IChannelOaReplyDefaultService iChannelOaReplyDefaultService;

    @GetMapping("/list")
    @Operation(summary="默认回复列表")
    public AjaxResult<PageResult<ChannelRpDefaultVo>> list(@Validated PageValidate pageValidate) {
        PageResult<ChannelRpDefaultVo> list = iChannelOaReplyDefaultService.list(pageValidate);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="默认回复详情")
    public AjaxResult<ChannelRpDefaultVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        ChannelRpDefaultVo vo = iChannelOaReplyDefaultService.detail(id);
        return AjaxResult.success(vo);
    }

    @PostMapping("/add")
    @Operation(summary="默认回复新增")
    public AjaxResult<Object> add(@Validated @RequestBody ChannelRpDefaultValidate defaultValidate) {
        iChannelOaReplyDefaultService.add(defaultValidate);
        return AjaxResult.success();
    }

    @PostMapping("/edit")
    @Operation(summary="默认回复编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody ChannelRpDefaultValidate defaultValidate) {
        iChannelOaReplyDefaultService.edit(defaultValidate);
        return AjaxResult.success();
    }

    @PostMapping("/del")
    @Operation(summary="默认回复删除")
    public AjaxResult<Object> del(@Validated @RequestBody IdValidate idValidate) {
        iChannelOaReplyDefaultService.del(idValidate.getId());
        return AjaxResult.success();
    }

    @PostMapping("/status")
    @Operation(summary="默认回复状态")
    public AjaxResult<Object> status(@Validated @RequestBody IdValidate idValidate) {
        iChannelOaReplyDefaultService.status(idValidate.getId());
        return AjaxResult.success();
    }

}
