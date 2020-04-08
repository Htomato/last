package com.bs.miniprm.controller;


import com.bs.miniprm.pojo.Car;
import com.bs.miniprm.service.impl.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李宇超
 */
@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;


    @RequestMapping("allFireCar")
    public Object allFireCar(){
        List<Car> fireCars = carServiceImpl.queryAllFire();
        return fireCars;
    }

    @RequestMapping("allAdminCar")
    public Object allAdminCar(){
        List<Car> adminCars = carServiceImpl.queryAllAdmin();
        return adminCars;
    }

}
