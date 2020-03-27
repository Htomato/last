package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Trplan {
    /**
     * 培训方案ID
     */
    @Id
    @Column(name = "trplan_id")
    private Integer trplanId;

    /**
     * 培训机构名称
     */
    @Column(name = "trOrg")
    private String trorg;

    /**
     * 培训类别
     */
    @Column(name = "trPlanType")
    private String trplantype;

    /**
     * 培训方案详细内容
     */
    @Column(name = "trPlanContent")
    private String trplancontent;

    /**
     * 获取培训方案ID
     *
     * @return trplan_id - 培训方案ID
     */
    public Integer getTrplanId() {
        return trplanId;
    }

    /**
     * 设置培训方案ID
     *
     * @param trplanId 培训方案ID
     */
    public void setTrplanId(Integer trplanId) {
        this.trplanId = trplanId;
    }

    /**
     * 获取培训机构名称
     *
     * @return trOrg - 培训机构名称
     */
    public String getTrorg() {
        return trorg;
    }

    /**
     * 设置培训机构名称
     *
     * @param trorg 培训机构名称
     */
    public void setTrorg(String trorg) {
        this.trorg = trorg;
    }

    /**
     * 获取培训类别
     *
     * @return trPlanType - 培训类别
     */
    public String getTrplantype() {
        return trplantype;
    }

    /**
     * 设置培训类别
     *
     * @param trplantype 培训类别
     */
    public void setTrplantype(String trplantype) {
        this.trplantype = trplantype;
    }

    /**
     * 获取培训方案详细内容
     *
     * @return trPlanContent - 培训方案详细内容
     */
    public String getTrplancontent() {
        return trplancontent;
    }

    /**
     * 设置培训方案详细内容
     *
     * @param trplancontent 培训方案详细内容
     */
    public void setTrplancontent(String trplancontent) {
        this.trplancontent = trplancontent;
    }
}
