package org.zx.learn.exception;

/**
 * Created by xiang zeng on 2017/10/28.
 *
 * @author xiang zeng
 */
public class ServiceException extends RuntimeException{

    private Integer errorCode;
    private String errorMsg;

    public ServiceException(ExceptionMsg exceptionMsg) {
        super(exceptionMsg.getMsg());
        this.errorCode = exceptionMsg.getCode();
        this.errorMsg = exceptionMsg.getMsg();
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
