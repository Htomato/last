package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Eqexpert {
    /**
     * 装备专家编号
     */
    @Id
    @Column(name = "eqExpert_id")
    private Integer eqexpertId;

    /**
     * 专家姓名
     */
    @Column(name = "eqExpert_name")
    private String eqexpertName;

    /**
     * 专家单位
     */
    @Column(name = "eqExpert_company")
    private String eqexpertCompany;

    /**
     * 专家资质今年审核的结果0不通过1通过
     */
    @Column(name = "eqExpert_last")
    private Integer eqexpertLast;

    /**
     * 专家资质去年审核的结果0不通过1通过
     */
    @Column(name = "eqExpert_befor")
    private Integer eqexpertBefor;

    /**
     * 专家负责的领域
     */
    @Column(name = "eqExpert_domain")
    private String eqexpertDomain;

    /**
     * 专家资质(认证)
     */
    @Column(name = "eqExpert_qua")
    private String eqexpertQua;

    /**
     * 专家资格证书
     */
    @Column(name = "eqExpert_quaImage")
    private String eqexpertQuaimage;

    /**
     * 专家的详细介绍
     */
    @Column(name = "eqExpert_detail")
    private String eqexpertDetail;

    /**
     * 获取装备专家编号
     *
     * @return eqExpert_id - 装备专家编号
     */
    public Integer getEqexpertId() {
        return eqexpertId;
    }

    /**
     * 设置装备专家编号
     *
     * @param eqexpertId 装备专家编号
     */
    public void setEqexpertId(Integer eqexpertId) {
        this.eqexpertId = eqexpertId;
    }

    /**
     * 获取专家姓名
     *
     * @return eqExpert_name - 专家姓名
     */
    public String getEqexpertName() {
        return eqexpertName;
    }

    /**
     * 设置专家姓名
     *
     * @param eqexpertName 专家姓名
     */
    public void setEqexpertName(String eqexpertName) {
        this.eqexpertName = eqexpertName;
    }

    /**
     * 获取专家单位
     *
     * @return eqExpert_company - 专家单位
     */
    public String getEqexpertCompany() {
        return eqexpertCompany;
    }

    /**
     * 设置专家单位
     *
     * @param eqexpertCompany 专家单位
     */
    public void setEqexpertCompany(String eqexpertCompany) {
        this.eqexpertCompany = eqexpertCompany;
    }

    /**
     * 获取专家资质今年审核的结果0不通过1通过
     *
     * @return eqExpert_last - 专家资质今年审核的结果0不通过1通过
     */
    public Integer getEqexpertLast() {
        return eqexpertLast;
    }

    /**
     * 设置专家资质今年审核的结果0不通过1通过
     *
     * @param eqexpertLast 专家资质今年审核的结果0不通过1通过
     */
    public void setEqexpertLast(Integer eqexpertLast) {
        this.eqexpertLast = eqexpertLast;
    }

    /**
     * 获取专家资质去年审核的结果0不通过1通过
     *
     * @return eqExpert_befor - 专家资质去年审核的结果0不通过1通过
     */
    public Integer getEqexpertBefor() {
        return eqexpertBefor;
    }

    /**
     * 设置专家资质去年审核的结果0不通过1通过
     *
     * @param eqexpertBefor 专家资质去年审核的结果0不通过1通过
     */
    public void setEqexpertBefor(Integer eqexpertBefor) {
        this.eqexpertBefor = eqexpertBefor;
    }

    /**
     * 获取专家负责的领域
     *
     * @return eqExpert_domain - 专家负责的领域
     */
    public String getEqexpertDomain() {
        return eqexpertDomain;
    }

    /**
     * 设置专家负责的领域
     *
     * @param eqexpertDomain 专家负责的领域
     */
    public void setEqexpertDomain(String eqexpertDomain) {
        this.eqexpertDomain = eqexpertDomain;
    }

    /**
     * 获取专家资质(认证)
     *
     * @return eqExpert_qua - 专家资质(认证)
     */
    public String getEqexpertQua() {
        return eqexpertQua;
    }

    /**
     * 设置专家资质(认证)
     *
     * @param eqexpertQua 专家资质(认证)
     */
    public void setEqexpertQua(String eqexpertQua) {
        this.eqexpertQua = eqexpertQua;
    }

    /**
     * 获取专家资格证书
     *
     * @return eqExpert_quaImage - 专家资格证书
     */
    public String getEqexpertQuaimage() {
        return eqexpertQuaimage;
    }

    /**
     * 设置专家资格证书
     *
     * @param eqexpertQuaimage 专家资格证书
     */
    public void setEqexpertQuaimage(String eqexpertQuaimage) {
        this.eqexpertQuaimage = eqexpertQuaimage;
    }

    /**
     * 获取专家的详细介绍
     *
     * @return eqExpert_detail - 专家的详细介绍
     */
    public String getEqexpertDetail() {
        return eqexpertDetail;
    }

    /**
     * 设置专家的详细介绍
     *
     * @param eqexpertDetail 专家的详细介绍
     */
    public void setEqexpertDetail(String eqexpertDetail) {
        this.eqexpertDetail = eqexpertDetail;
    }

    @Override
    public String toString() {
        return "Eqexpert{" +
                "eqexpertId=" + eqexpertId +
                ", eqexpertName='" + eqexpertName + '\'' +
                ", eqexpertCompany='" + eqexpertCompany + '\'' +
                ", eqexpertLast=" + eqexpertLast +
                ", eqexpertBefor=" + eqexpertBefor +
                ", eqexpertDomain='" + eqexpertDomain + '\'' +
                ", eqexpertQua='" + eqexpertQua + '\'' +
                ", eqexpertQuaimage='" + eqexpertQuaimage + '\'' +
                ", eqexpertDetail='" + eqexpertDetail + '\'' +
                '}';
    }
}
