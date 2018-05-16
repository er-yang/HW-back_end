package com.yyc.hw.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MonitorAssign{
    @Id
    @GeneratedValue
    private Integer monitorAssignID;
    private Integer supCenterID;
    private Integer subCenterID;
    private String remark;

    public MonitorAssign() {}
    public Integer getMonitorAssignID() {
        return monitorAssignID;
    }

    public void setMonitorAssignID(Integer monitorAssignID) {
        this.monitorAssignID = monitorAssignID;
    }

    public Integer getSupCenterID() {
        return supCenterID;
    }

    public void setSupCenterID(Integer supCenterID) {
        this.supCenterID = supCenterID;
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
