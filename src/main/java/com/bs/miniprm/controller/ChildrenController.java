package com.bs.miniprm.controller;

import com.bs.miniprm.mapper.ChildrenMapper;
import com.bs.miniprm.pojo.Children;
import com.bs.miniprm.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("children")
public class ChildrenController {

    @Autowired
    private ChildrenService childrenService;

    @RequestMapping("all")
    public Object all(){
        List<Children> allChildren = childrenService.queryAllChildren();
        return allChildren;
    }
}
