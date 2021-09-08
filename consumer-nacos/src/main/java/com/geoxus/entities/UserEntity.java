package com.geoxus.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@TableName("user")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class UserEntity {
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

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 更新时间
     */
    private Long updatedAt;

    private Long tenantId;
}
