package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author 李宇超
 */
public class Driver {
    /**
     * 驾驶员编号
     */
    @Id
    @Column(name = "driver_id")
    private Integer driverId;

    /**
     * 驾驶员姓名
     */
    @Column(name = "driver_name")
    private String driverName;

    /**
     * 驾驶员年龄
     */
    @Column(name = "driver_age")
    private Integer driverAge;

    /**
     * 驾驶员单位
     */
    @Column(name = "driver_company")
    private String driverCompany;

    /**
     * 驾驶员申请时间
     */
    @Column(name = "driver_applyDate")
    private Date driverApplydate;

    /**
     * 驾驶员初次领证时间
     */
    @Column(name = "driver_firstDate")
    private Date driverFirstdate;

    /**
     * 驾驶证到期时间
     */
    @Column(name = "driver_lastDate")
    private Date driverLastdate;

    /**
     * 驾驶证号码
     */
    @Column(name = "license_number")
    private String licenseNumber;

    /**
     * 驾驶证类型
     */
    @Column(name = "license_type")
    private String licenseType;

    /**
     * 驾驶证分数
     */
    @Column(name = "license_score")
    private Integer licenseScore;

    /**
     * 驾驶证状态:0:未申请;1:正常;2:吊销
     */
    @Column(name = "license_status")
    private Integer licenseStatus;

    /**
     * 违章记录
     */
    @Column(name = "license_vioRecord")
    private String licenseViorecord;

    /**
     * 违章记录扣分
     */
    @Column(name = "license_deduction")
    private Integer licenseDeduction;

    /**
     * 获取驾驶员编号
     *
     * @return driver_id - 驾驶员编号
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * 设置驾驶员编号
     *
     * @param driverId 驾驶员编号
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * 获取驾驶员姓名
     *
     * @return driver_name - 驾驶员姓名
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 设置驾驶员姓名
     *
     * @param driverName 驾驶员姓名
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * 获取驾驶员年龄
     *
     * @return driver_age - 驾驶员年龄
     */
    public Integer getDriverAge() {
        return driverAge;
    }

    /**
     * 设置驾驶员年龄
     *
     * @param driverAge 驾驶员年龄
     */
    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    /**
     * 获取驾驶员单位
     *
     * @return driver_company - 驾驶员单位
     */
    public String getDriverCompany() {
        return driverCompany;
    }

    /**
     * 设置驾驶员单位
     *
     * @param driverCompany 驾驶员单位
     */
    public void setDriverCompany(String driverCompany) {
        this.driverCompany = driverCompany;
    }

    /**
     * 获取驾驶员申请时间
     *
     * @return driver_applyDate - 驾驶员申请时间
     */
    public Date getDriverApplydate() {
        return driverApplydate;
    }

    /**
     * 设置驾驶员申请时间
     *
     * @param driverApplydate 驾驶员申请时间
     */
    public void setDriverApplydate(Date driverApplydate) {
        this.driverApplydate = driverApplydate;
    }

    /**
     * 获取驾驶员初次领证时间
     *
     * @return driver_firstDate - 驾驶员初次领证时间
     */
    public Date getDriverFirstdate() {
        return driverFirstdate;
    }

    /**
     * 设置驾驶员初次领证时间
     *
     * @param driverFirstdate 驾驶员初次领证时间
     */
    public void setDriverFirstdate(Date driverFirstdate) {
        this.driverFirstdate = driverFirstdate;
    }

    /**
     * 获取驾驶证到期时间
     *
     * @return driver_lastDate - 驾驶证到期时间
     */
    public Date getDriverLastdate() {
        return driverLastdate;
    }

    /**
     * 设置驾驶证到期时间
     *
     * @param driverLastdate 驾驶证到期时间
     */
    public void setDriverLastdate(Date driverLastdate) {
        this.driverLastdate = driverLastdate;
    }

    /**
     * 获取驾驶证号码
     *
     * @return license_number - 驾驶证号码
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 设置驾驶证号码
     *
     * @param licenseNumber 驾驶证号码
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * 获取驾驶证类型
     *
     * @return license_type - 驾驶证类型
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * 设置驾驶证类型
     *
     * @param licenseType 驾驶证类型
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * 获取驾驶证分数
     *
     * @return license_score - 驾驶证分数
     */
    public Integer getLicenseScore() {
        return licenseScore;
    }

    /**
     * 设置驾驶证分数
     *
     * @param licenseScore 驾驶证分数
     */
    public void setLicenseScore(Integer licenseScore) {
        this.licenseScore = licenseScore;
    }

    /**
     * 获取驾驶证状态:0:未申请;1:正常;2:吊销
     *
     * @return license_status - 驾驶证状态:0:未申请;1:正常;2:吊销
     */
    public Integer getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * 设置驾驶证状态:0:未申请;1:正常;2:吊销
     *
     * @param licenseStatus 驾驶证状态:0:未申请;1:正常;2:吊销
     */
    public void setLicenseStatus(Integer licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    /**
     * 获取违章记录
     *
     * @return license_vioRecord - 违章记录
     */
    public String getLicenseViorecord() {
        return licenseViorecord;
    }

    /**
     * 设置违章记录
     *
     * @param licenseViorecord 违章记录
     */
    public void setLicenseViorecord(String licenseViorecord) {
        this.licenseViorecord = licenseViorecord;
    }

    /**
     * 获取违章记录扣分
     *
     * @return license_deduction - 违章记录扣分
     */
    public Integer getLicenseDeduction() {
        return licenseDeduction;
    }

    /**
     * 设置违章记录扣分
     *
     * @param licenseDeduction 违章记录扣分
     */
    public void setLicenseDeduction(Integer licenseDeduction) {
        this.licenseDeduction = licenseDeduction;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", driverAge=" + driverAge +
                ", driverCompany='" + driverCompany + '\'' +
                ", driverApplydate=" + driverApplydate +
                ", driverFirstdate=" + driverFirstdate +
                ", driverLastdate=" + driverLastdate +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", licenseType='" + licenseType + '\'' +
                ", licenseScore=" + licenseScore +
                ", licenseStatus=" + licenseStatus +
                ", licenseViorecord='" + licenseViorecord + '\'' +
                ", licenseDeduction=" + licenseDeduction +
                '}';
    }
}
