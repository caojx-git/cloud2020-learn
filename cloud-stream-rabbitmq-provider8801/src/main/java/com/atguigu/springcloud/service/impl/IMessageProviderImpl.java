package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 发送消息接口实现类
 *
 * 定义消息的推送管道 将Channel和Exchanges绑定在一起
 *
 * @author caojx created on 2022/6/14 9:38 PM
 */
@Slf4j
@EnableBinding(Source.class) // 指信道channel和exchange绑定在一起，source消息的输出，可以理解为消息的生产者
public class IMessageProviderImpl implements IMessageProvider {
    /**
     * 消息发送管道/信道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build()); // 构建一个消息并发送

        log.info("*****serial: " + serial);
        return serial;
    }
}
