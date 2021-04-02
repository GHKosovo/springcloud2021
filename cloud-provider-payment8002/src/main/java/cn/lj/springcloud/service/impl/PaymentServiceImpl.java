package cn.lj.springcloud.service.impl;

import cn.lj.springcloud.dao.PaymentDao;
import cn.lj.springcloud.entities.Payment;
import cn.lj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author rockie
 * @createTime 2021-03-31 21:14
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
