package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

import static com.atguigu.springcloud.constant.Constants.DOMAIN;
import static com.atguigu.springcloud.constant.Constants.PAYMENT_PORT;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/6 16:45
 */
@RestController
@RequestMapping("consumer")
public class OrderController {

    @Resource
    RestTemplate restTemplate;

    @PostMapping("payment/save")
    public CommonResult<Payment> save(Payment payment) {
//        restTemplate.postForEntity();
//        restTemplate.postForLocation();
        CommonResult<Payment> commonResult = restTemplate.postForObject(
                "http://" + DOMAIN + PAYMENT_PORT + "/payment/save"
                , payment
                , CommonResult.class);
        return commonResult;
    }

    @GetMapping("payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://" + DOMAIN +":"+ PAYMENT_PORT + "/payment/" + id, CommonResult.class);

    }
}
