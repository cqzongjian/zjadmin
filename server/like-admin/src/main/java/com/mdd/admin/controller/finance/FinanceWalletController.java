package com.mdd.admin.controller.finance;

import com.mdd.admin.service.IFinanceWalletService;
import com.mdd.admin.validate.commons.PageValidate;
import com.mdd.admin.validate.finance.FinanceWalletSearchValidate;
import com.mdd.admin.vo.finance.FinanceWalletListVo;
import com.mdd.common.core.AjaxResult;
import com.mdd.common.core.PageResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/finance/wallet")
@Tag(name = "余额明细管理")
public class FinanceWalletController {

    @Resource
    IFinanceWalletService iFinanceWalletService;

    @GetMapping("/list")
    @Operation(summary="记录列表")
    public AjaxResult<Object> list(@Validated PageValidate pageValidate,
                                   @Validated FinanceWalletSearchValidate searchValidate) {
        PageResult<FinanceWalletListVo> list = iFinanceWalletService.list(pageValidate, searchValidate);
        return AjaxResult.success(list);
    }

}
