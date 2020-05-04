package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Traorg;
import com.bs.miniprm.service.impl.TraorgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李宇超
 * @date 2020年4月3日
 */
@RestController
@RequestMapping("traorg")
public class TraorgController {

    @Autowired
    private TraorgServiceImpl traorgServiceImpl;


    @RequestMapping("all")
    public Object all(){
        List<Traorg> Traorgs = traorgServiceImpl.queryAll();
        return Traorgs;
    }

    /**
     *
     * @return 今年审核状态为0的培训机构
     */
    @RequestMapping("review")
    public Object review(){
        List<Traorg> traorgs = traorgServiceImpl.queryUnReview();
        return traorgs;
    }

    /**
     *
     * @param id
     * @return 返回修改状态
     */
    @RequestMapping("changeStatus")
    public int changeStatus(int id) {
        Traorg traorg = traorgServiceImpl.selectById(id);
        traorg.setTraorgStatus(1);
        int update = traorgServiceImpl.update(traorg);
        return update;
    }
    @RequestMapping("selector")
    public List<Traorg> select(Integer number,String name){
        return traorgServiceImpl.selector(number,name);
    }

    @RequestMapping("selectorUnReview")
    public List<Traorg> selectorUnReview(Integer number,String name){
        return traorgServiceImpl.selectorUnReview(number,name);
    }

    @RequestMapping("add")
    public int addTrainingPlan(String data){
        JSONObject traPlanJSON = (JSONObject) JSON.parse(data);
        Traorg traorg = traPlanJSON.toJavaObject(Traorg.class);
        traorg.setTraorgStatus(0);
        int add = traorgServiceImpl.add(traorg);
        return add;
    }
    @RequestMapping("one")
    public Object queryById(int id){
        Traorg traorg = traorgServiceImpl.selectById(id);
        return traorg;
    }

    @RequestMapping("delete")
    public int delete(int id){
        return traorgServiceImpl.delete(id);
    }

}
