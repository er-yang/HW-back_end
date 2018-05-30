package com.yyc.hw.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MonitorNode {
    @Id
    @GeneratedValue
    private Integer nodeID;
    private String nodeName;
    private Integer monitorCenterID;
    private Integer typeID;
    private String longitude;
    private String latitude;
    private String remark;

    public MonitorNode() {}
    public Integer getNodeID() {
        return nodeID;
    }

    public void setNodeID(Integer nodeID) {
        this.nodeID = nodeID;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getMonitorCenterID() {
        return monitorCenterID;
    }

    public void setMonitorCenterID(Integer monitorCenterID) {
        this.monitorCenterID = monitorCenterID;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
