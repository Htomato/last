package com.bs.miniprm.service.impl;

import com.bs.miniprm.mapper.ChildrenMapper;
import com.bs.miniprm.pojo.Children;
import com.bs.miniprm.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChildrenServiceImp implements ChildrenService {

    @Autowired
    private ChildrenMapper childrenMapper;

    @Override
    public List<Children> queryAllChildren() {
        return childrenMapper.selectAll();
    }
}
