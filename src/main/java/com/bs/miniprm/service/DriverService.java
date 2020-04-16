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

}
