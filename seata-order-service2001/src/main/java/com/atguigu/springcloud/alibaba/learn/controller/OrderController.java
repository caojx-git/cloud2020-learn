package com.atguigu.springcloud.alibaba.learn.controller;

import com.atguigu.springcloud.alibaba.learn.domain.CommonResult;
import com.atguigu.springcloud.alibaba.learn.domain.Order;
import com.atguigu.springcloud.alibaba.learn.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单controller
 *
 * @author caojx created on 2022/5/19 11:41 AM
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 用户下单
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
