package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author caojx created on 2022/6/12 11:20 AM
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用consul或者zookeeper作注册中心时注册服务
public class PaymentZKMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZKMain8004.class, args);
    }
}
