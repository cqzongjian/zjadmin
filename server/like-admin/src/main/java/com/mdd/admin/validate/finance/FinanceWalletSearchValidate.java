package com.mdd.admin.validate.finance;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "余额记录搜索参数")
public class FinanceWalletSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="关键词")
    private String keyword;

    @Schema(description="类型")
    private Integer type;

    @Schema(description="创建时间")
    private Integer startTime;

    @Schema(description="结束时间")
    private Integer endTime;

}
