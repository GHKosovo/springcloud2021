package cn.lj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author rockie
 * @createTime 2021-04-13 22:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProviderMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderMain9001.class, args);
    }
}
