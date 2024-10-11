package com.mdd.admin.vo.article;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "文章列表Vo")
public class ArticleListedVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="分类")
    private String category;

    @Schema(description="标题")
    private String title;

    @Schema(description="图片")
    private String image;

    @Schema(description="作者")
    private String author;

    @Schema(description="访问")
    private Integer visit;

    @Schema(description="排序")
    private Integer sort;

    @Schema(description="是否显示")
    private Integer isShow;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

}
