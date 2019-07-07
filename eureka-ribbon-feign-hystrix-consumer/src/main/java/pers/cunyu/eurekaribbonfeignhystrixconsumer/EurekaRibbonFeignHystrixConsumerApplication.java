package pers.cunyu.eurekaribbonfeignhystrixconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class EurekaRibbonFeignHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonFeignHystrixConsumerApplication.class, args);
    }
}
