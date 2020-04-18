package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.CarMapper;
import com.bs.miniprm.pojo.Car;
import com.bs.miniprm.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;


    @Override
    public List<Car> queryAllFire() {
        Example fireExample = new Example(Car.class);
        fireExample.createCriteria().andEqualTo("carCategory","消防车");
        List<Car> cars = carMapper.selectByExample(fireExample);
        return cars;
    }



    @Override
    public List<Car> queryAllAdmin() {
        Example adminExample = new Example(Car.class);
        adminExample.createCriteria().andEqualTo("carCategory","行政车");
        List<Car> cars = carMapper.selectByExample(adminExample);
        return cars;
    }

    @Override
    public Car queryById(int id) {
        return carMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Car> queryNew() {
        Example carExample = new Example(Car.class);
        carExample.createCriteria().andEqualTo("carLicenseplatestatus",0);
        List<Car> cars = carMapper.selectByExample(carExample);
        return cars;
    }

    @Override
    public List<Car> queryChanged() {
        Example carExample = new Example(Car.class);
        carExample.createCriteria().andEqualTo("carLicenseplatestatus",2);
        List<Car> cars = carMapper.selectByExample(carExample);
        return cars;
    }

    @Override
    public int update(Car car) {
        int i = carMapper.updateByPrimaryKeySelective(car);
        return i;
    }

    @Override
    public int add(Car car) {
        car.setCarLicenseplatestatus(0);
        int i = carMapper.insertSelective(car);
        return i;
    }

    @Override
    public List<Car> queryCarReview() {
        Example carExample = new Example(Car.class);
        carExample.createCriteria().andEqualTo("carReview",0);
        List<Car> cars = carMapper.selectByExample(carExample);
        return cars;
    }

    @Override
    public int changeCarReview(int id) {
        Car car = carMapper.selectByPrimaryKey(id);
        car.setCarReview(1);
        int i = carMapper.updateByPrimaryKeySelective(car);
        return i;
    }

    @Override
    public List<Car> queryReview() {
        Example carExample = new Example(Car.class);
        carExample.createCriteria().andEqualTo("review",0);
        List<Car> cars = carMapper.selectByExample(carExample);
        return cars;
    }

    @Override
    public int changeReview(int id) {
        Car car = carMapper.selectByPrimaryKey(id);
        car.setReview(1);
        int i = carMapper.updateByPrimaryKeySelective(car);
        return i;
    }

    @Override
    public List<Car> selectorFire(String carLicenseplate, String headName) {
            Example carExample = new Example(Car.class);
            if (carLicenseplate != ""){
                carExample.createCriteria()
                        .andEqualTo("carLicenseplate",carLicenseplate)
                        .andEqualTo("carCategory","消防车");
            }else {
                carExample.createCriteria()
                        .andEqualTo("headName",headName)
                        .andEqualTo("carCategory","消防车");

            }
        List<Car> carList = carMapper.selectByExample(carExample);
        return carList;

    }

    @Override
    public List<Car> selectorAdmin(String carLicenseplate, String headName) {
        Example carExample = new Example(Car.class);
        if (carLicenseplate != ""){
            carExample.createCriteria()
                    .andEqualTo("carLicenseplate",carLicenseplate)
                    .andEqualTo("carCategory","行政车");
        }else {
            carExample.createCriteria()
                    .andEqualTo("headName",headName)
                    .andEqualTo("carCategory","行政车");

        }
        List<Car> carList = carMapper.selectByExample(carExample);
        return carList;
    }

    @Override
    public List<Car> selectorChePai(String carBrand, String carCompany) {
        Example carExample = new Example(Car.class);
        if (carBrand != ""){
            carExample.createCriteria()
                    .andEqualTo("carBrand",carBrand)
                    .andEqualTo("carLicenseplatestatus",0);
        }else {
            carExample.createCriteria()
                    .andEqualTo("carCompany",carCompany)
                    .andEqualTo("carLicenseplatestatus",0);
        }
        List<Car> carList = carMapper.selectByExample(carExample);
        return carList;
    }

    @Override
    public List<Car> selectorChFile(String carLicenseplateold, String carLicenseplate, String headName) {
        Example carExample = new Example(Car.class);
        if (carLicenseplateold != ""){
            carExample.createCriteria().andEqualTo("carLicenseplateold",carLicenseplateold);
        }else if (carLicenseplate != "" && headName != ""){
            carExample.createCriteria().andEqualTo("carLicenseplate",carLicenseplate)
                    .andEqualTo("headName",headName);
        }else if (carLicenseplate != ""){
            carExample.createCriteria().andEqualTo("carLicenseplate",carLicenseplate);
        }else {
            carExample.createCriteria().andEqualTo("headName",headName);
        }
        return carMapper.selectByExample(carExample);
    }

    @Override
    public List<Car> selectorCarReview(String carLicenseplate, String carCompany, String headName) {
        Example carExample = new Example(Car.class);
        Example.Criteria carExampleCriteria = carExample.createCriteria();
        carExampleCriteria.andEqualTo("review",0);
        if (carLicenseplate != ""){
            carExampleCriteria.andEqualTo("carLicenseplate",carLicenseplate);
        }else if (carCompany != "" && headName != ""){
            carExampleCriteria.andEqualTo("carCompany",carCompany)
                    .andEqualTo("headName",headName);
        }else if (carCompany != ""){
            carExampleCriteria.andEqualTo("carCompany",carCompany);
        }else {
            carExampleCriteria.andEqualTo("headName",headName);
        }
        return carMapper.selectByExample(carExample);
    }

    @Override
    public List<Car> selectorReview(String carLicenseplate, String carCompany, String headName) {
        Example carExample = new Example(Car.class);
        Example.Criteria carExampleCriteria = carExample.createCriteria();
        carExampleCriteria.andEqualTo("carReview",0);
        if (carLicenseplate != ""){
            carExampleCriteria.andEqualTo("carLicenseplate",carLicenseplate);
        }else if (carCompany != "" && headName != ""){
            carExampleCriteria.andEqualTo("carCompany",carCompany)
                    .andEqualTo("headName",headName);
        }else if (carCompany != ""){
            carExampleCriteria.andEqualTo("carCompany",carCompany);
        }else {
            carExampleCriteria.andEqualTo("headName",headName);
        }
        return carMapper.selectByExample(carExample);
    }

    /**
     * 查询下级上报车辆：①下级单位 ② 新添加车辆
     *
     * @return
     */
    @Override
    public List<Car> under() {
        Example carExample = new Example(Car.class);
        Example.Criteria carExampleCriteria = carExample.createCriteria();
        carExampleCriteria.andEqualTo("carLicenseplatestatus",0)
                .andNotEqualTo("carCompany","消防总队");
        List<Car> carList = carMapper.selectByExample(carExample);
        return carList;
    }

    /**
     * 下级上报申请 条件查询
     *
     * @param carCategory
     * @param carCompany
     * @return
     */
    @Override
    public List<Car> selectorUnder(String carCategory, String carCompany) {
        Example carExample = new Example(Car.class);
        Example.Criteria carExampleCriteria = carExample.createCriteria();
        carExampleCriteria.andEqualTo("carLicenseplatestatus",0)
                            .andNotEqualTo("carCompany","消防总队");

        if (carCategory != ""){
            carExampleCriteria.andEqualTo("carCategory",carCategory);
        }else {
            carExampleCriteria.andEqualTo("carCompany",carCompany);
        }
        List<Car> carList = carMapper.selectByExample(carExample);
        return carList;
    }
}
