package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.TrmanMapper;
import com.bs.miniprm.pojo.Trman;
import com.bs.miniprm.service.TrmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrmanServiceImpl implements TrmanService {
    @Autowired
    private TrmanMapper trmanMapper;

    @Override
    public List<Trman> queryAllTrMan() {
        return trmanMapper.selectAll();
    }

    @Override
    public List<Trman> selector(Integer number, String name) {
        if (number != null){
            List<Trman> trmanList = new ArrayList<>();
            Trman trman = trmanMapper.selectByPrimaryKey(number);
            trmanList.add(trman);
            return trmanList;
        }else {
            Example trmanExample = new Example(Trman.class);
            trmanExample.createCriteria().andEqualTo("trmanName",name);
            return trmanMapper.selectByExample(trmanExample);
        }
    }
}
