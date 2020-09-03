package com.tz.springcloud.service.impl;

import com.tz.springcloud.dao.PaymentDao;
import com.tz.springcloud.entities.Payment;
import com.tz.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService
{
    // JDK 的依赖注入
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
