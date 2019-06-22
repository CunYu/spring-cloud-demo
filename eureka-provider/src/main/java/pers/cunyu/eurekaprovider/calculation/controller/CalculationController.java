package pers.cunyu.eurekaprovider.calculation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.cunyu.eurekaprovider.calculation.domain.CalculationResult;

import java.math.BigDecimal;

@RestController
@RequestMapping("calculation")
public class CalculationController {

    @GetMapping("add")
    public CalculationResult add(@RequestParam("paramOne") BigDecimal paramOne, @RequestParam("paramTwo") BigDecimal paramTwo) {

        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setParamOne(paramOne);
        calculationResult.setParamTwo(paramTwo);
        calculationResult.setResult(paramOne.add(paramTwo));
        return calculationResult;
    }
}
