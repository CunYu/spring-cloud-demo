package pers.cunyu.eurekaribbonfeignconsumer.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculationResult {

    private BigDecimal paramOne;
    private BigDecimal paramTwo;
    private BigDecimal result;
}
