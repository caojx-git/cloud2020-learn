package com.atguigu.springcloud.alibaba.learn.service;

import com.atguigu.springcloud.alibaba.learn.domain.Order;

/**
 * 订单业务接口
 *
 * @author caojx created on 2022/5/19 11:27 AM
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
