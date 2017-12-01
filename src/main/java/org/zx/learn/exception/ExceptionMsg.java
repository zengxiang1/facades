package org.zx.learn.exception;

import java.io.Serializable;

/**
 * @author zx
 */

public enum ExceptionMsg implements Serializable{
    SYS_ERROR_MSG (1, "系统错误"),
    /**
     * 接口异常
     */
    AUTHENTICATE_ERROR_MSG (1001, "认证失败"),
    ILLEGAL_ARGUMENT_ERROR_MSG(1002, "请求参数失败"),
    NOT_FOUND_ARGUMENT_ERROR_MSG(1003, "请求参数不存在=====>:"),


    NO_DATA_ERROR_MSG(2001, "没有数据返回"),
    NO_CHANGE_ERROR_MSG(2002,"操作影响0行"),
    DATA_BIND_ERROR_MSG(2003, "该数据有关联数据====>"),
    DATA_COMPLETE_EFFECT(2004, "操作成功数据条数====>"),
    CERTIFICATION_ERROR_MSG(8,"认证信息获取失败");
    private Integer code;
    private String msg;

    ExceptionMsg(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
