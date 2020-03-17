package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.MenuMapper;
import com.bs.miniprm.pojo.Menu;
import com.bs.miniprm.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImp implements MenuService {

    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> queryAllMenu() {
        return menuMapper.selectAll();
    }
}
