package cn.lj.springcloud;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author rockie
 * @createTime 2021-04-10 23:41
 */
@SpringBootApplication
@EnableEurekaClient

public class ConfigClientMain3346 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3346.class, args);
    }
}
