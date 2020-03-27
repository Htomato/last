package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Contacts;
import com.bs.miniprm.pojo.Trplan;
import com.bs.miniprm.service.impl.ContactsServiceImp;
import com.bs.miniprm.service.impl.TrplanServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李宇超
 * @date 2020年3月25日
 */
@RestController
@RequestMapping("trplan")
public class TrplanController {

    @Autowired
    private TrplanServiceImp trplanServiceImp;


    @RequestMapping("allTrplan")
    public Object all(){
        List<Trplan> trplans = trplanServiceImp.queryAllTrplan();
        System.out.println("hello allTrplan");
        return trplans;
    }

}
