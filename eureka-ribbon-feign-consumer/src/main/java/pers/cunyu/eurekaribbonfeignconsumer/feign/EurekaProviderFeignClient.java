package pers.cunyu.eurekaribbonfeignconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.cunyu.eurekaribbonfeignconsumer.domain.CalculationResult;

import java.math.BigDecimal;

@FeignClient(name = "eurekaProvider")
@RequestMapping("calculation")
public interface EurekaProviderFeignClient {

    @GetMapping("add")
    CalculationResult add(@RequestParam("paramOne") BigDecimal paramOne, @RequestParam("paramTwo") BigDecimal paramTwo);
}