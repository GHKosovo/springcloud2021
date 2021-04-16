package cn.lj.springcloud.alibaba.service.impl;

import cn.lj.springcloud.alibaba.dao.OrderDao;
import cn.lj.springcloud.alibaba.domain.Order;
import cn.lj.springcloud.alibaba.service.AccountService;
import cn.lj.springcloud.alibaba.service.OrderService;
import cn.lj.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author llj
 * @date 2021年04月16日 13:48
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /*
    * 创建订单->调用库存服务扣减库存-》调用账户服务扣减账户余额-》修改订单状态
    * 简单说：
    * 下订单-》减库存-》减余额-》改状态
    * */
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {

        log.info("-------开始创建订单");
        orderDao.create(order);
        log.info("----订单微服务开始调用库存，扣减count");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----订单微服务开始调用库存，扣减end");

        log.info("----订单微服务开始调用账户，扣减money");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("----订单微服务开始调用账户，扣减end");

        //修改订单状态，从零到一，1代表已经完成
        log.info("----修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("----修改订单状态结束");

        log.info("----下订单结束");

    }
}
