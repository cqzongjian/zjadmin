package com.mdd.admin.validate.article;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "文章搜索参数")
public class ArticleSearchValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="文章标题")
    private String title;

    @Schema(description="文章分类")
    private Integer cid;

    @Schema(description="是否显示")
    private Integer isShow;

    @Schema(description="开始时间")
    private String startTime;

    @Schema(description="结束时间")
    private String endTime;

}
