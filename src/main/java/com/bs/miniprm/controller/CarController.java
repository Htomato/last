package com.bs.miniprm.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Adminlicense;
import com.bs.miniprm.pojo.Car;
import com.bs.miniprm.pojo.Firelicense;
import com.bs.miniprm.service.impl.AdminlicenseServiceImpl;
import com.bs.miniprm.service.impl.CarServiceImpl;
import com.bs.miniprm.service.impl.FirelicenseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李宇超
 */
@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @Autowired
    private FirelicenseServiceImpl firelicenseServiceImpl;
    @Autowired
    private AdminlicenseServiceImpl adminlicenseServiceImpl;


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

    @RequestMapping("add")
    public int addCar(String data){
        JSONObject CarJSON = (JSONObject) JSON.parse(data);
        Car car = CarJSON.toJavaObject(Car.class);
        int add = carServiceImpl.add(car);
        return add;
    }
    @RequestMapping("new")
    public Object newCar(){
        System.out.println("car/new run...");
        List<Car> cars = carServiceImpl.queryNew();
        return cars;
    }

    @RequestMapping("allLicense")
    public Object allLicense(){
        List<Firelicense> firelicenses = firelicenseServiceImpl.queryAll();
        List<Adminlicense> adminlicenses = adminlicenseServiceImpl.queryAll();
        List<Object> allLicense = new ArrayList<>();
        allLicense.addAll(firelicenses);
        allLicense.addAll(adminlicenses);
        return allLicense;
    }
    @RequestMapping("changeStatus")
    public int changeStatus(int id){
        Car car = carServiceImpl.queryById(id);
        car.setCarLicenseplatestatus(1);
        int code = 0;
        if (car.getCarCategory().equals("消防车")){
            Firelicense firelicense = firelicenseServiceImpl.queryOne();
            car.setCarLicenseplate(firelicense.getFirelicenseNumber());
            carServiceImpl.update(car);
            firelicenseServiceImpl.delete(firelicense.getFirelicenseId());
            code = 1;
        }else {
            Adminlicense adminlicense = adminlicenseServiceImpl.queryOne();
            car.setCarLicenseplate(adminlicense.getAdminlicenseNumber());
            carServiceImpl.update(car);
            adminlicenseServiceImpl.delete(adminlicense.getAdminlicenseId());
            code = 1;
        }
        return code;
    }


}
