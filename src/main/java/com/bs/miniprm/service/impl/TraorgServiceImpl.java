package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.TraorgMapper;
import com.bs.miniprm.pojo.Traorg;
import com.bs.miniprm.service.TraorgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李宇超
 */
@Service
public class TraorgServiceImpl implements TraorgService {
    @Autowired
    private TraorgMapper traorgMapper;

    @Override
    public List<Traorg> queryAll() {
        return traorgMapper.selectAll();
    }

    @Override
    public List<Traorg> queryUnReview() {
        Example traorgExample = new Example(Traorg.class);
        traorgExample.createCriteria().andNotEqualTo("traorgStatus", 1);
        return traorgMapper.selectByExample(traorgExample);
    }


    @Override
    public Traorg selectById(int id) {
        return traorgMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Traorg traorg) {
        return traorgMapper.updateByPrimaryKeySelective(traorg);
    }

    @Override
    public List<Traorg> selector(Integer number, String name) {
        if (number != null){
            List<Traorg> traorgList = new ArrayList<>();
            Traorg traorg = traorgMapper.selectByPrimaryKey(number);
            traorgList.add(traorg);
            return traorgList;
        }else {
            Example traorgExample = new Example(Traorg.class);
            traorgExample.createCriteria().andEqualTo("traorgName",name);
            return traorgMapper.selectByExample(traorgExample);
        }
    }

    @Override
    public List<Traorg> selectorUnReview(Integer number, String name) {
        if (number != null){
            List<Traorg> traorgList = new ArrayList<>();
            Traorg traorg = traorgMapper.selectByPrimaryKey(number);
            if (traorg.getTraorgStatus() != 1){
                traorgList.add(traorg);
            }
            return traorgList;
        }else {
            Example traorgExample = new Example(Traorg.class);
            traorgExample.createCriteria().andEqualTo("traorgName",name).andNotEqualTo("traorgStatus",1);
            return traorgMapper.selectByExample(traorgExample);
        }
    }

    @Override
    public int add(Traorg traorg) {
        return traorgMapper.insert(traorg);
    }

}
