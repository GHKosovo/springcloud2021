package cn.lj.springcloud.service;

import cn.lj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author rockie
 * @createTime 2021-03-31 21:13
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
