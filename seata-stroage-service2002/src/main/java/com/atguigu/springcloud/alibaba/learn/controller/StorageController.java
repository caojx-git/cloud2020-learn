package com.atguigu.springcloud.alibaba.learn.controller;

import com.atguigu.springcloud.alibaba.learn.domain.CommonResult;
import com.atguigu.springcloud.alibaba.learn.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 库存 controller
 *
 * @author caojx created on 2022/5/19 11:41 AM
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存成功
     *
     * @param productId 产品id
     * @param count     扣减数量
     * @return
     */
    @PostMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功");
    }
}
