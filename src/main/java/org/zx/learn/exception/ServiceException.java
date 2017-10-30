package org.zx.learn.exception;

/**
 * Created by xiang zeng on 2017/10/28.
 *
 * @author xiang zeng
 */
public class ServiceException extends RuntimeException{
    /**
     * 系统错误
     */
    public static final Integer SYS_ERROR_CODE = 1;
    /**
     * 参数提交错误
     */
    public static final Integer ILLEGAL_ARGUMENT_ERROR_CODE = 2;
    public static final String ILLEGAL_ARGUMENT_ERROR_MESSAGE = "参数提交错误";
    /**
     * 查无数据
     */
    public static final Integer NO_DATA_RESULT_ERROR_CODE = 3;
    public static final String NO_DATA_RESULT_ERROR_MESSAGE = "查无数据";
    /**
     * 执行操作影响了0行
     */
    public static final  Integer NO_CHANGE_ERROR_CODE = 4;
    public static final String NO_CHANGE_ERROR_MESSAGE= "操作影响0行";

    private Integer errorCode;
    private String errorMsg;

    public ServiceException(Integer errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
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
