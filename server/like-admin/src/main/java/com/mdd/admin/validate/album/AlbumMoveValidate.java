package com.mdd.admin.validate.album;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Schema(description = "附件移动参数")
public class AlbumMoveValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "ids参数缺失")
    @Schema(description="附件ID", required = true)
    private List<Integer> ids;

    @NotNull(message = "cid参数缺失")
    @Schema(description="类目ID", required = true)
    private Integer cid;

}
