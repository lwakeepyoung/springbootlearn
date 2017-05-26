package com.lwa.result;

/**
 * Created by lwa on 2017/5/4.
 */
public class GlobalErrorInfoException extends Exception{
    private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
