package com.mdd.admin.vo.finance;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Schema(description = "余额记录列表Vo")
public class FinanceWalletListVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="记录ID")
    private Integer id;

    @Schema(description="用户编号")
    private String userSn;

    @Schema(description="u屏幕估计头皮屑")
    private String avatar;

    @Schema(description="用户昵称")
    private String nickname;

    @Schema(description="变动金额")
    private BigDecimal changeAmount;

    @Schema(description="剩余金额")
    private BigDecimal leftAmount;

    @Schema(description="变动类型")
    private String changeType;

    @Schema(description="来源单号")
    private String sourceSn;

    @Schema(description="记录时间")
    private String createTime;

}
