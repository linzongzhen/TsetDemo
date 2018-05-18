package com.springboot.annotation.demo.view;

public enum ExceptionEnum {
    UNKNOW_ERROR(1000,"未知错误"),
    EXCEPTION(1001,"EXCEPTION"),
    NULL_POINTER(1002,"空指针异常"),
    CLASS_NOT_FOUND(1003,"指定的类不存在"),
    NUMBER_FORMAT(1004,"字符串转换为数字异常"),
    INDEX_OUT_OF_BOUNDS(1005,"数组下标越界异常"),
    ILLEGAL_ARGUMENT(1006,"方法的参数错误"),
    ILLEGAL_ACCESS(1007,"没有访问权限"),
    ARITHMETIC(1008,"数学运算异常"),
    CLASS_CAST(1009,"数据类型转换异常"),
    FILE_NOT_FOUND(1010,"文件未找到异常"),
    ILLEGAL_FILE_TYPE(1011,"文件非法类型 "),
    NO_SUCH_METHOD(1012,"方法不存在异常"),
    INTERRUPTED(1013,"被中止异常"),
    OUT_OF_MEMORY(1014,"内存不足异常"),
    NO_CLASS_DEF_FOUND(1015,"未找到类定义错误"),
    IO(1016,"IO异常"),
    SQL(1017,"SQL异常"),
    SOCKET(1018,"Socket异常"),
    USER_NOT_FIND(2001,"用户不存在");

    private Integer code;

    private String msg;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
