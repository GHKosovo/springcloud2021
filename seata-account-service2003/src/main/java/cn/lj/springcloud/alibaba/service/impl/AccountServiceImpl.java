package cn.lj.springcloud.alibaba.service.impl;

import cn.lj.springcloud.alibaba.dao.AccountDao;
import cn.lj.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author llj
 * @date 2021年04月16日 16:20
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("-----account-service中扣减账户余额开始");
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        accountDao.decrease(userId, money);
        log.info("-----account-service中扣减账户余额结束");
    }
}
