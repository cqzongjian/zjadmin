package com.mdd.admin.controller.system;

import com.mdd.common.aop.NotLogin;
import com.mdd.common.aop.NotPower;
import com.mdd.admin.service.ISystemLoginService;
import com.mdd.admin.validate.system.SystemAdminLoginsValidate;
import com.mdd.admin.vo.system.SystemCaptchaVo;
import com.mdd.admin.vo.system.SystemLoginVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/system")
@Tag(name = "系统登录管理")
public class SystemLoginController {

    @Resource
    ISystemLoginService iSystemLoginService;

    @NotLogin
    @GetMapping("/captcha")
    @Operation(summary="取验证码")
    public AjaxResult<SystemCaptchaVo> captcha() {
        SystemCaptchaVo vo = iSystemLoginService.captcha();
        return AjaxResult.success(vo);
    }

    @NotLogin
    @PostMapping("/login")
    @Operation(summary="登录系统")
    public AjaxResult<SystemLoginVo> login(@Validated() @RequestBody SystemAdminLoginsValidate loginsValidate) {
        SystemLoginVo vo = iSystemLoginService.login(loginsValidate);
        return AjaxResult.success(vo);
    }

    @NotPower
    @PostMapping("/logout")
    @Operation(summary="退出登录")
    public AjaxResult<Object> logout(HttpServletRequest request) {
        iSystemLoginService.logout(request.getHeader("token"));
        return AjaxResult.success();
    }

}
