package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 统一处理PaymentHystrixService的降级
 * @author caojx created on 2022/6/13 6:33 PM
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----- PaymentFallbackService fall back-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----- PaymentFallbackService fall back-paymentInfo_TimeOut";
    }
}
