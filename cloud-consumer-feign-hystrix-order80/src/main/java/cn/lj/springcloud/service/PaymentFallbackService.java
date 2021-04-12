package cn.lj.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author rockie
 * @createTime 2021-04-07 23:13
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String PaymentInfo_OK(Integer id) {
        return "---------PaymentFallbackService fallback --PaymentInfo_OK-- ,/(ㄒoㄒ)/~~";
    }

    @Override
    public String PaymentInfo_TimeOut(Integer id) {
        return "---------PaymentFallbackService fallback --PaymentInfo_TimeOut-- ,/(ㄒoㄒ)/~~";
    }
}
