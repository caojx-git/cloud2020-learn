package com.atguigu.springcloud.alibaba.learn.service.impl;

import com.atguigu.springcloud.alibaba.learn.mapper.StorageMapper;
import com.atguigu.springcloud.alibaba.learn.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 库存业务实现
 *
 * @author caojx created on 2022/5/19 11:28 AM
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("--->storage-service 中扣减库存开始");
        storageMapper.decrease(productId, count);
        log.info("--->storage-service 中扣减库存结束");
    }
}
