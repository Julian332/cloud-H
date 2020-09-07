package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Description: TODO
 * Project: cloud-H
 *
 * @author : Julian
 * @date :2020/9/6 08:04
 */
@Repository
public interface PaymentDao {
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
