package com.bs.miniprm.controller;

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

}
