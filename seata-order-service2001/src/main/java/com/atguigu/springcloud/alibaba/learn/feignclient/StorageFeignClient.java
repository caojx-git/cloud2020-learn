package com.atguigu.springcloud.alibaba.learn.feignclient;

import com.atguigu.springcloud.alibaba.learn.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 库存FeignClient
 *
 * @author caojx created on 2022/5/19 11:28 AM
 */
@FeignClient(value = "seata-storage-service")
public interface StorageFeignClient {

    /**
     * 扣减库存
     *
     * @param productId 产品id
     * @param count     扣减数量
     * @return
     */
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
