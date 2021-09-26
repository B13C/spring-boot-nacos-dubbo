package com.geoxus.controller;

import com.geoxus.dto.UserAddressResDto;
import com.geoxus.mapstruct.UserAddressMapStruct;
import com.geoxus.service.IDemoService;
import com.geoxus.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {
    @DubboReference
    private IDemoService demoService;

    @DubboReference
    private IUserService userService;

    @Resource
    private UserAddressMapStruct userAddressMapStruct;

    @GetMapping("say-hello")
    public String sayHello(String name) {
        return demoService.demoSayHello(name);
    }

    @GetMapping("user-list")
    public List<UserAddressResDto> getUserList() {
        return userService.getUserAddressList("1");
    }
}
