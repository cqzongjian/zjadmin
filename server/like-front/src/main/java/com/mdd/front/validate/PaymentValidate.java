package com.mdd.front.validate;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Schema(description = "预支付订单参数")
public class PaymentValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "scene参数缺失")
    @Schema(description="支付场景: [recharge=充值,order=普通订单]")
    private String scene;

    @NotNull(message = "payWay参数缺失")
    @Schema(description="支付方式: [1=余额支付,2=微信支付,3=支付宝支付]")
    private Integer payWay;

    @NotNull(message = "orderId参数缺失")
    @Schema(description="订单ID")
    private Integer orderId;

    @Schema(description="重定向链接: H5端需要")
    private String redirectUrl;

    @Schema(title="用户ID", description = "该参数无需传递")
    private Integer userId;

    @Schema(title="订单类型", description = "该参数无需传递")
    private String attach;

    @Schema(title="订单编号", description = "该参数无需传递")
    private String outTradeNo;

    @Schema(title="订单金额", description = "该参数无需传递")
    private BigDecimal orderAmount;

    @Schema(title="用户描述", description = "该参数无需传递")
    private String description;

}
