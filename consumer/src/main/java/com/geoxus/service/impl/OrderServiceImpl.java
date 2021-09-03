package com.geoxus.service.impl;

import com.geoxus.entities.UserAddress;
import com.geoxus.service.IOrderService;
import com.geoxus.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.List;

@DubboService
@Component
public class OrderServiceImpl implements IOrderService {
    @DubboReference
    private IUserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID为 : " + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
