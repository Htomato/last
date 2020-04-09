package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Adminlicense {
    /**
     * 行政车车牌编号
     */
    @Id
    @Column(name = "adminlicense_id")
    private Integer id;

    /**
     * 行政车车牌号
     */
    @Column(name = "adminlicense_number")
    private String number;

    /**
     * 获取行政车车牌编号
     *
     * @return adminlicense_id - 行政车车牌编号
     */
    public Integer getAdminlicenseId() {
        return id;
    }

    /**
     * 设置行政车车牌编号
     *
     * @param adminlicenseId 行政车车牌编号
     */
    public void setAdminlicenseId(Integer adminlicenseId) {
        this.id = adminlicenseId;
    }

    /**
     * 获取行政车车牌号
     *
     * @return adminlicense_number - 行政车车牌号
     */
    public String getAdminlicenseNumber() {
        return number;
    }

    /**
     * 设置行政车车牌号
     *
     * @param adminlicenseNumber 行政车车牌号
     */
    public void setAdminlicenseNumber(String adminlicenseNumber) {
        this.number = adminlicenseNumber;
    }

    @Override
    public String toString() {
        return "Adminlicense{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
