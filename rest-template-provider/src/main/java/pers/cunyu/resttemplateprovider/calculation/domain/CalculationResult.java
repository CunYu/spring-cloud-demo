package pers.cunyu.resttemplateprovider.calculation.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculationResult {

    private BigDecimal paramOne;
    private BigDecimal paramTwo;
    private BigDecimal result;
}
