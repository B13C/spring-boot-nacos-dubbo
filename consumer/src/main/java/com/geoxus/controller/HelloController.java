package com.geoxus.controller;

import com.geoxus.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private IOrderService orderService;

    @GetMapping("hello")
    public String hello(String userId) {
        System.out.println(orderService.initOrder(userId));
        return "Hello Controller";
    }
}
