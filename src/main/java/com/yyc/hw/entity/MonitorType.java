package com.yyc.hw.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class MonitorType{
    @Id
    @GeneratedValue
    private Integer typeID;
    private String typeName;
    private String state;
    private Date createTime;
    private String remark;

    public MonitorType() {

    }
    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
