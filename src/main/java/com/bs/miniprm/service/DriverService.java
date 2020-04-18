package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Driver;

import java.util.List;

/**
 * @author 李宇超
 */
public interface DriverService {
    /**
     * 查询所有的驾驶员信息
     * @return
     */
    List<Driver> allDrivers();

    /**
     * 根据id 查询
     * @param id
     * @return
     */
    Driver queryById(int id);

    /**
     * 更改
     * @param driver
     * @return
     */
    int update(Driver driver);

    /**
     * 查询所有驾驶证申请中人员
     * @return
     */
    List<Driver> apply();

    /**
     * 更改驾驶证申请状态
     * @param id
     * @return
     */
    int changeApply(int id);

    /**
     * 查看所有驾照正常的驾驶员信息
     * @return
     */
    List<Driver> normal();

    /**
     * 查询有违章的驾驶员
     * @return
     */
    List<Driver> vioRecord();

    /**
     * 添加驾驶员
     * @param driver
     * @return
     */
    int add(Driver driver);

    /**
     * 人员信息条件查询
     * @param driverName
     * @param licenseType
     * @param driverCompany
     * @return
     */
    List<Driver> selectorPerson(String driverName,String licenseType,String driverCompany);
    /**
     * 驾照申请条件查询
     * @param driverName
     * @param licenseType
     * @param driverCompany
     * @return
     */
    List<Driver> selectorAppli(String driverName,String licenseType,String driverCompany);


    /**
     * 驾照档案申请条件查询
     * @param licenseNumber
     * @param driverName
     * @param driverCompany
     * @return
     */
    List<Driver> selectorFileAppli(String licenseNumber,String driverName,String driverCompany);

    /**
     * 驾驶员年审条件查询
     * @param driverName
     * @param driverCompany
     * @return
     */
    List<Driver> selectorReview(String driverName,String driverCompany);

    /**
     * 违章记录条件查询
     * @param driverName
     * @param licenseType
     * @param driverCompany
     * @return
     */
    List<Driver> selectorVio(String driverName,String licenseType,String driverCompany);

    /**
     * 查询下级上报驾驶员：①下级单位 ② 新添加驾驶员
     * @return
     */
    List<Driver> under();

    /**
     * 下级上报申请 条件查询
     * @param licenseType
     * @param driverCompany
     * @return
     */
    List<Driver> selectorUnder(String licenseType, String driverCompany );

}
