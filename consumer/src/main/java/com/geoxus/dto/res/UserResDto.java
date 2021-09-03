package com.geoxus.dto.res;

import lombok.Data;

@Data
public class UserResDto {
    /**
     * 用户名
     */
    private String username;

    /**
     * OpenID
     */
    private String openId;

    /**
     * 是否删除
     */
    private Long isDelete;
}
