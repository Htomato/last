package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Traorg {
    /**
     * 培训机构编号
     */
    @Id
    @Column(name = "traOrg_id")
    private Integer traorgId;

    /**
     * 培训机构名称
     */
    @Column(name = "traOrg_name")
    private String traorgName;

    /**
     * 机构的负责人
     */
    @Column(name = "traOrg_head")
    private String traorgHead;

    /**
     * 负责人电话
     */
    @Column(name = "traOrg_headTele")
    private String traorgHeadtele;

    /**
     * 负责的类别
     */
    @Column(name = "traOrg_Type")
    private String traorgType;

    /**
     * 机构审核状态
     */
    @Column(name = "traOrg_status")
    private Integer traorgStatus;

    /**
     * 培训机构的资格证书
     */
    @Column(name = "traOrg_quaImg")
    private String traorgQuaimg;

    /**
     * 机构的详细介绍
     */
    @Column(name = "traOrg_detail")
    private String traorgDetail;

    /**
     * 获取培训机构编号
     *
     * @return traOrg_id - 培训机构编号
     */
    public Integer getTraorgId() {
        return traorgId;
    }

    /**
     * 设置培训机构编号
     *
     * @param traorgId 培训机构编号
     */
    public void setTraorgId(Integer traorgId) {
        this.traorgId = traorgId;
    }

    /**
     * 获取培训机构名称
     *
     * @return traOrg_name - 培训机构名称
     */
    public String getTraorgName() {
        return traorgName;
    }

    /**
     * 设置培训机构名称
     *
     * @param traorgName 培训机构名称
     */
    public void setTraorgName(String traorgName) {
        this.traorgName = traorgName;
    }

    /**
     * 获取机构的负责人
     *
     * @return traOrg_head - 机构的负责人
     */
    public String getTraorgHead() {
        return traorgHead;
    }

    /**
     * 设置机构的负责人
     *
     * @param traorgHead 机构的负责人
     */
    public void setTraorgHead(String traorgHead) {
        this.traorgHead = traorgHead;
    }

    /**
     * 获取负责人电话
     *
     * @return traOrg_headTele - 负责人电话
     */
    public String getTraorgHeadtele() {
        return traorgHeadtele;
    }

    /**
     * 设置负责人电话
     *
     * @param traorgHeadtele 负责人电话
     */
    public void setTraorgHeadtele(String traorgHeadtele) {
        this.traorgHeadtele = traorgHeadtele;
    }

    /**
     * 获取负责的类别
     *
     * @return traOrg_Type - 负责的类别
     */
    public String getTraorgType() {
        return traorgType;
    }

    /**
     * 设置负责的类别
     *
     * @param traorgType 负责的类别
     */
    public void setTraorgType(String traorgType) {
        this.traorgType = traorgType;
    }

    /**
     * 获取机构审核状态
     *
     * @return traOrg_status - 机构审核状态
     */
    public Integer getTraorgStatus() {
        return traorgStatus;
    }

    /**
     * 设置机构审核状态
     *
     * @param traorgStatus 机构审核状态
     */
    public void setTraorgStatus(Integer traorgStatus) {
        this.traorgStatus = traorgStatus;
    }

    /**
     * 获取培训机构的资格证书
     *
     * @return traOrg_quaImg - 培训机构的资格证书
     */
    public String getTraorgQuaimg() {
        return traorgQuaimg;
    }

    /**
     * 设置培训机构的资格证书
     *
     * @param traorgQuaimg 培训机构的资格证书
     */
    public void setTraorgQuaimg(String traorgQuaimg) {
        this.traorgQuaimg = traorgQuaimg;
    }

    /**
     * 获取机构的详细介绍
     *
     * @return traOrg_detail - 机构的详细介绍
     */
    public String getTraorgDetail() {
        return traorgDetail;
    }

    /**
     * 设置机构的详细介绍
     *
     * @param traorgDetail 机构的详细介绍
     */
    public void setTraorgDetail(String traorgDetail) {
        this.traorgDetail = traorgDetail;
    }

    @Override
    public String toString() {
        return "Traorg{" +
                "traorgId=" + traorgId +
                ", traorgName='" + traorgName + '\'' +
                ", traorgHead='" + traorgHead + '\'' +
                ", traorgHeadtele='" + traorgHeadtele + '\'' +
                ", traorgType='" + traorgType + '\'' +
                ", traorgStatus=" + traorgStatus +
                ", traorgQuaimg='" + traorgQuaimg + '\'' +
                ", traorgDetail='" + traorgDetail + '\'' +
                '}';
    }
}
