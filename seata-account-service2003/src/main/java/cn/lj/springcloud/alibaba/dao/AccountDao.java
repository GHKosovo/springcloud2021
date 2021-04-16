package cn.lj.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author llj
 * @date 2021年04月16日 16:17
 */
@Mapper
public interface AccountDao {
    void decrease(@Param("userId")Long useId, @Param("money") BigDecimal money);

}
