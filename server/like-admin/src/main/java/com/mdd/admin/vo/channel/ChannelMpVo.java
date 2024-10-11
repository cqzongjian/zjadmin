package com.mdd.admin.vo.channel;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "小程序渠道Vo")
public class ChannelMpVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="小程序名称")
    private String name;
    @Schema(description="原始ID")
    private String primaryId;
    @Schema(description="appId")
    private String appId;
    @Schema(description="appSecret")
    private String appSecret;
    @Schema(description="二维码")
    private String qrCode;

    @Schema(description="request合法域名")
    private String requestDomain;
    @Schema(description="socket合法域名")
    private String socketDomain;
    @Schema(description="uploadFile合法域名")
    private String uploadFileDomain;
    @Schema(description="downloadFile合法域名")
    private String downloadFileDomain;
    @Schema(description="udp合法域名")
    private String udpDomain;
    @Schema(description="tcp合法域名")
    private String tcpDomain;
    @Schema(description="业务域名")
    private String businessDomain;

}
