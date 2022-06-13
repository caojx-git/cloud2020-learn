package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entites.Payment;

/**
 * @author caojx created on 2022/6/4 8:58 PM
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
