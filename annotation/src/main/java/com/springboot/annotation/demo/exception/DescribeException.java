package com.springboot.annotation.demo.exception;

import com.springboot.annotation.demo.view.ExceptionEnum;

public class DescribeException extends RuntimeException{

    private Integer code;

    public DescribeException(Exception e) {
        super(e);
    }

    /**
     * 继承exception，加入错误状态值
     * @param exceptionEnum 异常枚举类
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义错误信息
     * @param message 返回信息
     * @param code 返回码
     */
    public DescribeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
