package com.mdd.front.vo.article;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "文章收藏Vo")
public class ArticleCollectVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="收藏主键")
    private Integer id;

    @Schema(description="文章ID")
    private Integer articleId;

    @Schema(description="文章标题")
    private String title;

    @Schema(description="文章封面")
    private String image;

    @Schema(description="文章简介")
    private String intro;

    @Schema(description="浏览数量")
    private Integer visit;

    @Schema(description="创建时间")
    private String createTime;

}
