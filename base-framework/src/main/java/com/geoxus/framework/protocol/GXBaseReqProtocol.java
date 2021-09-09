package com.geoxus.framework.protocol;

public interface GXBaseReqProtocol {
    /**
     * @author britton
     * 对请求参数进行补充校验
     */
    default void verify() {
    }

    /**
     * @author britton
     * 对参数进行补充修复(自动填充一些信息)
     */
    default void repair() {
    }
}
