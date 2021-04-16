package cn.lj.springcloud.alibaba.dao;

import cn.lj.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author llj
 * @date 2021年04月16日 13:39
 */
@Mapper
public interface OrderDao {
    //1.新建订单
    void create(Order order);

    //2.修改订单状态
    void update(@Param("userId")Long userId,@Param("status")Integer status);

    //
}
