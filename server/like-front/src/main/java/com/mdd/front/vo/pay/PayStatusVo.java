package com.mdd.front.vo.pay;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Schema(description = "支付状态Vo")
public class PayStatusVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="支付状态: [0=待支付, 1=已支付]")
    private Integer payStatus;

    @Schema(description="支付状态: [0=待支付, 1=已支付]")
    private String payWay;

    @Schema(description="支付时间")
    private String payTime;

    @Schema(description="订单ID")
    private Integer orderId;

    @Schema(description="订单编号")
    private String orderSn;

    @Schema(description="订单金额")
    private BigDecimal orderAmount;

}
