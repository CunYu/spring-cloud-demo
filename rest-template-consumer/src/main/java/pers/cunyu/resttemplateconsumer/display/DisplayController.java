package pers.cunyu.resttemplateconsumer.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pers.cunyu.resttemplateconsumer.domain.CalculationResult;

import java.math.BigDecimal;

@RestController
@RequestMapping("display")
public class DisplayController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("result")
    public String result(@RequestParam("paramOne") BigDecimal paramOne, @RequestParam("paramTwo") BigDecimal paramTwo) {

        CalculationResult calculationResult = restTemplate.getForObject("http://localhost:8080/calculation/add?paramOne=" + paramOne + "&paramTwo=" + paramTwo, CalculationResult.class);
        return calculationResult.getParamOne() + " + " + calculationResult.getParamTwo() + " = " + calculationResult.getResult();
    }
}
