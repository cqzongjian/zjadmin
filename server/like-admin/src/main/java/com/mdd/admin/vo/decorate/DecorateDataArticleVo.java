package com.mdd.admin.vo.decorate;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "装修文章数据Vo")
public class DecorateDataArticleVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="id")
    private Integer id;

    @Schema(description="文章标题")
    private String title;

    @Schema(description="文章简介")
    private String intro;

    @Schema(description="文章描述")
    private String summary;

    @Schema(description="文章图片")
    private String image;

    @Schema(description="文章作者")
    private String author;

    @Schema(description="浏览数量")
    private Integer visit;

    @Schema(description="创建时间")
    private String createTime;

}
