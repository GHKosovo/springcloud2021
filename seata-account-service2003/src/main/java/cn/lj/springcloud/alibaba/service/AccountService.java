package cn.lj.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @author llj
 * @date 2021年04月16日 16:19
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
