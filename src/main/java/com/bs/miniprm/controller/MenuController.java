package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Children;
import com.bs.miniprm.pojo.Menu;
import com.bs.miniprm.service.ChildrenService;
import com.bs.miniprm.service.MenuService;
import com.bs.miniprm.service.impl.MenuServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuServiceImp menuServiceImp;


    @RequestMapping("allMenu")
    public Object all(){
        List<Menu> menus = menuServiceImp.queryAllMenu();
        System.out.println(menus);
        return menus;
    }
}
