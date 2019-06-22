package pers.cunyu.eurekaribbonconsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EurekaProviderRibbonConfig {

    @Bean
    public IRule eurekaProviderRibbonRule() {
        // 随机负载均衡规则
        return new RandomRule();
    }
}
