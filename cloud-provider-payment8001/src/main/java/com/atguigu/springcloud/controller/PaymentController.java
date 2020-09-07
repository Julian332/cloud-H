package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/6 10:35
 */
@RestController
@RequestMapping("payment")
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping("save")
    public CommonResult<Integer> savePayment(Payment payment) {
        Integer data = paymentService.savePayment(payment);
        if (data > 0) {
            return new CommonResult<>(200, "插入成功", data);
        }
        return new CommonResult<>(500, "插入失败");
    }

    @GetMapping("{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable( "id")Long id) {
        try {
            Payment paymentById = paymentService.getPaymentById(id);
            if (paymentById == null) {
                return new CommonResult<>(400, "没有此订单");

            }
            return new CommonResult<>(200, "查询成功", paymentById);
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResult<>(500, "服务器内部错误");
        }
    }

}
