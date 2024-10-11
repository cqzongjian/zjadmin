package com.mdd.common.entity.notice;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "通知记录实体")
public class NoticeRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="主键")
    private Integer id;

    @Schema(description="场景")
    private Integer scene;

    @Schema(description="用户")
    private Integer userId;

    @Schema(description="账号")
    private String account;

    @Schema(description="编码")
    private String title;

    @Schema(description="编码")
    private String code;

    @Schema(description="内容")
    private String content;

    @Schema(description="错误")
    private String error;

    @Schema(description="发送类型: [1=系统, 2=短信, 3=公众号, 4=小程序]")
    private Integer sender;

    @Schema(description="接收对象: [1=用户, 2=平台]")
    private Integer receiver;

    @Schema(description="通知状态: [0=等待, 1=成功, 2=失败]")
    private Integer status;

    @Schema(description="已读状态: [0=未读, 1=已读]")
    private Integer isRead;

    @Schema(description="是验证码: [0=否的, 1=是的]")
    private Integer isCaptcha;

    @Schema(description="是否删除: [0=否,1=是]")
    private Integer isDelete;

    @Schema(description="失效时间")
    private Long expireTime;

    @Schema(description="创建时间")
    private Long createTime;

    @Schema(description="更新时间")
    private Long updateTime;

    @Schema(description="删除时间")
    private Long deleteTime;

}
