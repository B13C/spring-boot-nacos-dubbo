package com.geoxus.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.geoxus.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private IOrderService orderService;

    @NacosValue(value = "${my-name:123}", autoRefreshed = true)
    private String name;

    @GetMapping("hello")
    public String hello(String userId) {
        System.out.println(orderService.initOrder(userId));
        return "Hello Controller";
    }

    @GetMapping("index")
    public String index() {
        return "Hello Controller , " + name;
    }
}
