package com.bs.miniprm;

import com.bs.miniprm.mapper.*;
import com.bs.miniprm.pojo.*;
import com.bs.miniprm.service.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class MiniprmApplicationTests {

    @Autowired
    private DriverServiceImpl driverServiceImpl;

    @Test
    public void allDrivers(){
        List<Driver> drivers = driverServiceImpl.allDrivers();
        for (Driver driver : drivers) {
            System.out.println("driver = " + driver);
        }
    }
    @Test
    public void changeApply(){
        Driver driver = driverServiceImpl.queryById(2002);
        driver.setLicenseStatus(1);

        driver.setDriverFirstdate(new Date());
        Date lastDate = new Date();
        lastDate.setYear(lastDate.getYear()+2);
        driver.setDriverLastdate(lastDate);
        driver.setLicenseScore(12);
        driver.setLicenseNumber("430101753216");
        driverServiceImpl.update(driver);
    }

}
