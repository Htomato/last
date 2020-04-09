package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Car;

import java.util.List;

/**
 * @author 李宇超
 */
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
     * 根据id查询车辆
     * @param id
     * @return
     */
    Car queryById(int id);

    /**
     * 查询所有没有车牌的车辆
     * @return
     */
    List<Car> queryNew();

    /**
     * 更改车辆属性
     * @param car 更改后的车辆属性
     * @return 结果码 0失败 1成功
     */
    int update(Car car);

    /**
     * 添加车辆
     * @param car
     * @return 结果码 0失败 1成功
     */
    int add(Car car);








}
