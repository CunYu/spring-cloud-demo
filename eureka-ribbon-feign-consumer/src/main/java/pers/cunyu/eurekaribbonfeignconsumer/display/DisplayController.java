package pers.cunyu.eurekaribbonfeignconsumer.display;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.cunyu.eurekaribbonfeignconsumer.domain.CalculationResult;
import pers.cunyu.eurekaribbonfeignconsumer.feign.EurekaProviderFeignClient;

import java.math.BigDecimal;

@Slf4j
@RestController
@RequestMapping("display")
public class DisplayController {

    @Autowired
    private EurekaProviderFeignClient eurekaProviderFeignClient;

    @GetMapping("result")
    public String result(@RequestParam("paramOne") BigDecimal paramOne, @RequestParam("paramTwo") BigDecimal paramTwo) {

        CalculationResult calculationResult = eurekaProviderFeignClient.add(paramOne, paramTwo);
        return calculationResult.getParamOne() + " + " + calculationResult.getParamTwo() + " = " + calculationResult.getResult();
    }
}
