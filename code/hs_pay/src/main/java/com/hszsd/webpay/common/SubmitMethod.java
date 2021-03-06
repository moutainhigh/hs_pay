package com.hszsd.webpay.common;

/**
 * 数据提交方式
 * Created by gzhengDu on 2016/7/5.
 */
public enum SubmitMethod {
    POST("post"), GET("get");

    private String method;

    SubmitMethod(String method){
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
