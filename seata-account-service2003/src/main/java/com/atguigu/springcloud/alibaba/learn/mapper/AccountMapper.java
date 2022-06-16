package com.atguigu.springcloud.alibaba.learn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * 账户Mapper
 *
 * @author caojx
 * @date 2022-05-19 09:43
 */
@Mapper
public interface AccountMapper {

    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
