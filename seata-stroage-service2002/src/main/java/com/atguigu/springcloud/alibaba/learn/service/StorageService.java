package com.atguigu.springcloud.alibaba.learn.service;

/**
 * 库存业务接口
 *
 * @author caojx created on 2022/5/19 11:27 AM
 */
public interface StorageService {

    /**
     * 扣减库存
     *
     * @param productId 产品id
     * @param count     产品数量
     */
    void decrease(Long productId, Integer count);
}
