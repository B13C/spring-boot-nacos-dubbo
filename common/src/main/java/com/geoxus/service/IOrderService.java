package com.geoxus.service;

import com.geoxus.dto.UserAddressResDto;
import com.geoxus.entities.UserAddress;

import java.util.List;

public interface IOrderService {
    /**
     * 初始化订单
     *
     * @param userId 用户ID
     * @return List
     */
    List<UserAddressResDto> initOrder(String userId);
}
