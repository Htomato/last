package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.TrplanMapper;
import com.bs.miniprm.pojo.Trplan;
import com.bs.miniprm.service.TrplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
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

    @Override
    public int add(Trplan trplan) {
        return trplanMapper.insert(trplan);
    }

    @Override
    public List<Trplan> selector(Integer number, String name, String trplantype) {
       if (number != null){
           List<Trplan> trplanList = new ArrayList<>();
           trplanList.add(trplanMapper.selectByPrimaryKey(number));
           return trplanList;
       }else if (name != "" && trplantype != ""){
           Example trplanExample = new Example(Trplan.class);
           trplanExample.createCriteria().andEqualTo("trorg",name).andEqualTo("trplantype",trplantype);
           return trplanMapper.selectByExample(trplanExample);
       } else if (name != "") {
           Example trplanExample = new Example(Trplan.class);
           trplanExample.createCriteria().andEqualTo("trorg",name);
           return trplanMapper.selectByExample(trplanExample);
       }else {
           Example trplanExample = new Example(Trplan.class);
           trplanExample.createCriteria().andEqualTo("trplantype",trplantype);
           return trplanMapper.selectByExample(trplanExample);
       }
    }
}
