package com.mdd.front.validate;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Schema(description = "新用户更新信息参数")
public class RechargeValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "orderAmount参数缺失")
    private BigDecimal orderAmount;

}
