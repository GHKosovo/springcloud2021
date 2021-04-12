package cn.lj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author rockie
 * @createTime 2021-04-10 17:16
 */
@SpringBootApplication
@EnableEurekaClient
//@RefreshScope
public class ConfigClientMain3345 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3345.class, args);
    }
}
