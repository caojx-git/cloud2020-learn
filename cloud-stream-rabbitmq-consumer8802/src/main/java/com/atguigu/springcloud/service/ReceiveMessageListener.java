package com.atguigu.springcloud.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * 接受消息
 *
 * @author caojx created on 2022/6/14 9:46 PM
 */
@Slf4j
@Component
@EnableBinding(Sink.class)  // 指信道channel和exchange绑定在一起，Sink消息的输入，可以理解为消息的消费者
public class ReceiveMessageListener {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT) // 这里表示监听sink的input，而input：我们在置文件中配置了绑定在一个指定Exchange上获取数据
    public void input(Message<String> message) {
        log.info("port:{} 接受：{}", serverPort, message.getPayload());
    }
}
