package com.mdd.admin.validate.finance;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "退款记录搜索参数")
public class FinanceRefundSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="筛选类型: -1=全部, 0=退款中, 1=退款成功, 2=退款失败")
    private Integer type;

    @Schema(description="用户信息")
    private String keyword;

    @Schema(description="退款单号")
    private String sn;

    @Schema(description="来源单号")
    private String orderSn;

    @Schema(description="退款类型: 1=后台退款")
    private Integer refundType;

    @Schema(description="开始时间")
    private Long startTime;

    @Schema(description="结束时间")
    private Long endTime;

}
