package com.mdd.admin.controller.marketing;

import com.mdd.admin.service.IMarketingRechargeService;
import com.mdd.admin.validate.marketing.MarketingRechargeValidate;
import com.mdd.admin.vo.marketing.MarketingRechargeVo;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/marketing/recharge")
@Tag(name = "营销充值管理")
public class MarketingRechargeController {

    @Resource
    IMarketingRechargeService iMarketingRechargeService;

    @GetMapping("/detail")
    @Schema(description="充值配置详情")
    public AjaxResult<MarketingRechargeVo> detail() {
        MarketingRechargeVo vo = iMarketingRechargeService.detail();
        return AjaxResult.success(vo);
    }

    @PostMapping("/save")
    @Schema(description="充值配置保存")
    public AjaxResult<Object> save(@Validated @RequestBody MarketingRechargeValidate rechargeValidate) {
        iMarketingRechargeService.save(rechargeValidate);
        return AjaxResult.success();
    }

}
