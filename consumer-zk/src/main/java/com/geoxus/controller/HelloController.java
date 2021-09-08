package com.geoxus.controller;

import com.geoxus.service.IDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @DubboReference
    private IDemoService demoService;

    @GetMapping("say-hello")
    public String sayHello(String name) {
        return demoService.demoSayHello(name);
    }
}
