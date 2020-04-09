package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.FirelicenseMapper;
import com.bs.miniprm.pojo.Firelicense;
import com.bs.miniprm.service.FirelicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李宇超
 */
@Service
public class FirelicenseServiceImpl implements FirelicenseService {
    @Autowired
    private FirelicenseMapper firelicenseMapper;


    @Override
    public List<Firelicense> queryAll() {
        return firelicenseMapper.selectAll();
    }

    @Override
    public Firelicense queryOne() {
        List<Firelicense> firelicenses = firelicenseMapper.selectAll();
        return firelicenses.get(0);
    }

    @Override
    public int delete(int id) {
        return firelicenseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(Firelicense firelicense) {
        return firelicenseMapper.insert(firelicense);
    }
}
