package com.geoxus.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserAddressResDto implements Serializable {
    private int id;
    private String userAddress01; //用户地址
    private String userId; //用户id
    private String consignee; //收货人
    private String phoneNum; //电话号码
    private String isDefault; //是否为默认地址    Y-是     N-否
}
