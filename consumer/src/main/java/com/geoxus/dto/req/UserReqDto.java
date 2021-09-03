package com.geoxus.dto.req;

import lombok.Data;

@Data
public class UserReqDto {
    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * OpenID
     */
    private String openId;

    /**
     * 是否删除
     */
    private Long isDelete;

    private Long tenantId;
}
