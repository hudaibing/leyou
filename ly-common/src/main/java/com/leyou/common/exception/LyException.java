package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;

/**
 * @author bystander
 * @date 2018/9/15
 *
 * 自定义异常类
 */
public class LyException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public LyException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}
