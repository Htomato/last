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
        car.setReview(0);
        car.setCarReview(0);
        int add = carServiceImpl.add(car);
        return add;
    }
    @RequestMapping("new")
    public Object newCar(){
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

    /**
     * 给新增的车辆上车牌
     * @param id 新增车辆 id
     * @return 更改的结果码 1成功 0 失败
     */
    @RequestMapping("changeStatus")
    public int changeStatus(int id){
        Car car = carServiceImpl.queryById(id);
//        修改车牌状态为正常状态1
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

    @RequestMapping("changeLicense")
    public int changeLicense(int id){
        int update = 0;
        Car car = carServiceImpl.queryById(id);
//        修改更改过车牌的车辆的车牌状态为2
        car.setCarLicenseplatestatus(2);
        car.setCarLicenseplateold(car.getCarLicenseplate());
        if (car.getCarCategory().equals("消防车")){
//            获取新车牌
            Firelicense newFirelicense = firelicenseServiceImpl.queryOne();
//            旧车牌加入到车牌库中
            Firelicense oldFirelicense = new Firelicense();
            oldFirelicense.setFirelicenseNumber(car.getCarCategory());
            firelicenseServiceImpl.add(oldFirelicense);
            //        新车牌赋值
            car.setCarLicenseplate(newFirelicense.getFirelicenseNumber());
//          使用的新车牌从库中删除
            firelicenseServiceImpl.delete(newFirelicense.getFirelicenseId());
            update = carServiceImpl.update(car);
        } else {
            Adminlicense newAdminlicense = adminlicenseServiceImpl.queryOne();
            Adminlicense oldAdminlicense = new Adminlicense();
            oldAdminlicense.setAdminlicenseNumber(car.getCarCategory());
            adminlicenseServiceImpl.add(oldAdminlicense);
            car.setCarLicenseplate(newAdminlicense.getAdminlicenseNumber());
            adminlicenseServiceImpl.delete(newAdminlicense.getAdminlicenseId());
            update = carServiceImpl.update(car);
        }
        return update;

    }

    /**
     * 查询更改过车牌号的车辆
     * @return
     */
    @RequestMapping("changeCarList")
    public Object changeCarList(){
        List<Car> cars = carServiceImpl.queryChanged();
        return cars;
    }

    /**
     * 查询未经车辆年审的车辆
     * @return
     */
    @RequestMapping("revCar")
    public Object revCar(){
        List<Car> cars = carServiceImpl.queryCarReview();
        return cars;
    }
    @RequestMapping("changeRevCar")
    public int changeRevCar(int id){
        return carServiceImpl.changeCarReview(id);
    }

    /**
     * 查询未经主管单位年审的车辆
     * @return
     */
    @RequestMapping("headRev")
    public Object headRev(){
        List<Car> cars = carServiceImpl.queryReview();
        return cars;
    }
    @RequestMapping("changeHeadRev")
    public int changeHeadRev(int id){
        return carServiceImpl.changeReview(id);
    }

    @RequestMapping("selectorFire")
    public List<Car> selectorFire(String carLicenseplate,String headName){
        return carServiceImpl.selectorFire(carLicenseplate,headName);
    }
    @RequestMapping("selectorAdmin")
    public List<Car> selectorAdmin(String carLicenseplate,String headName){
        return carServiceImpl.selectorAdmin(carLicenseplate,headName);
    }
    @RequestMapping("selectorChePai")
    public List<Car> selectorChePai(String carBrand,String carCompany){
        return carServiceImpl.selectorChePai(carBrand,carCompany);
    }
    @RequestMapping("selectorChFile")
    public List<Car> selectorChFile(String carLicenseplateold,String carLicenseplate,String headName){
        return carServiceImpl.selectorChFile(carLicenseplateold,carLicenseplate,headName);
    }

    @RequestMapping("selectorCarReview")
    public List<Car> selectorCarReview(String carLicenseplate,String carCompany,String headName){
        return carServiceImpl.selectorCarReview(carLicenseplate,carCompany,headName);
    }

    @RequestMapping("selectorReview")
    public List<Car> selectorReview(String carLicenseplate,String carCompany,String headName){
        return carServiceImpl.selectorReview(carLicenseplate,carCompany,headName);
    }







}
