package com.atguigu.springcloud.alibaba.learn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 库存 Mapper
 *
 * @author caojx
 * @date 2022-05-19 09:43
 */
@Mapper
public interface StorageMapper {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
