package com.yyc.hw.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MonitorCenter{
    @Id
    @GeneratedValue
    private Integer centerID;
    private String centerName;
    private Integer departmentID;
    private String manager;
    private String remark;

    public MonitorCenter() {
    }
    public Integer getCenterID() {
        return centerID;
    }

    public void setCenterID(Integer centerID) {
        this.centerID = centerID;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
