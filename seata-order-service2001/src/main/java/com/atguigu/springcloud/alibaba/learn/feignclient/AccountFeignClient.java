package com.atguigu.springcloud.alibaba.learn.feignclient;

import com.atguigu.springcloud.alibaba.learn.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * 账户 FeignClient
 *
 * @author caojx created on 2022/5/19 11:28 AM
 */
@FeignClient(value = "seata-account-service")
public interface AccountFeignClient {

    /**
     * 扣减余额
     *
     * @param userId 用户id
     * @param money  金额
     * @return
     */
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
