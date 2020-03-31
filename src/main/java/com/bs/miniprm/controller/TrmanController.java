package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Trman;
import com.bs.miniprm.service.impl.TrmanServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李宇超
 * @date 2020年3月25日
 */
@RestController
@RequestMapping("trman")
public class TrmanController {

    @Autowired
    private TrmanServiceImp trmanServiceImp;


    @RequestMapping("allTrman")
    public Object all(){
        List<Trman> trmen = trmanServiceImp.queryAllTrMan();
        System.out.println("hello allTrplan");
        return trmen;
    }

}
