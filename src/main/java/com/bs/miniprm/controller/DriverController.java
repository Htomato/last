package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Driver;
import com.bs.miniprm.pojo.License;
import com.bs.miniprm.service.impl.DriverServiceImpl;

import com.bs.miniprm.service.impl.LicenseServiceImpl;
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
    @Autowired
    private LicenseServiceImpl licenseServiceImpl;


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
        License license = licenseServiceImpl.queryOne();
        driver.setLicenseNumber(license.getLicenseNumber().toString());
        licenseServiceImpl.delete(license);
        return driverServiceImpl.update(driver);
    }

    @RequestMapping("normal")
    public Object normal(){
        List<Driver> normal = driverServiceImpl.normal();
        return normal;
    }

    @RequestMapping("detail")
    public Object detail(int id){
        Driver driver = driverServiceImpl.queryById(id);
        return driver;
    }

    @RequestMapping("vioRecord")
    public Object vioRecord(){
        List<Driver> drivers = driverServiceImpl.vioRecord();
        return drivers;
    }
}
