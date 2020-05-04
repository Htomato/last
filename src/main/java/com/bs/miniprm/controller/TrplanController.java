package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Trplan;
import com.bs.miniprm.pojo.Worker;
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
        return trplans;
    }
    @RequestMapping("add")
    public int addTrainingPlan(String data){
        JSONObject traPlanJSON = (JSONObject) JSON.parse(data);
        Trplan trplan = traPlanJSON.toJavaObject(Trplan.class);
        int add = trplanServiceImpl.add(trplan);
        return add;
    }
    @RequestMapping("selector")
    public List<Trplan> select(Integer number,String name, String trplantype){
        System.out.println("number = " + number);
        System.out.println("name = " + name);
        System.out.println("trplantype = " + trplantype);
        return trplanServiceImpl.selector(number,name,trplantype);
    }

    @RequestMapping("delete")
    public int delete(int id){
        return trplanServiceImpl.delete(id);
    }



}
