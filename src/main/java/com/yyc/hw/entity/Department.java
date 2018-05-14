package com.yyc.hw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department{
    @Id
    @GeneratedValue
    private Integer departmentID;
    private String departmentName;
    private Integer institutionID;
    private String remark;

    public Department(){}

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(Integer institutionID) {
        this.institutionID = institutionID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
