package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class License {
    /**
     * 驾驶员档案编号号码
     */
    @Id
    @Column(name = "license_number")
    private Long licenseNumber;

    /**
     * 获取驾驶员档案编号号码
     *
     * @return license_number - 驾驶员档案编号号码
     */
    public Long getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 设置驾驶员档案编号号码
     *
     * @param licenseNumber 驾驶员档案编号号码
     */
    public void setLicenseNumber(Long licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
