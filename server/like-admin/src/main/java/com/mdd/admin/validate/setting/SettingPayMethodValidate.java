package com.mdd.admin.validate.setting;

import com.mdd.admin.vo.setting.SettingPaymentMethodVo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "支付方式设置参数")
public class SettingPayMethodValidate {

    List<List<SettingPaymentMethodVo>> data;

}
