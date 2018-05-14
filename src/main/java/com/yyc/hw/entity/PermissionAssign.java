package com.yyc.hw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PermissionAssign{
    @Id
    @GeneratedValue
    private Integer permissionAssignID;
    private Integer roleID;
    private Integer permissionID;
    private String remark;

    public PermissionAssign() {

    }
    public Integer getPermissionAssignID() {
        return permissionAssignID;
    }

    public void setPermissionAssignID(Integer permissionAssignID) {
        this.permissionAssignID = permissionAssignID;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public Integer getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(Integer permissionID) {
        this.permissionID = permissionID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
