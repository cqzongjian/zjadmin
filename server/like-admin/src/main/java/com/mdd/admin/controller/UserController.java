package com.mdd.admin.controller;

import com.mdd.admin.aop.Log;
import com.mdd.admin.service.IUserService;
import com.mdd.admin.validate.user.UserSearchValidate;
import com.mdd.admin.validate.user.UserUpdateValidate;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.validate.user.UserWalletValidate;
import com.mdd.admin.vo.user.UserVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.common.validator.annotation.IDMust;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/user")
@Tag(name = "用户数据管理")
public class UserController {

    @Resource
    IUserService iUserService;

    @GetMapping("/list")
    @Operation(summary="用户列表")
    public AjaxResult<PageResult<UserVo>> list(@Validated PageValidate pageValidate,
                                               @Validated UserSearchValidate searchValidate) {
        PageResult<UserVo> list = iUserService.list(pageValidate, searchValidate);
        return AjaxResult.success(list);
    }

    @GetMapping("/detail")
    @Operation(summary="用户详情")
    public AjaxResult<UserVo> detail(@Validated @IDMust() @RequestParam("id") Integer id) {
        UserVo vo = iUserService.detail(id);
        return AjaxResult.success(vo);
    }

    @Log(title = "用户编辑")
    @PostMapping("/edit")
    @Operation(summary="用户编辑")
    public AjaxResult<Object> edit(@Validated @RequestBody UserUpdateValidate updateValidate) {
        iUserService.edit(updateValidate);
        return AjaxResult.success();
    }

    @Log(title = "余额调整")
    @PostMapping("/adjustWallet")
    @Operation(summary="余额调整")
    public AjaxResult<Object> adjustWallet(@Validated @RequestBody UserWalletValidate walletValidate) {
        iUserService.adjustWallet(walletValidate);
        return AjaxResult.success();
    }

}
