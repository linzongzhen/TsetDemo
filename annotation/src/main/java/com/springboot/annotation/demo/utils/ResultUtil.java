package com.springboot.annotation.demo.utils;

import com.springboot.annotation.demo.view.ExceptionEnum;
import com.springboot.annotation.demo.view.Result;

public class ResultUtil {

    /**
     * 返回成功，传入返回体具体出參
     *
     * @param object 成功的参数obj
     * @return Result
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setStatus(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    /**
     * 提供给部分不需要出參的接口
     *
     * @return Result
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 自定义错误信息
     *
     * @param code 结果码
     * @param msg 返回信息
     * @return Result
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setStatus(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    /**
     * 返回异常信息，在已知的范围内
     *
     * @param exceptionEnum 异常枚举类
     * @return Result
     */
    public static Result error(ExceptionEnum exceptionEnum) {
        Result result = new Result();
        result.setStatus(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setData(null);
        return result;
    }
}
