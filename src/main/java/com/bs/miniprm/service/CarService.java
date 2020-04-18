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
     * 查询所有更改过车牌的车辆
     * @return
     */
    List<Car> queryChanged();


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

    /**
     * 查询所有未经车辆年审的车辆
     * @return 未经车辆年审的车辆
     */
    List<Car> queryCarReview();

    /**
     * 更改车辆年审状态
     * @return 更改结果码
     */
    int changeCarReview(int id);

    /**
     * 查询所有未经主管单位年审的车辆
     * @return 未经主管单位年审的车辆
     */
    List<Car> queryReview();

    /**
     * 更改车辆 主管单位年审状态
     * @return 更改的结果码
     */
    int changeReview(int id);

    /**
     * 条件查询消防车
     * @param carLicenseplate
     * @param headName
     * @return
     */
    List<Car> selectorFire(String carLicenseplate,String headName);

    /**
     * 条件查询行政车
     * @param carLicenseplate
     * @param headName
     * @return
     */
    List<Car> selectorAdmin(String carLicenseplate,String headName);

    /**
     * 车牌申请查询
     * @param carBrand
     * @param carCompany
     * @return
     */
    List<Car> selectorChePai(String carBrand,String carCompany);

    /**
     * 条件查询车牌变更
     * @param carLicenseplateold
     * @param carLicenseplate
     * @param headName
     * @return
     */
    List<Car> selectorChFile(String carLicenseplateold,String carLicenseplate,String headName);


    /**
     * 主管单位年审 条件查询
     * @param carLicenseplate
     * @param headCompany
     * @param headName
     * @return
     */
    List<Car> selectorCarReview(String carLicenseplate,String headCompany,String headName);

    /**
     * 主管单位年审 条件查询
     * @param carLicenseplate
     * @param headCompany
     * @param headName
     * @return
     */
    List<Car> selectorReview(String carLicenseplate,String headCompany,String headName);

    /**
     * 查询下级上报车辆：①下级单位 ② 新添加车辆
     * @return
     */
    List<Car> under();

    /**
     * 下级上报申请 条件查询
     * @param carCategory
     * @param carCompany
     * @return
     */
    List<Car> selectorUnder(String carCategory, String carCompany );









    }
