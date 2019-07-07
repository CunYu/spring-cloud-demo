package pers.cunyu.eurekaribbonfeignhystrixconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.cunyu.eurekaribbonfeignhystrixconsumer.domain.CalculationResult;
import pers.cunyu.eurekaribbonfeignhystrixconsumer.hystrixfallbackfactory.EurekaProviderFeignClientHystrixFallbackFactory;

import java.math.BigDecimal;

@FeignClient(name = "eurekaProvider", fallbackFactory = EurekaProviderFeignClientHystrixFallbackFactory.class)
@RequestMapping("calculation")
public interface EurekaProviderFeignClient {

    @GetMapping("add")
    CalculationResult add(@RequestParam("paramOne") BigDecimal paramOne, @RequestParam("paramTwo") BigDecimal paramTwo);
}