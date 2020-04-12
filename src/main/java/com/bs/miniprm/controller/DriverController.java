package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Driver;
import com.bs.miniprm.service.impl.DriverServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author 李宇超
 */
@RestController
@RequestMapping("driver")
public class DriverController {

    @Autowired
    private DriverServiceImpl driverServiceImpl;


    @RequestMapping("all")
    public Object allDivers(){
        List<Driver> drivers = driverServiceImpl.allDrivers();
        return drivers;
    }

    @RequestMapping("apply")
    public Object apply(){
        List<Driver> apply = driverServiceImpl.apply();
        return apply;
    }
    @RequestMapping("changeApply")
    public int changeApply(int id){
        Driver driver = driverServiceImpl.queryById(id);
        driver.setLicenseStatus(1);

        driver.setDriverFirstdate(new Date());
        Date lastDate = new Date();
        lastDate.setYear(lastDate.getYear()+2);
        driver.setDriverLastdate(lastDate);
        driver.setLicenseScore(12);
        driver.setLicenseNumber("430101753216");
        return driverServiceImpl.update(driver);
    }

}
