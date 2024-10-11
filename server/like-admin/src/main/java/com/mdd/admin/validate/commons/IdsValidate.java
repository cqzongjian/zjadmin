package com.mdd.admin.validate.commons;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Schema(description = "IDS参数")
public class IdsValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "ids参数缺失")
    @Schema(description="ID数组", required = true)
    private List<Integer> ids;

}
