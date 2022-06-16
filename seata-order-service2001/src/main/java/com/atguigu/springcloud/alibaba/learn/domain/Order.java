package com.atguigu.springcloud.alibaba.learn.domain;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * 订单
 *
 * @author caojx
 * @date 2022-05-19 09:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 订单状态:0:创建中;1:已完结
     */
    private Integer status;
}
