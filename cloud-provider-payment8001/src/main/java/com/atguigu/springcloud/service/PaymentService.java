package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/6 10:31
 */
public interface PaymentService {
    /**
     * 保存
     * @param payment
     * @return
     */
    Integer savePayment(Payment payment);

    /**
     * 按照id查询
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
