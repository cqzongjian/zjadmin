package com.mdd.front.validate.users;

import com.mdd.common.validator.annotation.StringContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "新用户更新信息参数")
public class NewUserUpdateValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "昵称参数缺失")
    @Schema(description="昵称", required = true)
    private String nickname;

    @NotNull(message = "头像参数缺失")
    @Schema(description="头像", required = true)
    private String avatar;

}
