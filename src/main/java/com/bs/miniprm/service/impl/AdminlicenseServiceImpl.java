package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.AdminlicenseMapper;
import com.bs.miniprm.pojo.Adminlicense;
import com.bs.miniprm.service.AdminlicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李宇超
 */
@Service
public class AdminlicenseServiceImpl implements AdminlicenseService {
    @Autowired
    private AdminlicenseMapper adminlicenseMapper;


    @Override
    public List<Adminlicense> queryAll() {
        return adminlicenseMapper.selectAll();
    }

    @Override
    public Adminlicense queryOne() {
        List<Adminlicense> adminlicenses = adminlicenseMapper.selectAll();
        return adminlicenses.get(0);
    }

    @Override
    public int delete(int id) {
        return adminlicenseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(Adminlicense adminlicense) {
        return adminlicenseMapper.insert(adminlicense);
    }
}
