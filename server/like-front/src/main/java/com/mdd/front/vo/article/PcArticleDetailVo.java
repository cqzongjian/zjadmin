package com.mdd.front.vo.article;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "PC文章详情Vo")
public class PcArticleDetailVo implements Serializable {

    @Schema(description="文章ID")
    private Integer id;

    @Schema(description="分类ID")
    private Integer cid;

    @Schema(description="分类名称")
    private String category;

    @Schema(description="文章标题")
    private String title;

    @Schema(description="文章简介")
    private String intro;

    @Schema(description="文章描述")
    private String summary;

    @Schema(description="文章封面")
    private String image;

    @Schema(description="文章内容")
    private String content;

    @Schema(description="文章作者")
    private String author;

    @Schema(description="浏览数量")
    private Integer visit;

    @Schema(description="排序编号")
    private Integer sort;

    @Schema(description="是否收藏")
    private Integer isCollect;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

    @Schema(description="上一页")
    private Object prev;

    @Schema(description="下一页")
    private Object next;

    @Schema(description="最新推荐")
    private Object news;

}
