package com.yyc.hw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Accident {
    @Id
    @GeneratedValue
    private Integer accidentID;
    private String accidentType;
    private String description;
    private Date occurTime;
    private String monitorNodeID;
    private String state;
    private String remark;

    public Accident(){}

    public Integer getAccidentID() {
        return accidentID;
    }

    public void setAccidentID(Integer accidentID) {
        this.accidentID = accidentID;
    }

    public String getAccidentType() {
        return accidentType;
    }

    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
    }

    public String getMonitorNodeID() {
        return monitorNodeID;
    }

    public void setMonitorNodeID(String monitorNodeID) {
        this.monitorNodeID = monitorNodeID;
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
