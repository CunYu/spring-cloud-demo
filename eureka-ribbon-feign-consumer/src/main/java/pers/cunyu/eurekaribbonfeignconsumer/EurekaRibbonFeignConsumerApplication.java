package pers.cunyu.eurekaribbonfeignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EurekaRibbonFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonFeignConsumerApplication.class, args);
    }
}
