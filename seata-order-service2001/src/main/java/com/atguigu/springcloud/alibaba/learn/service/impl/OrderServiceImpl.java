package com.atguigu.springcloud.alibaba.learn.service.impl;

import com.atguigu.springcloud.alibaba.learn.domain.Order;
import com.atguigu.springcloud.alibaba.learn.mapper.OrderMapper;
import com.atguigu.springcloud.alibaba.learn.feignclient.AccountFeignClient;
import com.atguigu.springcloud.alibaba.learn.service.OrderService;
import com.atguigu.springcloud.alibaba.learn.feignclient.StorageFeignClient;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 订单业务实现
 *
 * @author caojx created on 2022/5/19 11:28 AM
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private StorageFeignClient storageService;
    @Resource
    private AccountFeignClient accountFeignClient;

    /**
     * 创建订单->调用库存服务加减库存>调用账户服务扣减账户余额>修改订单状态
     * 简单说：
     * 下定单->减库存>减余额->改状态
     *
     * @param order
     */

    // 添加全局事务注解，name 随便叫，保证唯一性即可
    @GlobalTransactional(name = "create-order", rollbackFor = Exception.class)
    @Override
    public void create(Order order) {
        // 1.新建订单
        log.info("--->开始新建订单");
        orderMapper.create(order);

        // 2.扣减库存
        log.info("--->订单微服务开始调用库存，扣减库存");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("--->订单微服务开始调用库存，扣减库存end");

        // 3.扣减Money
        log.info("--->订单微服务开始调用账户，扣减Money");
        accountFeignClient.decrease(order.getUserId(), order.getMoney());
        log.info("--->订单微服务开始调用账户，扣减Money end");

        // 4.  修改订单状态，从0到1，1代表已经完成
        log.info("--->修改订单状态开始");
        orderMapper.update(order.getUserId(), 0);
        log.info("--->修改订单状态结束");

        log.info("--->下订单结束了，o(n_n)o哈哈~");
    }
}
