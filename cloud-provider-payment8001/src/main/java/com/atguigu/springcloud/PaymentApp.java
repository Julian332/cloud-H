package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/5 15:09
 */
@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao")
public class PaymentApp {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp.class, args);
    }
}
