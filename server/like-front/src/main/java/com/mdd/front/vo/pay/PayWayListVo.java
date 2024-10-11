package com.mdd.front.vo.pay;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "支付方式列表Vo")
public class PayWayListVo implements Serializable {

    @Schema(description="订单金额")
    private BigDecimal orderAmount;

    @Schema(description="方式列表")
    private List<PayWayInfoVo> list;

}
