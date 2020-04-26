package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Menu;
import com.bs.miniprm.pojo.Worker;
import com.bs.miniprm.service.impl.MenuServiceImpl;
import com.bs.miniprm.service.impl.WorkerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李宇超
 */
@RestController
@RequestMapping("worker")
public class WorkerController {

    @Autowired
    private WorkerServiceImpl workerServiceImpl;


    @RequestMapping("allInspectors")
    public Object all(){
        List<Worker> inspectors = workerServiceImpl.queryAllInspectors();
        return inspectors;
    }

    @RequestMapping("allEqTech")
    public Object allEqtech(){
        List<Worker> eqtech = workerServiceImpl.queryAllEqtech();
        return eqtech;
    }

    @RequestMapping("selectorEqTech")
    public List<Worker> selectEqTech(Integer number,String name){
        List<Worker> eqTechs = workerServiceImpl.selectEqTech(number, name);
        return eqTechs;
    }

    @RequestMapping("selectorIns")
    public List<Worker> selectIns(Integer number,String name){
        List<Worker> inspectors = workerServiceImpl.selectIns(number, name);
        return inspectors;
    }

    @RequestMapping("add")
    public int add(String data){
        JSONObject workerJson = (JSONObject)JSON.parse(data);
        Worker worker = workerJson.toJavaObject(Worker.class);
        worker.setWorkerStatus(0);

        return workerServiceImpl.add(worker);
    }
    @RequestMapping("one")
    public Object selectOne(int id){
        return workerServiceImpl.queryById(id);
    }

    @RequestMapping("changeStatus")
    public int changeStatus(int id){
        Worker worker = workerServiceImpl.queryById(id);
        worker.setWorkerStatus(1);
        return workerServiceImpl.update(worker);
    }

    @RequestMapping("delete")
    public int delete(int id){
        return workerServiceImpl.delete(id);
    }

}
