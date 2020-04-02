package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.TrplanMapper;
import com.bs.miniprm.pojo.Trplan;
import com.bs.miniprm.service.TrplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrplanServiceImpl implements TrplanService {
    @Autowired
    private TrplanMapper trplanMapper;

    @Override
    public List<Trplan> queryAllTrplan() {
        List<Trplan> trplans = trplanMapper.selectAll();
        for (Trplan trplan : trplans) {
            System.out.println("trplan = " + trplan);
        }
        return trplans;
    }
}
