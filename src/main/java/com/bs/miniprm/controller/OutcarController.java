package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Menu;
import com.bs.miniprm.pojo.Outcar;
import com.bs.miniprm.service.impl.MenuServiceImpl;
import com.bs.miniprm.service.impl.OutcarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author 李宇超
 */
@RestController
@RequestMapping("outcar")
public class OutcarController {

    @Autowired
    private OutcarServiceImpl outcarServiceImpl;


    @RequestMapping("in")
    public Object in(){
        List<Outcar> outcars = outcarServiceImpl.queryIn();
        return outcars;
    }
    @RequestMapping("all")
    public Object all(){
        List<Outcar> outcars = outcarServiceImpl.queryAll();
        return outcars;
    }

    @RequestMapping("add")
    public int add(String data){
        System.out.println("data = " + data);
        JSONObject outcarJson = (JSONObject)JSON.parse(data);
        Outcar outcar = outcarJson.toJavaObject(Outcar.class);
        outcar.setOutcarStatus(1);
        outcar.setOutcarIntime(new Date());
        return outcarServiceImpl.add(outcar);
    }
    @RequestMapping("out")
    public int out(int id){
        return outcarServiceImpl.out(id);
    }
    @RequestMapping("selector")
    public Object selector(String outcarDriver, String outcarLicense){
        return outcarServiceImpl.selector(outcarDriver, outcarLicense);
    }
    @RequestMapping("selectorAll")
    public Object selectorAll(String outcarDriver, String outcarLicense){
        return outcarServiceImpl.selectorAll(outcarDriver, outcarLicense);
    }
}
