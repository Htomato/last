package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.DriverMapper;
import com.bs.miniprm.mapper.MenuMapper;
import com.bs.miniprm.pojo.Driver;
import com.bs.miniprm.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverMapper driverMapper;


    @Override
    public List<Driver> allDrivers() {
        List<Driver> drivers = driverMapper.selectAll();
        return drivers;
    }

    @Override
    public Driver queryById(int id) {
        Driver driver = driverMapper.selectByPrimaryKey(id);
        return driver;
    }

    @Override
    public int update(Driver driver) {
        return driverMapper.updateByPrimaryKeySelective(driver);
    }

    @Override
    public List<Driver> apply() {
        Example driverExample = new Example(Driver.class);
        driverExample.createCriteria().andEqualTo("licenseStatus",0);
        List<Driver> drivers = driverMapper.selectByExample(driverExample);
        return drivers;
    }

    @Override
    public int changeApply(int id) {
        Driver driver = driverMapper.selectByPrimaryKey(id);
        driver.setLicenseStatus(1);
        return driverMapper.updateByPrimaryKeySelective(driver);
    }

}
