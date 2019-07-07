package pers.cunyu.eurekaribbonconsumer.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pers.cunyu.eurekaribbonconsumer.domain.CalculationResult;

import java.math.BigDecimal;

@RestController
@RequestMapping("display")
public class DisplayController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("result")
    public String result(@RequestParam("paramOne") BigDecimal paramOne, @RequestParam("paramTwo") BigDecimal paramTwo) {

        CalculationResult calculationResult = restTemplate.getForObject("http://eurekaProvider/calculation/add?paramOne=" + paramOne + "&paramTwo=" + paramTwo, CalculationResult.class);
        return calculationResult.getParamOne() + " + " + calculationResult.getParamTwo() + " = " + calculationResult.getResult();
    }

    @GetMapping("choose")
    public String choose() {

        ServiceInstance serviceInstance = loadBalancerClient.choose("eurekaProvider");
        return serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }
}
