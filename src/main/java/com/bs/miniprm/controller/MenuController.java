package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Menu;
import com.bs.miniprm.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李宇超
 */
@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuServiceImpl menuServiceImpl;


    @RequestMapping("allMenu")
    public Object all(){
        List<Menu> menus = menuServiceImpl.queryAllMenu();
        return menus;
    }
}
