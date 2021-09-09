package com.geoxus.framework.dto.protocol;

public interface GXBaseResProtocol {
    /**
     * @author britton
     * 对返回数据进行自定义处理
     */
    default <T> T processRetValue() {
        return null;
    }
}
