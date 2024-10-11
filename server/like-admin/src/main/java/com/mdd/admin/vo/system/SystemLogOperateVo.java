package com.mdd.admin.vo.system;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "操作日志Vo")
public class SystemLogOperateVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="主键")
    private Integer id;

    @Schema(description="用户账号")
    private String username;

    @Schema(description="用户昵称")
    private String nickname;

    @Schema(description="请求类型: GET/POST/PUT")
    private String type;

    @Schema(description="操作标题")
    private String title;

    @Schema(description="请求方式")
    private String method;

    @Schema(description="请求IP")
    private String ip;

    @Schema(description="请求地址")
    private String url;

    @Schema(description="请求参数")
    private String args;

    @Schema(description="错误信息")
    private String error;

    @Schema(description="执行状态: [1=成功, 2=失败]")
    private Integer status;

    @Schema(description="执行耗时")
    private String taskTime;

    @Schema(description="开始时间")
    private String startTime;

    @Schema(description="结束时间")
    private String endTime;

    @Schema(description="创建时间")
    private String createTime;

}
