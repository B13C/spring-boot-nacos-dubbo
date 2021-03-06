package com.geoxus.provider.service.impl;

import com.geoxus.dto.UserAddressResDto;
import com.geoxus.entities.UserAddress;
import com.geoxus.provider.mapstruct.UserAddressMapStruct;
import com.geoxus.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@DubboService
public class UserServiceImpl implements IUserService {
    @Resource
    private UserAddressMapStruct mapStruct;

    @Override
    public List<UserAddressResDto> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....new...");
        UserAddress address1 = new UserAddress(1, "四川省成都市武侯区", "1", "晨晨", "028-12345678", "Y");
        UserAddress address2 = new UserAddress(2, "四川省成都市锦江区", "1", "尘尘", "028-12345678", "N");
        UserAddress address3 = new UserAddress(3, "四川省成都市锦江区", "1", "尘尘", "028-12345678", "Y");
        UserAddress address4 = new UserAddress(4, "四川省成都市锦江区", "1", "尘尘", "028-12345678", "N");
        List<UserAddress> asList = Arrays.asList(address1, address2, address3, address4);
        List<UserAddressResDto> userAddressResDtos = mapStruct.entitiesToDto(asList);
        return userAddressResDtos;
    }
}
