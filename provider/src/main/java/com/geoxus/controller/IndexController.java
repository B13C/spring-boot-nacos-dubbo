package com.geoxus.controller;

import com.geoxus.config.TestConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {
    @Resource
    private TestConfig testConfig;

    @GetMapping("index")
    public String index() {
        return "Index 哈哈哈" + testConfig.getName();
    }
}
