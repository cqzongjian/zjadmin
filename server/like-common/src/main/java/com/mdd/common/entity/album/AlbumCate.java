package com.mdd.common.entity.album;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "相册分类实体")
public class AlbumCate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="主键ID")
    private Integer id;

    @Schema(description="父级ID")
    private Integer pid;

    @Schema(description="分类类型: [10=图片,20=视频]")
    private Integer type;

    @Schema(description="分类名称")
    private String name;

    @Schema(description="是否删除: [0=否,1=是]")
    private Integer isDelete;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
