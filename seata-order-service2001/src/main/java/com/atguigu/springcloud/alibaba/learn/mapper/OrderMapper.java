package com.atguigu.springcloud.alibaba.learn.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.atguigu.springcloud.alibaba.learn.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * 订单Mapper
 *
 * @author caojx
 * @date 2022-05-19 09:43
 */
@Mapper
public interface OrderMapper {

    /**
     * 1.新建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态，从0->1
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
