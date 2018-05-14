package com.yyc.hw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Permission{
    @Id
    @GeneratedValue
    private Integer permissionID;
    private String permissionCode;
    private String permissionName;
    private String remark;

    public Permission() {
    }

    public Integer getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(Integer permissionID) {
        this.permissionID = permissionID;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
