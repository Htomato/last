package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.LicenseMapper;
import com.bs.miniprm.pojo.License;
import com.bs.miniprm.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李宇超
 */
@Service
public class LicenseServiceImpl implements LicenseService {

    @Autowired
    private LicenseMapper licenseMapper;



    @Override
    public License queryOne() {
        License license = licenseMapper.selectAll().get(0);
        return license;
    }

    @Override
    public int delete(License license) {
        int delete = licenseMapper.delete(license);
        return delete;
    }
}
