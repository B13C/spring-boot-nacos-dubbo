package com.geoxus.service;

import com.geoxus.entities.UserAddress;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@DubboService
@Component
public class UserServiceImpl implements IUserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "四川省成都市武侯区A", "1", "晨晨", "028-12345678", "Y");
        UserAddress address2 = new UserAddress(2, "四川省成都市锦江区B", "1", "尘尘", "028-12345678", "N");
        UserAddress address3 = new UserAddress(3, "四川省成都市锦江区C", "1", "尘尘", "028-12345678", "Y");
        UserAddress address4 = new UserAddress(4, "四川省成都市锦江区D", "1", "尘尘", "028-12345678", "N");
        return Arrays.asList(address1, address2, address3, address4);
    }
}
