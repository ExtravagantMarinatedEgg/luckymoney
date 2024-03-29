package com.imooc.luckymoney.controller;

import com.imooc.luckymoney.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("hello")
    public String say() {
        return "hello"+limitConfig.getDescription();
    }

}
