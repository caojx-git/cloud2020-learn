package com.atguigu.springcloud.alibaba.learn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 相关配置
 *
 * @author caojx created on 2022/5/19 11:43 AM
 */
@Configuration
@MapperScan({"caojx.learn.mapper"})
public class MyBatisConfig {
}
