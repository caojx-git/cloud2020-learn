package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 负载均衡接口
 *
 * @author caojx created on 2022/6/12 9:39 PM
 */
public interface LoadBalancer {

    /**
     * 从服务实例列表中获取一个实例
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
