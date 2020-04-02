package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Trplan;
import com.bs.miniprm.service.impl.TrplanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    private TrplanServiceImpl trplanServiceImpl;


    @RequestMapping("allTrplan")
    public Object all(){
        List<Trplan> trplans = trplanServiceImpl.queryAllTrplan();
        System.out.println("hello allTrplan");
        return trplans;
    }

}
