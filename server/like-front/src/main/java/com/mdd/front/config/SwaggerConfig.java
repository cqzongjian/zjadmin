package com.mdd.front.config;

import com.mdd.common.config.GlobalConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {

    @Value("${like.swagger.enabled}")
    private boolean enabled;

    @Value("${like.swagger.pathMapping}")
    private String pathMapping;

//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(apiInfo())
//                .enable(enabled)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.mdd.front"))
//                .build()
//                .pathMapping(pathMapping);
//    }

//    private ApiInfo apiInfo(){
//        String author = "FZR";
//        String url = "https://gitee.com/likeadmin/likeadmin_java";
//        String email = "tinyants@163.com";
//
//        return new ApiInfoBuilder()
//                .title("LikeAdmin【前台】接口文档")
//                .description("likeadmin是一套使用流行的技术栈的快速开发管理后台")
//                .version(GlobalConfig.version)
//                .contact(new Contact(author, url, email))
//                .build();
//    }

    /**
     * 添加摘要信息
     */
    @SuppressWarnings("static-access")
    public Info getApiInfo()
    {
        return new Info()
                // 设置标题
                .title("标题：若依管理系统_接口文档")
                // 描述
                .description("描述：用于管理集团旗下公司的人员信息,具体包括XXX,XXX模块...")
                // 作者信息
                .contact(new Contact().name("zongjian"))
                // 版本
                .version("版本号:" + GlobalConfig.version);
    }

}
