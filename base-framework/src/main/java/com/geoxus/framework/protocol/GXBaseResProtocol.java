package com.geoxus.framework.protocol;

public interface GXBaseResProtocol {
    /**
     * @author britton
     * 对参数的补充修复
     */
    default <T> T processRetValue() {
        return null;
    }
}
