package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author caojx created on 2022/6/15 9:40 PM
 */
@Slf4j
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
//        // 暂停毫秒
//        try{
//            TimeUnit.MILLISECONDS.sleep(800);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
//        // 暂停几秒钟线程
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测试 RT");

        log.info("testD 测试 异常比例");
        int age = 10 / 0;

        return "------testD";
    }


    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常数 ");
        int age = 10 / 0;
        return "------testE 测试异常数 ";
    }


    /**
     * 处理热点key：
     * 超过指定的热点规则定义的qps 阀值，就调用我们指定以的：dealHandler_testHotKey 方法，返回自定义提示
     * sentinel系统默认的提示： Blocked by Sentinel (flow limiting)
     *
     * @SentinelResource  value指定热点key，blockHandler 指定限流处理兜底方法
     * @param p1
     * @param p2
     * @return
     */
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "dealHandler_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        int age = 10 /0;
        return "------testHotKey";
    }

    /**
     * 热点规则限流调用的方法
     *
     * @param exception
     * @see com.alibaba.csp.sentinel.slots.block.BlockException
     */
    public String dealHandler_testHotKey(String p1, String p2, BlockException exception) {
        return "-----dealHandler_testHotKey"; // sentinel系统默认的提示： Blocked by Sentinel (flow limiting)
    }
}
