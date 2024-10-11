package com.mdd.admin.vo.finance;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Schema(description = "充值记录列表Vo")
public class FinanceRechargeListVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="ID")
    private Integer id;

    @Schema(description="用户昵称")
    private String nickname;

    @Schema(description="用户头像")
    private String avatar;

    @Schema(description="用户编号")
    private String userSn;

    @Schema(description="订单编号")
    private String orderSn;

    @Schema(description="支付方式: [2=微信支付, 3=支付宝支付]")
    private String payWay;

    @Schema(description="支付状态: [0=待支付, 1=已支付]")
    private Integer payStatus;

    @Schema(description="退款状态: [0=未退款 , 1=已退款]")
    private Integer refundStatus;

    @Schema(description="是否有退款: [0=否 , 1=是]")
    private Integer isRefund;

    @Schema(description="退款状态描述")
    private String refundStatusMsg;

    @Schema(description="支付金额")
    private BigDecimal orderAmount;

    @Schema(description="支付时间")
    private String payTime;

    @Schema(description="创建时间")
    private String createTime;

}
