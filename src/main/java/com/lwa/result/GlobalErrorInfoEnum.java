package com.lwa.result;

/**
 * 应用系统级别的错误码
 * Created by lwa on 2017/5/4.
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface{
    SUCCESS("200", "success"),
    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorInfoEnum(String code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
