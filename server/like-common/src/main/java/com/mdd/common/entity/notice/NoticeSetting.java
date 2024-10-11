package com.mdd.common.entity.notice;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "通知设置实体")
public class NoticeSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="场景编号")
    private Integer scene;

    @Schema(description="场景名称")
    private String name;

    @Schema(description="场景描述")
    private String remarks;

    @Schema(description="接收人员: [1=用户, 2=平台]")
    private Integer recipient;

    @Schema(description="通知类型: [1=业务, 2=验证码]")
    private Integer type;

    @Schema(description="系统的通知设置")
    private String systemNotice;

    @Schema(description="短信的通知设置")
    private String smsNotice;

    @Schema(description="公众号通知设置")
    private String oaNotice;

    @Schema(description="小程序通知设置")
    private String mnpNotice;

    @Schema(description="是否删除: [0=否, 1=是]")
    private Integer isDelete;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
