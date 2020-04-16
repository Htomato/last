package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.OutcarMapper;
import com.bs.miniprm.pojo.Outcar;
import com.bs.miniprm.service.OutcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class OutcarServiceImpl implements OutcarService {

    @Autowired
    private OutcarMapper outcarMapper;


    @Override
    public List<Outcar> queryAll() {
        return outcarMapper.selectAll();
    }

    @Override
    public List<Outcar> queryIn() {
        Example inExample = new Example(Outcar.class);
        inExample.createCriteria().andEqualTo("outcarStatus",1);
        return outcarMapper.selectByExample(inExample);
    }

    @Override
    public int add(Outcar outcar) {
        int insert = outcarMapper.insert(outcar);
        return insert;
    }
}
