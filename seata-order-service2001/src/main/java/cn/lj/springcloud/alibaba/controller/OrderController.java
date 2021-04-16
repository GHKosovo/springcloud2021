package cn.lj.springcloud.alibaba.controller;

import cn.lj.springcloud.alibaba.domain.CommonResult;
import cn.lj.springcloud.alibaba.domain.Order;
import cn.lj.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author llj
 * @date 2021年04月16日 14:05
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
