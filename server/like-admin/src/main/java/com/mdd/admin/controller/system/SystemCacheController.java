package com.mdd.admin.controller.system;


import com.mdd.admin.aop.Log;
import com.mdd.admin.service.ISystemCacheService;
import com.mdd.common.core.AjaxResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/system/cache")
@Tag(name = "系统缓存管理")
public class SystemCacheController {

    @Resource
    ISystemCacheService iSystemCacheService;

    @Log(title = "清除系统缓存")
    @PostMapping("/clear")
    @Operation(summary="清除系统缓存")
    public AjaxResult<Object> clear() {
        iSystemCacheService.clear();
        return AjaxResult.success();
    }


}
