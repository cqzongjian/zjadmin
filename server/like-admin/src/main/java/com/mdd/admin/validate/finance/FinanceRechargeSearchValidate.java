package com.mdd.admin.validate.finance;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "充值订单搜索参数")
public class FinanceRechargeSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="订单编号")
    private String sn;

    @Schema(description="关键词")
    private String keyword;

    @Schema(description="支付方式")
    private Integer payWay;

    @Schema(description="支付状态")
    private Integer payStatus;

    @Schema(description="开始时间")
    private Integer startTime;

    @Schema(description="结束时间")
    private Integer endTime;

}
