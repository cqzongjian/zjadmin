package com.mdd.common.entity.article;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "文章实体")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="分类")
    private Integer cid;

    @Schema(description="标题")
    private String title;

    @Schema(description="简介")
    private String intro;

    @Schema(description="摘要")
    private String summary;

    @Schema(description="封面")
    private String image;

    @Schema(description="内容")
    private String content;

    @Schema(description="作者")
    private String author;

    @Schema(description="浏览")
    private Integer visit;

    @Schema(description="排序")
    private Integer sort;

    @Schema(description="是否显示: [0=否, 1=是]")
    private Integer isShow;

    @Schema(description="是否删除: [0=否, 1=是]")
    private Integer isDelete;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
