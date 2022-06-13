package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 订单消费者微服务主启动
 *
 * @author caojx created on 2022/6/9 6:14 PM
 */
@EnableEurekaClient
@SpringBootApplication
// 在启动该微服务的时候就能去加载我们的自定义 Ribbon 配置类，从而使配置生效，形如：
// 对于访问：CLOUD-PAYMENT-SERVICE服务，使用自定义负载规则
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
