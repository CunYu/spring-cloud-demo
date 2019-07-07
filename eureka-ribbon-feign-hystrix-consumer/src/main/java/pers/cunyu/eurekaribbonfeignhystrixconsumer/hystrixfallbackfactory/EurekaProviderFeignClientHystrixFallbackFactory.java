package pers.cunyu.eurekaribbonfeignhystrixconsumer.hystrixfallbackfactory;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pers.cunyu.eurekaribbonfeignhystrixconsumer.domain.CalculationResult;
import pers.cunyu.eurekaribbonfeignhystrixconsumer.feign.EurekaProviderFeignClient;

import java.math.BigDecimal;

@Slf4j
@Component
public class EurekaProviderFeignClientHystrixFallbackFactory implements FallbackFactory<EurekaProviderFeignClient> {

    @Override
    public EurekaProviderFeignClient create(Throwable cause) {

        return new EurekaProviderFeignClient() {

            @Override
            public CalculationResult add(BigDecimal paramOne, BigDecimal paramTwo) {
                log.error("回退原因：", cause);
                CalculationResult calculationResult = new CalculationResult();
                calculationResult.setParamOne(paramOne);
                calculationResult.setParamTwo(paramTwo);
                return calculationResult;
            }
        };
    }
}
