package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Firelicense {
    /**
     *  车牌编号
     */
    @Id
    @Column(name = "firelicense_id")
    private Integer id;

    /**
     * 车牌号
     */
    @Column(name = "firelicense_number")
    private String number;

    /**
     * 获取 车牌编号
     *
     * @return firelicense_id -  车牌编号
     */
    public Integer getFirelicenseId() {
        return id;
    }

    /**
     * 设置 车牌编号
     *
     * @param firelicenseId  车牌编号
     */
    public void setFirelicenseId(Integer firelicenseId) {
        this.id = firelicenseId;
    }

    /**
     * 获取车牌号
     *
     * @return firelicense_number - 车牌号
     */
    public String getFirelicenseNumber() {
        return number;
    }

    /**
     * 设置车牌号
     *
     * @param firelicenseNumber 车牌号
     */
    public void setFirelicenseNumber(String firelicenseNumber) {
        this.number = firelicenseNumber;
    }

    @Override
    public String toString() {
        return "Firelicense{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
