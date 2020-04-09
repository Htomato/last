package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.CarMapper;
import com.bs.miniprm.pojo.Car;
import com.bs.miniprm.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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

}
