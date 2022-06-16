package com.atguigu.springcloud.alibaba.learn.service.impl;

import com.atguigu.springcloud.alibaba.learn.mapper.AccountMapper;
import com.atguigu.springcloud.alibaba.learn.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 账户业务实现
 *
 * @author caojx created on 2022/5/19 11:28 AM
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("-->account-service 中扣减账户余额开始");

//        // 模拟默认超时异常，全局事务回滚，暂停几秒钟，openfeign 默认超时时间1s钟
//        try {
//            TimeUnit.SECONDS.sleep(20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        accountMapper.decrease(userId, money);
        log.info("-->account-service 中扣减账户余额结束");
    }
}
