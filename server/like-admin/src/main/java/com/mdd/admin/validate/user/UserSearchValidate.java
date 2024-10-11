package com.mdd.admin.validate.user;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "用户搜索参数")
public class UserSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="渠道")
    private Integer channel;

    @Schema(description="关键词")
    private String keyword;

    @Schema(description="开始时间")
    private String startTime;

    @Schema(description="结束时间")
    private String endTime;

}
