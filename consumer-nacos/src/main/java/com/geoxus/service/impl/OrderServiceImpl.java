package com.geoxus.service.impl;

import com.geoxus.dto.UserAddressResDto;
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
    public List<UserAddressResDto> initOrder(String userId) {
        System.out.println("用户ID为 : " + userId);
        List<UserAddressResDto> addressList = userService.getUserAddressList(userId);
        for (UserAddressResDto userAddress : addressList) {
            System.out.println(userAddress.getUserAddress01());
        }
        return addressList;
    }
}
