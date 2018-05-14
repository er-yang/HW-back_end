package com.yyc.hw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RoleAssign {
    @Id
    @GeneratedValue
    private Integer roleAssignID;
    private Integer roleID;
    private Integer accountID;
    private String remark;

    public RoleAssign() {}
    public Integer getRoleAssignID() {
        return roleAssignID;
    }

    public void setRoleAssignID(Integer roleAssignID) {
        this.roleAssignID = roleAssignID;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
