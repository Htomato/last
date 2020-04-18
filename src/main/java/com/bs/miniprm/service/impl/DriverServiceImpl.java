package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.DriverMapper;
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

    @Override
    public List<Driver> normal() {
        Example driverExample = new Example(Driver.class);
        driverExample.createCriteria().andEqualTo("licenseStatus",1);
        List<Driver> drivers = driverMapper.selectByExample(driverExample);
        return drivers;
    }

    @Override
    public List<Driver> vioRecord() {
        Example driverExample = new Example(Driver.class);
        driverExample.createCriteria().andLessThan("licenseScore",12);
        List<Driver> drivers = driverMapper.selectByExample(driverExample);
        return drivers;
    }

    /**
     * 添加驾驶员
     *
     * @param driver
     * @return
     */
    @Override
    public int add(Driver driver) {
        return driverMapper.insertSelective(driver);
    }

    /**
     * 人员信息条件查询
     *
     * @param driverName
     * @param licenseType
     * @param driverCompany
     * @return
     */
    @Override
    public List<Driver> selectorPerson(String driverName, String licenseType, String driverCompany) {
        Example driverExample = new Example(Driver.class);
        Example.Criteria driverExampleCriteria = driverExample.createCriteria();
        if (!"".equals(driverName)){

            driverExampleCriteria.andEqualTo("driverName",driverName);

        }else if (!"".equals(licenseType) && !"".equals(driverCompany)){

            driverExampleCriteria.andEqualTo("licenseType",licenseType)
                                .andEqualTo("driverCompany",driverCompany);

        }else if (!"".equals(licenseType)){
            driverExampleCriteria.andEqualTo("licenseType",licenseType);
        }else {
            driverExampleCriteria.andEqualTo("driverCompany",driverCompany);
        }
        return driverMapper.selectByExample(driverExample);
    }

    /**
     * 驾照申请条件查询
     * @description:
     * @param driverName
     * @param licenseType
     * @param driverCompany
     * @return
     */
    @Override
    public List<Driver> selectorAppli(String driverName, String licenseType, String driverCompany) {
        Example driverExample = new Example(Driver.class);
        Example.Criteria driverExampleCriteria = driverExample.createCriteria();
        driverExampleCriteria.andEqualTo("licenseStatus",0);
        if (!"".equals(driverName)){

            driverExampleCriteria.andEqualTo("driverName",driverName);

        }else if (!"".equals(licenseType) && !"".equals(driverCompany)){

            driverExampleCriteria.andEqualTo("licenseType",licenseType)
                    .andEqualTo("driverCompany",driverCompany);

        }else if (!"".equals(licenseType)){
            driverExampleCriteria.andEqualTo("licenseType",licenseType);
        }else {
            driverExampleCriteria.andEqualTo("driverCompany",driverCompany);
        }
        return driverMapper.selectByExample(driverExample);
    }

    /**
     * 驾照档案申请条件查询
     *
     * @param licenseNumber
     * @param driverName
     * @param driverCompany
     * @return
     */
    @Override
    public List<Driver> selectorFileAppli(String licenseNumber, String driverName, String driverCompany) {
        Example driverExample = new Example(Driver.class);
        Example.Criteria driverExampleCriteria = driverExample.createCriteria();
        if (!"".equals(licenseNumber)){

            driverExampleCriteria.andEqualTo("licenseNumber",licenseNumber);

        }else if (!"".equals(driverName) && !"".equals(driverCompany)){

            driverExampleCriteria.andEqualTo("driverName",driverName)
                    .andEqualTo("driverCompany",driverCompany);

        }else if (!"".equals(driverName)){
            driverExampleCriteria.andEqualTo("driverName",driverName);
        }else {
            driverExampleCriteria.andEqualTo("driverCompany",driverCompany);
        }
        return driverMapper.selectByExample(driverExample);
    }

    /**
     * 驾驶员年审条件查询
     *
     * @param driverName
     * @param driverCompany
     * @return
     */
    @Override
    public List<Driver> selectorReview(String driverName, String driverCompany) {
        Example driverExample = new Example(Driver.class);
        Example.Criteria driverExampleCriteria = driverExample.createCriteria();
        driverExampleCriteria.andEqualTo("licenseStatus",1);
        if (!"".equals(driverName)){
            driverExampleCriteria.andEqualTo("driverName",driverName);
        }else {
            driverExampleCriteria.andEqualTo("driverCompany",driverCompany);
        }
        return driverMapper.selectByExample(driverExample);
    }

    /**
     * 违章记录条件查询
     *
     * @param driverName
     * @param licenseType
     * @param driverCompany
     * @return
     */
    @Override
    public List<Driver> selectorVio(String driverName, String licenseType, String driverCompany) {
        Example driverExample = new Example(Driver.class);
        Example.Criteria driverExampleCriteria = driverExample.createCriteria();
        driverExampleCriteria.andLessThan("licenseScore",12);
        if (!"".equals(driverName)){

            driverExampleCriteria.andEqualTo("driverName",driverName);

        }else if (!"".equals(licenseType) && !"".equals(driverCompany)){

            driverExampleCriteria.andEqualTo("licenseType",licenseType)
                    .andEqualTo("driverCompany",driverCompany);

        }else if (!"".equals(licenseType)){
            driverExampleCriteria.andEqualTo("licenseType",licenseType);
        }else {
            driverExampleCriteria.andEqualTo("driverCompany",driverCompany);
        }
        return driverMapper.selectByExample(driverExample);
    }

    /**
     * 查询下级上报驾驶员：①下级单位 ② 新添加驾驶员
     *
     * @return
     */
    @Override
    public List<Driver> under() {
        Example driverExample = new Example(Driver.class);
        Example.Criteria driverExampleCriteria = driverExample.createCriteria();
        driverExampleCriteria.andEqualTo("licenseStatus",0)
                .andNotEqualTo("driverCompany","消防总队");
        List<Driver> driverList = driverMapper.selectByExample(driverExample);
        return driverList;
    }

    /**
     * 下级上报申请 条件查询
     *
     * @param licenseType
     * @param driverCompany
     * @return
     */
    @Override
    public List<Driver> selectorUnder(String licenseType, String driverCompany) {
        Example driverExample = new Example(Driver.class);
        Example.Criteria driverExampleCriteria = driverExample.createCriteria();
        driverExampleCriteria.andEqualTo("licenseStatus",0)
                .andNotEqualTo("driverCompany","消防总队");
        if (!"".equals(licenseType)){
            driverExampleCriteria.andEqualTo("licenseType",licenseType);
        }else {
            driverExampleCriteria.andEqualTo("driverCompany",driverCompany);
        }
        return driverMapper.selectByExample(driverExample);
    }
}
