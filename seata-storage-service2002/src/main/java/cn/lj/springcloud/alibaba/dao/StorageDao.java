package cn.lj.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author llj
 * @date 2021年04月16日 15:40
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId")Long productId, @Param("count")Integer count);
}
