package pers.cunyu.eurekaribbonfeignhystrixconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EurekaRibbonFeignHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonFeignHystrixConsumerApplication.class, args);
    }
}
