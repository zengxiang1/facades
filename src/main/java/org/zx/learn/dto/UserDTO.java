package org.zx.learn.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiang zeng on 2017/10/24.
 *
 * @author xiang zeng
 */
public class UserDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String realName;

    private String phoneNumber;

    private String address;

    private Integer age;

    private String sex;

    private String registerTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
            "id=" + id +
            ", realName='" + realName + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", address='" + address + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", registerTime=" + registerTime +
            '}';
    }
}
