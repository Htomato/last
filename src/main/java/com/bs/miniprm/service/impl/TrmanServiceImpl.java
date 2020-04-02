package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.TrmanMapper;
import com.bs.miniprm.pojo.Trman;
import com.bs.miniprm.service.TrmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrmanServiceImpl implements TrmanService {
    @Autowired
    private TrmanMapper trmanMapper;

    @Override
    public List<Trman> queryAllTrMan() {
        return trmanMapper.selectAll();
    }
}
