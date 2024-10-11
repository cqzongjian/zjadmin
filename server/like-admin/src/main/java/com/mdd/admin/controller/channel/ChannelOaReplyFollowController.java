package com.mdd.admin.controller.channel;

import com.mdd.admin.service.IChannelOaReplyFollowService;
import com.mdd.admin.validate.channel.ChannelRpFollowsValidate;
import com.mdd.admin.validate.commons.IdValidate;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.vo.channel.ChannelRpFollowsVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/channel/oaReplyFollow")
@Tag(name = "公众号关注回复")
public class ChannelOaReplyFollowController {

    @Resource
    IChannelOaReplyFollowService iChannelOaReplyFollowService;

    @GetMapping("/list")
    @Operation(summary="关注回复列表")
    public AjaxResult<PageResult<ChannelRpFollowsVo>> list(@Validated PageValidate pageValidate) {
        PageResult<ChannelRpFollowsVo> list = iChannelOaReplyFollowService.list(pageValidate);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="关注回复详情")
    public AjaxResult<ChannelRpFollowsVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        ChannelRpFollowsVo vo = iChannelOaReplyFollowService.detail(id);
        return AjaxResult.success(vo);
    }

    @PostMapping("/add")
    @Operation(summary="关注回复新增")
    public AjaxResult<Object> add(@Validated @RequestBody ChannelRpFollowsValidate followsValidate) {
        iChannelOaReplyFollowService.add(followsValidate);
        return AjaxResult.success();
    }

    @PostMapping("/edit")
    @Operation(summary="关注回复编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody ChannelRpFollowsValidate followsValidate) {
        iChannelOaReplyFollowService.edit(followsValidate);
        return AjaxResult.success();
    }

    @PostMapping("/del")
    @Operation(summary="关注回复删除")
    public AjaxResult<Object> del(@Validated @RequestBody IdValidate idValidate) {
        iChannelOaReplyFollowService.del(idValidate.getId());
        return AjaxResult.success();
    }

    @PostMapping("/status")
    @Operation(summary="关注回复状态")
    public AjaxResult<Object> status(@Validated @RequestBody IdValidate idValidate) {
        iChannelOaReplyFollowService.status(idValidate.getId());
        return AjaxResult.success();
    }

}
