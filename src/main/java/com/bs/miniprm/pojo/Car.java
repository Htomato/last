package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author 李宇超
 */
public class Car {
    /**
     * 车辆编号
     */
    @Id
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 负责人单位
     */
    @Column(name = "head_company")
    private String headCompany;

    /**
     * 负责人姓名
     */
    @Column(name = "head_name")
    private String headName;

    /**
     * 负责人驾驶证编号
     */
    @Column(name = "head_card")
    private String headCard;

    /**
     * 负责人手机号码
     */
    @Column(name = "head_tele")
    private String headTele;

    /**
     * 车辆所属单位
     */
    @Column(name = "car_company")
    private String carCompany;

    /**
     * 车牌
     */
    @Column(name = "car_licensePlate")
    private String carLicenseplate;

    /**
     * 车牌状态
     */
    @Column(name = "car_licensePlateStatus")
    private Integer carLicenseplatestatus;

    /**
     * 车辆类别：消防车、行政车
     */
    @Column(name = "car_category")
    private String carCategory;

    /**
     * 车辆品牌
     */
    @Column(name = "car_brand")
    private String carBrand;

    /**
     * 车辆型号
     */
    @Column(name = "car_model")
    private String carModel;

    /**
     * 车辆来源
     */
    @Column(name = "car_source")
    private String carSource;

    /**
     * 车辆年审
     */
    @Column(name = "car_review")
    private Integer carReview;

    /**
     * 主管单位年审
     */
    private Integer review;

    /**
     * 获取车辆编号
     *
     * @return car_id - 车辆编号
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置车辆编号
     *
     * @param carId 车辆编号
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取负责人单位
     *
     * @return head_company - 负责人单位
     */
    public String getHeadCompany() {
        return headCompany;
    }

    /**
     * 设置负责人单位
     *
     * @param headCompany 负责人单位
     */
    public void setHeadCompany(String headCompany) {
        this.headCompany = headCompany;
    }

    /**
     * 获取负责人姓名
     *
     * @return head_name - 负责人姓名
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置负责人姓名
     *
     * @param headName 负责人姓名
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取负责人驾驶证编号
     *
     * @return head_card - 负责人驾驶证编号
     */
    public String getHeadCard() {
        return headCard;
    }

    /**
     * 设置负责人驾驶证编号
     *
     * @param headCard 负责人驾驶证编号
     */
    public void setHeadCard(String headCard) {
        this.headCard = headCard;
    }

    /**
     * 获取负责人手机号码
     *
     * @return head_tele - 负责人手机号码
     */
    public String getHeadTele() {
        return headTele;
    }

    /**
     * 设置负责人手机号码
     *
     * @param headTele 负责人手机号码
     */
    public void setHeadTele(String headTele) {
        this.headTele = headTele;
    }

    /**
     * 获取车辆所属单位
     *
     * @return car_company - 车辆所属单位
     */
    public String getCarCompany() {
        return carCompany;
    }

    /**
     * 设置车辆所属单位
     *
     * @param carCompany 车辆所属单位
     */
    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    /**
     * 获取车牌
     *
     * @return car_licensePlate - 车牌
     */
    public String getCarLicenseplate() {
        return carLicenseplate;
    }

    /**
     * 设置车牌
     *
     * @param carLicenseplate 车牌
     */
    public void setCarLicenseplate(String carLicenseplate) {
        this.carLicenseplate = carLicenseplate;
    }

    /**
     * 获取车牌状态
     *
     * @return car_licensePlateStatus - 车牌状态
     */
    public Integer getCarLicenseplatestatus() {
        return carLicenseplatestatus;
    }

    /**
     * 设置车牌状态
     *
     * @param carLicenseplatestatus 车牌状态
     */
    public void setCarLicenseplatestatus(Integer carLicenseplatestatus) {
        this.carLicenseplatestatus = carLicenseplatestatus;
    }

    /**
     * 获取车辆类别：消防车、行政车
     *
     * @return car_category - 车辆类别：消防车、行政车
     */
    public String getCarCategory() {
        return carCategory;
    }

    /**
     * 设置车辆类别：消防车、行政车
     *
     * @param carCategory 车辆类别：消防车、行政车
     */
    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    /**
     * 获取车辆品牌
     *
     * @return car_brand - 车辆品牌
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * 设置车辆品牌
     *
     * @param carBrand 车辆品牌
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * 获取车辆型号
     *
     * @return car_model - 车辆型号
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 设置车辆型号
     *
     * @param carModel 车辆型号
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * 获取车辆来源
     *
     * @return car_source - 车辆来源
     */
    public String getCarSource() {
        return carSource;
    }

    /**
     * 设置车辆来源
     *
     * @param carSource 车辆来源
     */
    public void setCarSource(String carSource) {
        this.carSource = carSource;
    }

    /**
     * 获取车辆年审
     *
     * @return car_review - 车辆年审
     */
    public Integer getCarReview() {
        return carReview;
    }

    /**
     * 设置车辆年审
     *
     * @param carReview 车辆年审
     */
    public void setCarReview(Integer carReview) {
        this.carReview = carReview;
    }

    /**
     * 获取主管单位年审
     *
     * @return review - 主管单位年审
     */
    public Integer getReview() {
        return review;
    }

    /**
     * 设置主管单位年审
     *
     * @param review 主管单位年审
     */
    public void setReview(Integer review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", headCompany='" + headCompany + '\'' +
                ", headName='" + headName + '\'' +
                ", headCard='" + headCard + '\'' +
                ", headTele='" + headTele + '\'' +
                ", carCompany='" + carCompany + '\'' +
                ", carLicenseplate='" + carLicenseplate + '\'' +
                ", carLicenseplatestatus=" + carLicenseplatestatus +
                ", carCategory='" + carCategory + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carSource='" + carSource + '\'' +
                ", carReview=" + carReview +
                ", review=" + review +
                '}';
    }
}
