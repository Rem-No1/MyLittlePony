/**
 * Copyright 2015-现在 广州市网络科技有限公司
 */
package com.xq.tmall.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {

    WAIT(1, "待支付"), SUCCESS(2, "支付成功"), FAIL(3, "支付失败"), CLOSE(4, "关闭支付");

    private Integer code;

    private String desc;

}
