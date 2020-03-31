package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Eqexpert;
import com.bs.miniprm.pojo.Trman;
import com.bs.miniprm.service.impl.EqexpertServiceImp;
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
@RequestMapping("eqExpert")
public class EqexpertController {

    @Autowired
    private EqexpertServiceImp eqexpertServiceImp;


    @RequestMapping("allEqExpert")
    public Object all(){
        List<Eqexpert> eqexperts = eqexpertServiceImp.queryAllEqExpert();
        System.out.println("hello allEqExpert");
        return eqexperts;
    }

    /**
     *
     * @return 今年审核状态为0的装备专家
     */
    @RequestMapping("review")
    public Object review(){
        List<Eqexpert> eqexperts = eqexpertServiceImp.queryUnReview();
        return eqexperts;
    }

}
