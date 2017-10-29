package org.zx.learn.exception;

/**
 * Created by xiang zeng on 2017/10/28.
 *
 * @author xiang zeng
 */
public class ServiceException extends RuntimeException{
    private static final Integer ILLEGALARGUMENT_ERROR_CODE =
    private Integer errorCode;

    public ServiceException(String msg,Integer errorCode) {
        super(msg);
    }

}
