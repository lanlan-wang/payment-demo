package com.wll.paymentdemo.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglanlan
 * @Description：
 */
@Data
public class Result {
    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 返回值
     */
    private Map<String, Object> data = new HashMap<>();

    public static Result ok() {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("成功");
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("失败");
        return result;
    }

    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}
