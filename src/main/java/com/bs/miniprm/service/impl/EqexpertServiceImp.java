package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.EqexpertMapper;
import com.bs.miniprm.pojo.Eqexpert;
import com.bs.miniprm.service.EqexpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class EqexpertServiceImp implements EqexpertService {
    @Autowired
    private EqexpertMapper eqexpertMapper;

    @Override
    public List<Eqexpert> queryAllEqExpert() {
        return eqexpertMapper.selectAll();
    }
    /**
     * 查询今年未通过审核的装备专家
     */
    @Override
    public List<Eqexpert> queryUnReview() {
        Example eqexpertExample = new Example(Eqexpert.class);
        Example.Criteria criteria = eqexpertExample.createCriteria();
        criteria.andEqualTo("eqexpertLast",0);
        List<Eqexpert> eqexperts = eqexpertMapper.selectByExample(eqexpertExample);
        return eqexperts;
    }

    @Override
    public Eqexpert selectById(int id) {
        Eqexpert eqexpert = eqexpertMapper.selectByPrimaryKey(id);
        return eqexpert;
    }

    @Override
    public int update(Eqexpert eqexpert) {
        return eqexpertMapper.updateByPrimaryKeySelective(eqexpert);
    }


}
