package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/6 10:32
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;
    /**
     * 保存
     *
     * @param payment
     * @return
     */
    @Override
    public Integer savePayment(Payment payment) {
        return paymentDao.savePayment(payment);
    }

    /**
     * 按照id查询
     *
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
