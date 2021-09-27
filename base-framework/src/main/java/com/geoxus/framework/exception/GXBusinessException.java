package com.geoxus.framework.exception;

import cn.hutool.core.lang.Dict;
import cn.hutool.http.HttpStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GXBusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final String msg;

    private final int code;

    private final Dict data;

    public GXBusinessException(String msg, int code, Dict data, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public GXBusinessException(String msg, int code, Dict data) {
        this(msg, code, data, null);
    }

    public GXBusinessException(String msg, int code, Throwable e) {
        this(msg, code, Dict.create(), e);
    }

    public GXBusinessException(String msg, int code) {
        this(msg, code, Dict.create());
    }

    public GXBusinessException(String msg) {
        this(msg, HttpStatus.HTTP_INTERNAL_ERROR);
    }

    public GXBusinessException(String msg, Throwable e) {
        this(msg, HttpStatus.HTTP_INTERNAL_ERROR, e);
    }
}