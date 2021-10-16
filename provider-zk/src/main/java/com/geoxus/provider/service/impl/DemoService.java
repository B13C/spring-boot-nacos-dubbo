package com.geoxus.provider.service.impl;

import com.alibaba.nacos.api.config.annotation.NacosValue;
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

    @Override
    public String hello(String name) {
        return "我的hello方法 , ZK的注册中心！！！！！! (●'◡'●)" + name + " ";
    }

    @Override
    public String sayHello(String name) {
        return "Hi , ZK的注册中心! (●'◡'●)" + name;
    }
}
