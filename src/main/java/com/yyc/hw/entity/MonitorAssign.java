package com.yyc.hw.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MonitorAssign{
    @Id
    @GeneratedValue
    private Integer monitorAssignID;
    private Integer superCenterID;
    private Integer subCenterID;
    private String remark;

    public MonitorAssign() {}
    public Integer getMonitorAssignID() {
        return monitorAssignID;
    }

    public void setMonitorAssignID(Integer monitorAssignID) {
        this.monitorAssignID = monitorAssignID;
    }

    public Integer getSuperCenterID() {
        return superCenterID;
    }

    public void setSuperCenterID(Integer superCenterID) {
        this.superCenterID = superCenterID;
    }

    public Integer getSubCenterID() {
        return subCenterID;
    }

    public void setSubCenterID(Integer subCenterID) {
        this.subCenterID = subCenterID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
