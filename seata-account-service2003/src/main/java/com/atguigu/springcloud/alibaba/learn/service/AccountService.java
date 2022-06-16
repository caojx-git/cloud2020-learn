package com.atguigu.springcloud.alibaba.learn.service;

import java.math.BigDecimal;

/**
 * 账户业务接口
 *
 * @author caojx created on 2022/5/19 11:27 AM
 */
public interface AccountService {

    /**
     * 扣减余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    void decrease(Long userId, BigDecimal money);
}
