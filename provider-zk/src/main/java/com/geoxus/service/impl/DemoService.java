package com.geoxus.service.impl;

import com.geoxus.service.IDemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class DemoService implements IDemoService {
    @Override
    public String demoSayHello(String name) {
        return "Hi , ZK的注册中心! (●'◡'●)" + name;
    }
}
