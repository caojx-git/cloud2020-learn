package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import org.springframework.stereotype.Component;

/**
 * @author caojx created on 2022/6/16 8:43 PM
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, " 服务降级返回 , 没有该流水信息 ", new Payment(id, "errorSerial......"));
    }
}
