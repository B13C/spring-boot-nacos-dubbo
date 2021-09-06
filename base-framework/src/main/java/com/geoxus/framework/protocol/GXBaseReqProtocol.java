package com.geoxus.framework.protocol;

public interface GXBaseReqProtocol {
    /**
     * @author britton
     * 对请求参数的补充校验
     */
    default void verify() {
    }

    /**
     * @author britton
     * 对参数的补充修复
     */
    default void repair() {
    }
}
