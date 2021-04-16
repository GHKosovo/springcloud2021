package cn.lj.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author llj
 * @date 2021年04月16日 14:08
 */
@Configuration
@MapperScan("cn.lj.springcloud.alibaba.dao")
public class MybatisConfig {
}
