package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Worker {
    /**
     * 工作人员id
     */
    @Id
    @Column(name = "worker_id")
    private Integer workerId;

    /**
     * 姓名
     */
    @Column(name = "worker_name")
    private String workerName;

    /**
     * 职位：装备技师 质检员
     */
    @Column(name = "worker_job")
    private String workerJob;

    /**
     * 工作单位
     */
    @Column(name = "worker_company")
    private String workerCompany;

    /**
     * 工龄
     */
    @Column(name = "worker_year")
    private Integer workerYear;

    /**
     * 照片
     */
    @Column(name = "worker_photo")
    private String workerPhoto;

    /**
     * 审查状态
     */
    @Column(name = "worker_status")
    private Integer workerStatus;

    /**
     * 个人介绍
     */
    @Column(name = "worker_detail")
    private String workerDetail;

    /**
     * 获取工作人员id
     *
     * @return worker_id - 工作人员id
     */
    public Integer getWorkerId() {
        return workerId;
    }

    /**
     * 设置工作人员id
     *
     * @param workerId 工作人员id
     */
    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    /**
     * 获取姓名
     *
     * @return worker_name - 姓名
     */
    public String getWorkerName() {
        return workerName;
    }

    /**
     * 设置姓名
     *
     * @param workerName 姓名
     */
    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    /**
     * 获取职位：装备技师 质检员
     *
     * @return worker_job - 职位：装备技师 质检员
     */
    public String getWorkerJob() {
        return workerJob;
    }

    /**
     * 设置职位：装备技师 质检员
     *
     * @param workerJob 职位：装备技师 质检员
     */
    public void setWorkerJob(String workerJob) {
        this.workerJob = workerJob;
    }

    /**
     * 获取工作单位
     *
     * @return worker_company - 工作单位
     */
    public String getWorkerCompany() {
        return workerCompany;
    }

    /**
     * 设置工作单位
     *
     * @param workerCompany 工作单位
     */
    public void setWorkerCompany(String workerCompany) {
        this.workerCompany = workerCompany;
    }

    /**
     * 获取工龄
     *
     * @return worker_year - 工龄
     */
    public Integer getWorkerYear() {
        return workerYear;
    }

    /**
     * 设置工龄
     *
     * @param workerYear 工龄
     */
    public void setWorkerYear(Integer workerYear) {
        this.workerYear = workerYear;
    }

    /**
     * 获取照片
     *
     * @return worker_photo - 照片
     */
    public String getWorkerPhoto() {
        return workerPhoto;
    }

    /**
     * 设置照片
     *
     * @param workerPhoto 照片
     */
    public void setWorkerPhoto(String workerPhoto) {
        this.workerPhoto = workerPhoto;
    }

    /**
     * 获取审查状态
     *
     * @return worker_status - 审查状态
     */
    public Integer getWorkerStatus() {
        return workerStatus;
    }

    /**
     * 设置审查状态
     *
     * @param workerStatus 审查状态
     */
    public void setWorkerStatus(Integer workerStatus) {
        this.workerStatus = workerStatus;
    }

    /**
     * 获取个人介绍
     *
     * @return worker_detail - 个人介绍
     */
    public String getWorkerDetail() {
        return workerDetail;
    }

    /**
     * 设置个人介绍
     *
     * @param workerDetail 个人介绍
     */
    public void setWorkerDetail(String workerDetail) {
        this.workerDetail = workerDetail;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", workerName='" + workerName + '\'' +
                ", workerJob='" + workerJob + '\'' +
                ", workerCompany='" + workerCompany + '\'' +
                ", workerYear=" + workerYear +
                ", workerPhoto='" + workerPhoto + '\'' +
                ", workerStatus=" + workerStatus +
                ", workerDetail='" + workerDetail + '\'' +
                '}';
    }
}
