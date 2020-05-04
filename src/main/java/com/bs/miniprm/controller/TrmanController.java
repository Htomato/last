package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Trman;
import com.bs.miniprm.service.impl.TrmanServiceImpl;
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
    private TrmanServiceImpl trmanServiceImpl;


    @RequestMapping("allTrman")
    public Object all(){
        List<Trman> trmen = trmanServiceImpl.queryAllTrMan();
        System.out.println("hello allTrplan");
        return trmen;
    }

    @RequestMapping("selector")
    public List<Trman> select(Integer number,String name){
        return trmanServiceImpl.selector(number,name);
    }
    @RequestMapping("add")
    public int add(String data){
        JSONObject trmanJson = (JSONObject) JSON.parse(data);
        Trman trman = trmanJson.toJavaObject(Trman.class);
        System.out.println("driver = " + trman);

        return trmanServiceImpl.add(trman);
    }
    @RequestMapping("delete")
    public int delete(int id){
        return trmanServiceImpl.delete(id);
    }

}
