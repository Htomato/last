package com.bs.miniprm.controller;

import com.bs.miniprm.pojo.Eqexpert;
import com.bs.miniprm.service.impl.EqexpertServiceImpl;
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
    private EqexpertServiceImpl eqexpertServiceImpl;


    @RequestMapping("allEqExpert")
    public Object all(){
        List<Eqexpert> eqexperts = eqexpertServiceImpl.queryAllEqExpert();
        System.out.println("hello allEqExpert");
        return eqexperts;
    }

    /**
     *
     * @return 今年审核状态为0的装备专家
     */
    @RequestMapping("review")
    public Object review(){
        List<Eqexpert> eqexperts = eqexpertServiceImpl.queryUnReview();
        return eqexperts;
    }

    /**
     *
     * @param id
     * @return 返回修改状态
     */
    @RequestMapping("changeStatus")
    public int changeStatus(int id) {
        Eqexpert eqexpert = eqexpertServiceImpl.selectById(id);
        System.out.println("eqexpert = " + eqexpert);
        eqexpert.setEqexpertLast(1);
        int update = eqexpertServiceImpl.update(eqexpert);
        System.out.println("update = " + update);
        return update;
    }

}
