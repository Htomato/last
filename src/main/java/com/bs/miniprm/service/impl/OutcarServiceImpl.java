package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.OutcarMapper;
import com.bs.miniprm.pojo.Outcar;
import com.bs.miniprm.service.OutcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
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

    /**
     * 外来车辆出去
     *
     * @param id
     * @return
     */
    @Override
    public int out(int id) {
        Outcar outcar = outcarMapper.selectByPrimaryKey(id);
        outcar.setOutcarStatus(0);
        outcar.setOutcarOuttime(new Date());
        return outcarMapper.updateByPrimaryKeySelective(outcar);
    }

    /**
     * 队内车辆的条件查询
     *
     * @param outcarDriver
     * @param outcarLicense
     * @return
     */
    @Override
    public List<Outcar> selector(String outcarDriver, String outcarLicense) {
        Example outCarExample = new Example(Outcar.class);
        Example.Criteria carExampleCriteria = outCarExample.createCriteria();
        carExampleCriteria.andEqualTo("outcarStatus",1);
        if (!"".equals(outcarDriver)){
            carExampleCriteria.andEqualTo("outcarDriver",outcarDriver);
        }else {
            carExampleCriteria.andEqualTo("outcarLicense",outcarLicense);
        }
        return outcarMapper.selectByExample(outCarExample);
    }
}
