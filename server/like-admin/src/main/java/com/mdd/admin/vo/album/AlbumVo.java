package com.mdd.admin.vo.album;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "相册Vo")
public class AlbumVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="所属类目")
    private Integer cid;

    @Schema(description="文件名称")
    private String name;

    @Schema(description="相对路径")
    private String path;

    @Schema(description="文件路径")
    private String uri;

    @Schema(description="文件扩展")
    private String ext;

    @Schema(description="文件大小")
    private String size;

    @Schema(description="创建时间")
    private String createTime;

    @Schema(description="更新时间")
    private String updateTime;

}
