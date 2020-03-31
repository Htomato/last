package com.bs.miniprm.pojo;

import javax.persistence.*;

public class Trman {
    /**
     * 培训人员id
     */
    @Id
    @Column(name = "trMan_id")
    private Integer trmanId;

    /**
     * 培训人员姓名
     */
    @Column(name = "trMan_name")
    private String trmanName;

    /**
     * 培训人员成绩
     */
    @Column(name = "trMan_grades")
    private String trmanGrades;

    /**
     * 培训人员工作单位
     */
    @Column(name = "trMan_company")
    private String trmanCompany;

    /**
     * 获取培训人员id
     *
     * @return trMan_id - 培训人员id
     */
    public Integer getTrmanId() {
        return trmanId;
    }

    /**
     * 设置培训人员id
     *
     * @param trmanId 培训人员id
     */
    public void setTrmanId(Integer trmanId) {
        this.trmanId = trmanId;
    }

    /**
     * 获取培训人员姓名
     *
     * @return trMan_name - 培训人员姓名
     */
    public String getTrmanName() {
        return trmanName;
    }

    /**
     * 设置培训人员姓名
     *
     * @param trmanName 培训人员姓名
     */
    public void setTrmanName(String trmanName) {
        this.trmanName = trmanName;
    }

    /**
     * 获取培训人员成绩
     *
     * @return trMan_grades - 培训人员成绩
     */
    public String getTrmanGrades() {
        return trmanGrades;
    }

    /**
     * 设置培训人员成绩
     *
     * @param trmanGrades 培训人员成绩
     */
    public void setTrmanGrades(String trmanGrades) {
        this.trmanGrades = trmanGrades;
    }

    /**
     * 获取培训人员工作单位
     *
     * @return trMan_company - 培训人员工作单位
     */
    public String getTrmanCompany() {
        return trmanCompany;
    }

    /**
     * 设置培训人员工作单位
     *
     * @param trmanCompany 培训人员工作单位
     */
    public void setTrmanCompany(String trmanCompany) {
        this.trmanCompany = trmanCompany;
    }
}
