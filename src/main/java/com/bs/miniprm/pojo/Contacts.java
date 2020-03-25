package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author 李宇超
 */
public class Contacts {
    /**
     * 通讯录人员id
     */
    @Id
    @Column(name = "contact_id")
    private Integer contactId;

    /**
     * 通讯录人员name
     */
    @Column(name = "contact_name")
    private String contactName;

    /**
     * 单位
     */
    private String company;

    /**
     * 职务
     */
    private String job;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 电话号码
     */
    @Column(name = "contact_tele")
    private String contactTele;

    /**
     * 获取通讯录人员id
     *
     * @return contact_id - 通讯录人员id
     */
    public Integer getContactId() {
        return contactId;
    }

    /**
     * 设置通讯录人员id
     *
     * @param contactId 通讯录人员id
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    /**
     * 获取通讯录人员name
     *
     * @return contact_name - 通讯录人员name
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置通讯录人员name
     *
     * @param contactName 通讯录人员name
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取单位
     *
     * @return company - 单位
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置单位
     *
     * @param company 单位
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取职务
     *
     * @return job - 职务
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置职务
     *
     * @param job 职务
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取电话号码
     *
     * @return contact_tele - 电话号码
     */
    public String getContactTele() {
        return contactTele;
    }

    /**
     * 设置电话号码
     *
     * @param contactTele 电话号码
     */
    public void setContactTele(String contactTele) {
        this.contactTele = contactTele;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contactId=" + contactId +
                ", contactName='" + contactName + '\'' +
                ", company='" + company + '\'' +
                ", job='" + job + '\'' +
                ", avatar='" + avatar + '\'' +
                ", contactTele='" + contactTele + '\'' +
                '}';
    }
}
