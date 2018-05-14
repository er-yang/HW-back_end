package com.yyc.hw.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Camera {
    @Id
    @GeneratedValue
    private Integer cameraID;

    private String ip;
    private String name;
    private String longitude;
    private String latitude;
    private String address;
    private String remark;

    public Camera() {

    }
    public Integer getCameraID() {
        return cameraID;
    }

    public void setCameraID(Integer cameraID) {
        this.cameraID = cameraID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
