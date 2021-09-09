package com.geoxus.service.impl;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.geoxus.service.IDemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class DemoService implements IDemoService {
    @NacosValue(value = "${my-name:jackkkkkkkk}" , autoRefreshed = true)
    private String myName;

    @Override
    public String demoSayHello(String name) {
        return "Hi , ZK的注册中心! (●'◡'●)" + name;
    }

    @Override
    public String hello(String name) {
        return "我的hello方法 , ZK的注册中心！！！！！! (●'◡'●)" + name + " " + myName;
    }
}
