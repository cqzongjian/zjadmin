package com.mdd.admin.validate.album;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "附件搜索参数")
public class AlbumSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="分类ID")
    private Integer cid;

    @Schema(description="类型")
    private Integer type;

    @Schema(description="关键词")
    private String keyword;

}
