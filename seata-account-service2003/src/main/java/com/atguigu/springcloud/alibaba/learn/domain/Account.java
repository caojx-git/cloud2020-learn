package com.atguigu.springcloud.alibaba.learn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 账户
 *
 * @author caojx
 * @date 2022-05-19 09:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private Integer total;

    /**
     * 已用额度
     */
    private Integer used;

    /**
     * 剩余可用额度
     */
    private Integer residue;
}
