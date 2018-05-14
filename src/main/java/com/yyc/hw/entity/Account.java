package com.yyc.hw.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Account {
    @Id
    @GeneratedValue
    private Integer accountID;
    private String accountCode;
    private String accountName;
    private String loginName;
    private String passWord;
    private String state;
    private String sex;
    private Integer departmentID;
    private String phone;
    private String remark;

    public Account() {

    }
    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getAccountcode() {
        return accountCode;
    }

    public void     setAccountcode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountNamr) {
        this.accountName = accountNamr;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
