package com.mdd.admin.validate.system;

import com.mdd.common.validator.annotation.IDMust;
import com.mdd.common.validator.annotation.IntegerContains;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "系统角色更新参数")
public class SystemRoleUpdateValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @IDMust(message = "id参数必传且需大于0")
    @Schema(description="id", required = true)
    private Integer id;

    @NotNull(message = "缺少参数name")
    @Length(min = 1, max = 30, message = "角色名称必须在1~30个字符内")
    @Schema(description="角色名称", required = true)
    private String name;

    @Length(max = 200, message = "备注信息不能超过200个字符")
    @Schema(description="备注", required = true)
    private String remark;

    @DecimalMin(value = "0", message = "排序号值不能少于0")
    @Schema(description="排序")
    private Integer sort = 0;

    @NotNull(message = "请选择状态")
    @IntegerContains(values = {0, 1})
    @Schema(description="是否禁用", required = true)
    private Integer isDisable;

    @Schema(description="菜单权限")
    private String menuIds = "";

}
