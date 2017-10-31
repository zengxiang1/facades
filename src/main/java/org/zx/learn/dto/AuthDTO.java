package org.zx.learn.dto;

import java.io.Serializable;

/**
 * Created by xiang zeng on 2017/10/24.
 *
 * @author xiang zeng
 */
public class AuthDTO implements Serializable {


    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private String accountName;

    private String accountPwd;

    private Integer accountStatus;

    private String sysRole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd == null ? null : accountPwd.trim();
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getSysRole() {
        return sysRole;
    }

    public void setSysRole(String sysRole) {
        this.sysRole = sysRole == null ? null : sysRole.trim();
    }

    @Override
    public String toString() {
        return "AuthDTO{" +
            "id=" + id +
            ", userId=" + userId +
            ", accountName='" + accountName + '\'' +
            ", accountPwd='" + accountPwd + '\'' +
            ", accountStatus=" + accountStatus +
            ", sysRole='" + sysRole + '\'' +
            '}';
    }
}
