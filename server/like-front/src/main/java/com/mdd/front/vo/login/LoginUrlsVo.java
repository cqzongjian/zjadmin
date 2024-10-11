package com.mdd.front.vo.login;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "跳转链接Vo")
public class LoginUrlsVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description="http链接")
    private String url;

}
