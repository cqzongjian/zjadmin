package com.mdd.common.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "系统操作日志实体")
public class SystemLogOperate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="id", type= IdType.AUTO)
    @Schema(description="ID")
    private Integer id;

    @Schema(description="操作人ID")
    private Integer adminId;

    @Schema(description="请求类型: GET/POST/PUT")
    private String type;

    @Schema(description="操作标题")
    private String title;

    @Schema(description="请求方法")
    private String method;

    @Schema(description="请求IP")
    private String ip;

    @Schema(description="请求接口")
    private String url;

    @Schema(description="请求参数")
    private String args;

    @Schema(description="错误信息")
    private String error;

    @Schema(description="执行状态: [1=成功, 2=失败]")
    private Integer status;

    @Schema(description="开始时间")
    private Long startTime;

    @Schema(description="结束时间")
    private Long endTime;

    @Schema(description="执行耗时")
    private Long taskTime;

    @Schema(description="创建时间")
    private Long createTime;

}
