package org.zx.learn.exception;

import java.io.Serializable;

/**
 * Created by xiang zeng on 2017/10/28.
 *
 * @author xiang zeng
 */
public class ServiceException extends RuntimeException{

    private Integer errorCode;
    private String errorMsg;

    public ServiceException() {
    }

    public ServiceException(ExceptionMsg exceptionMsg) {
        super(exceptionMsg.getMsg());
        this.errorCode = exceptionMsg.getCode();
        this.errorMsg = exceptionMsg.getMsg();
    }
    public ServiceException(ExceptionMsg exceptionMsg,String msg) {
        super(exceptionMsg.getMsg());
        this.errorCode = exceptionMsg.getCode();
        this.errorMsg = exceptionMsg.getMsg() + msg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
