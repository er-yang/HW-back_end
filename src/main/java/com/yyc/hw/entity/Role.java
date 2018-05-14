package com.yyc.hw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Integer roelID;
    private String roleCode;
    private String roleName;
    private String state;
    private String remark;

    public Role() {}
    public Integer getRoelID() {
        return roelID;
    }

    public void setRoelID(Integer roelID) {
        this.roelID = roelID;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
