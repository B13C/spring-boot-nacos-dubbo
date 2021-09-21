package com.geoxus.service;

import com.geoxus.dto.UserAddressResDto;
import com.geoxus.entities.UserAddress;

import java.util.List;

public interface IUserService {
    /**
     * 获取用户地址列表信息
     *
     * @param userId 用户ID
     * @return List
     */
    List<UserAddressResDto> getUserAddressList(String userId);
}