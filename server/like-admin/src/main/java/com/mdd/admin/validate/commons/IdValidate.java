package com.mdd.admin.validate.commons;

import com.mdd.common.validator.annotation.IDMust;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "ID参数")
public class IdValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @IDMust(message = "id参数必传且需大于0")
    @Schema(description="ID", required = true)
    private Integer id;

}
