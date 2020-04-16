package com.bs.miniprm.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

public class Outcar {
    /**
     * 外来车辆编号
     */
    @Id
    @Column(name = "outCar_id")
    private Integer outcarId;

    /**
     * 备注
     */
    @Column(name = "outCar_remarks")
    private String outcarRemarks;

    /**
     * 驾驶员
     */
    @Column(name = "outCar_driver")
    private String outcarDriver;

    /**
     * 车型
     */
    @Column(name = "outCar_model")
    private String outcarModel;

    /**
     * 牌照
     */
    @Column(name = "outCar_license")
    private String outcarLicense;

    /**
     * 进入时间
     */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @Column(name = "outCar_inTime")
    private Date outcarIntime;

    /**
     * 出去时间
     */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @Column(name = "outCar_outTime")
    private Date outcarOuttime;

    /**
     * 车辆现在的状态；1在队内 0在队外
     */
    @Column(name = "outCar_status")
    private Integer outcarStatus;

    /**
     * 获取外来车辆编号
     *
     * @return outCar_id - 外来车辆编号
     */
    public Integer getOutcarId() {
        return outcarId;
    }

    /**
     * 设置外来车辆编号
     *
     * @param outcarId 外来车辆编号
     */
    public void setOutcarId(Integer outcarId) {
        this.outcarId = outcarId;
    }

    /**
     * 获取备注
     *
     * @return outCar_remarks - 备注
     */
    public String getOutcarRemarks() {
        return outcarRemarks;
    }

    /**
     * 设置备注
     *
     * @param outcarRemarks 备注
     */
    public void setOutcarRemarks(String outcarRemarks) {
        this.outcarRemarks = outcarRemarks;
    }

    /**
     * 获取驾驶员
     *
     * @return outCar_driver - 驾驶员
     */
    public String getOutcarDriver() {
        return outcarDriver;
    }

    /**
     * 设置驾驶员
     *
     * @param outcarDriver 驾驶员
     */
    public void setOutcarDriver(String outcarDriver) {
        this.outcarDriver = outcarDriver;
    }

    /**
     * 获取车型
     *
     * @return outCar_model - 车型
     */
    public String getOutcarModel() {
        return outcarModel;
    }

    /**
     * 设置车型
     *
     * @param outcarModel 车型
     */
    public void setOutcarModel(String outcarModel) {
        this.outcarModel = outcarModel;
    }

    /**
     * 获取牌照
     *
     * @return outCar_license - 牌照
     */
    public String getOutcarLicense() {
        return outcarLicense;
    }

    /**
     * 设置牌照
     *
     * @param outcarLicense 牌照
     */
    public void setOutcarLicense(String outcarLicense) {
        this.outcarLicense = outcarLicense;
    }

    /**
     * 获取进入时间
     *
     * @return outCar_inTime - 进入时间
     */
    public Date getOutcarIntime() {
        return outcarIntime;
    }

    /**
     * 设置进入时间
     *
     * @param outcarIntime 进入时间
     */
    public void setOutcarIntime(Date outcarIntime) {
        this.outcarIntime = outcarIntime;
    }

    /**
     * 获取出去时间
     *
     * @return outCar_outTime - 出去时间
     */
    public Date getOutcarOuttime() {
        return outcarOuttime;
    }

    /**
     * 设置出去时间
     *
     * @param outcarOuttime 出去时间
     */
    public void setOutcarOuttime(Date outcarOuttime) {
        this.outcarOuttime = outcarOuttime;
    }

    /**
     * 获取车辆现在的状态；1在队内 0在队外
     *
     * @return outCar_status - 车辆现在的状态；1在队内 0在队外
     */
    public Integer getOutcarStatus() {
        return outcarStatus;
    }

    /**
     * 设置车辆现在的状态；1在队内 0在队外
     *
     * @param outcarStatus 车辆现在的状态；1在队内 0在队外
     */
    public void setOutcarStatus(Integer outcarStatus) {
        this.outcarStatus = outcarStatus;
    }
}
