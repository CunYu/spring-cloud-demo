package pers.cunyu.eurekaribbonconsumer.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "eurekaProvider", configuration = EurekaProviderRibbonConfig.class)
public class EurekaProviderRibbonClient {
}
