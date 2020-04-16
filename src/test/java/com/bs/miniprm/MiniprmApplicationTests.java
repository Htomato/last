package com.bs.miniprm;

import com.bs.miniprm.mapper.*;
import com.bs.miniprm.pojo.*;
import com.bs.miniprm.service.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class MiniprmApplicationTests {

    @Autowired
    private DriverServiceImpl driverServiceImpl;

    @Autowired
    private ContactsServiceImpl contactsServiceImpl;

    @Test
    public void queryByName() {
       String name = "张三";
        List<Contacts> contacts = contactsServiceImpl.queryByName(name);
        for (Contacts contact : contacts) {
            System.out.println("contact = " + contact);
        }
    }

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
