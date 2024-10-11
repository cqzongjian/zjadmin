package com.mdd.front.validate.article;

import com.mdd.common.validator.annotation.IDMust;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Schema(description = "文章收藏参数")
public class ArticleCollectValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "articleId参数缺失")
    @IDMust(message = "articleId参数必须大于0")
    @Schema(description="文章ID", required = true)
    private Integer articleId;

}
