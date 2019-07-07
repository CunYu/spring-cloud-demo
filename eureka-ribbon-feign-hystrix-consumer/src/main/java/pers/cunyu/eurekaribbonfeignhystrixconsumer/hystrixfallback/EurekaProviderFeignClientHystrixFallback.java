package pers.cunyu.eurekaribbonfeignhystrixconsumer.hystrixfallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.cunyu.eurekaribbonfeignhystrixconsumer.domain.CalculationResult;
import pers.cunyu.eurekaribbonfeignhystrixconsumer.feign.EurekaProviderFeignClient;

import java.math.BigDecimal;

@Component
//为了解决相同路径Spring初始化报错
@RequestMapping("calculationNeverAccess")
public class EurekaProviderFeignClientHystrixFallback implements EurekaProviderFeignClient {

    @Override
    public CalculationResult add(@RequestParam("paramOne") BigDecimal paramOne, @RequestParam("paramTwo") BigDecimal paramTwo) {

        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setParamOne(paramOne);
        calculationResult.setParamTwo(paramTwo);
        return calculationResult;
    }
}
