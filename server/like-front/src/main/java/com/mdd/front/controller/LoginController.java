package com.mdd.front.controller;

import com.mdd.common.aop.NotLogin;
import com.mdd.common.core.AjaxResult;
import com.mdd.front.LikeFrontThreadLocal;
import com.mdd.front.service.ILoginService;
import com.mdd.front.validate.login.*;
import com.mdd.front.vo.login.LoginUrlsVo;
import com.mdd.front.vo.login.LoginTokenVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;

@Slf4j
@RestController
@RequestMapping("/api/login")
@Tag(name = "登录管理")
public class LoginController {

    @Resource
    ILoginService iLoginService;

    @NotLogin
    @PostMapping("/register")
    @Operation(summary="注册账号")
    public AjaxResult<Object> register(@Validated @RequestBody RegisterValidate registerValidate) {
        Integer terminal = LikeFrontThreadLocal.getTerminal();
        String username = registerValidate.getUsername();
        String password = registerValidate.getPassword();

        iLoginService.register(username, password, terminal);
        return AjaxResult.success();
    }

    @NotLogin
    @PostMapping("/accountLogin")
    @Operation(summary="账号登录")
    public AjaxResult<LoginTokenVo> accountLogin(@Validated @RequestBody LoginPwdValidate loginPwdValidate) {
        Integer terminal = LikeFrontThreadLocal.getTerminal();
        String username = loginPwdValidate.getUsername();
        String password = loginPwdValidate.getPassword();

        LoginTokenVo vo = iLoginService.accountLogin(username, password, terminal);
        return AjaxResult.success(vo);
    }

    @NotLogin
    @PostMapping("/mobileLogin")
    @Operation(summary="手机登录")
    public AjaxResult<LoginTokenVo> mobileLogin(@Validated @RequestBody LoginPhoneValidate loginPhoneValidate) {
        Integer terminal = LikeFrontThreadLocal.getTerminal();
        String mobile = loginPhoneValidate.getMobile();
        String code = loginPhoneValidate.getCode();

        LoginTokenVo vo = iLoginService.mobileLogin(mobile, code, terminal);
        return AjaxResult.success(vo);
    }

    @NotLogin
    @PostMapping("/mnpLogin")
    @Operation(summary="微信登录")
    public AjaxResult<LoginTokenVo> mnpLogin(@Validated @RequestBody LoginCodeValidate loginCodeValidate) {
        Integer terminal = LikeFrontThreadLocal.getTerminal();
        String code = loginCodeValidate.getCode();

        LoginTokenVo vo = iLoginService.mnpLogin(code, terminal);
        return AjaxResult.success(vo);
    }

    @NotLogin
    @PostMapping("/oaLogin")
    @Operation(summary="公众号登录")
    public AjaxResult<LoginTokenVo> oaLogin(@Validated @RequestBody LoginCodeValidate loginCodeValidate) {
        Integer terminal = LikeFrontThreadLocal.getTerminal();
        String code = loginCodeValidate.getCode();

        LoginTokenVo vo = iLoginService.officeLogin(code, terminal);
        return AjaxResult.success(vo);
    }

    @NotLogin
    @GetMapping("/oaCodeUrl")
    @Operation(summary="公众号链接")
    public AjaxResult<LoginUrlsVo> oaCodeUrl(@Validated @NotNull() @RequestParam("url") String url) {
        LoginUrlsVo vo = new LoginUrlsVo();
        vo.setUrl(iLoginService.oaCodeUrl(url));
        return AjaxResult.success(vo);
    }

    @NotLogin
    @GetMapping("/scanCodeUrl")
    @Operation(summary="PC扫码链接")
    public AjaxResult<LoginUrlsVo> scanCodeUrl(@Validated @NotNull() @RequestParam("url") String url, HttpSession session) {
        String qrcodeUrl = iLoginService.scanCodeUrl(url, session);
        LoginUrlsVo vo = new LoginUrlsVo();
        vo.setUrl(qrcodeUrl);
        return AjaxResult.success(vo);
    }

    @NotLogin
    @PostMapping("/scanLogin")
    @Operation(summary="PC扫码登录")
    public AjaxResult<Object> scanLogin(@Validated @RequestBody LoginScanValidate loginScanValidate, HttpSession session) {
        Integer terminal = LikeFrontThreadLocal.getTerminal();
        String code = loginScanValidate.getCode();
        String state = loginScanValidate.getState();

        LoginTokenVo vo = iLoginService.scanLogin(code, state, terminal, session);
        return AjaxResult.success(vo);
    }

}
