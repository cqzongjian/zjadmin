package com.mdd.front.controller;

import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import com.mdd.front.LikeFrontThreadLocal;
import com.mdd.front.service.IRechargeService;
import com.mdd.front.validate.RechargeValidate;
import com.mdd.front.validate.common.PageValidate;
import com.mdd.front.vo.RechargeConfigVo;
import com.mdd.front.vo.RechargeRecordVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/api/recharge")
@Tag(name = "充值管理")
public class RechargeController {

    @Resource
    IRechargeService iRechargeService;

    @GetMapping("/config")
    @Operation(summary="充值配置")
    public AjaxResult<Object> config() {
        Integer userId = LikeFrontThreadLocal.getUserId();

        RechargeConfigVo vo = iRechargeService.config(userId);
        return AjaxResult.success(vo);
    }

    @GetMapping("/record")
    @Operation(summary="充值记录")
    public AjaxResult<Object> record(@Validated PageValidate pageValidate) {
        Integer userId = LikeFrontThreadLocal.getUserId();

        PageResult<RechargeRecordVo> list = iRechargeService.record(userId, pageValidate);
        return AjaxResult.success(list);
    }

    @PostMapping("/placeOrder")
    @Operation(summary="充值下单")
    public AjaxResult<Object> placeOrder(@Validated @RequestBody RechargeValidate rechargeValidate) {
        Integer userId = LikeFrontThreadLocal.getUserId();
        Integer terminal = LikeFrontThreadLocal.getTerminal();

        Map<String, Object> result = iRechargeService.placeOrder(userId, terminal, rechargeValidate);
        return AjaxResult.success(result);
    }

}
