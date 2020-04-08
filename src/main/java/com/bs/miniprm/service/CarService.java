package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Car;

import java.util.List;

public interface CarService {
    /**
     * 查询所有的消防车对象，以列表list的形式返回
     * @return 消防车列表
     */
    List<Car> queryAllFire();

    /**
     * 查询所有的行政车辆
     * @return 行政车列表
     */
    List<Car> queryAllAdmin();

    /**
     * 更改车辆属性
     * @param car 更改后的车辆属性
     * @return 结果码 0失败 1成功
     */
    int update(Car car);






}
