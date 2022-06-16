package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entites.CommonResult;

/**
 * 创建CustomerBlockHandler类用于自定义限流处理逻辑
 *
 * @author caojx created on 2022/6/16 6:16 PM
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "按客戶自定义,global handlerException ---1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020, "按客戶自定义,global handlerException ---2");
    }
}
