package com.bs.miniprm.controller;

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

}
