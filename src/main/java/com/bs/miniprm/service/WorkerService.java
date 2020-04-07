package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Worker;

import java.util.List;

public interface WorkerService {
    /**
     *
     * @description:  查询所有的质检员，以列表list的形式返回
     *
     */
    List<Worker> queryAllInspectors();

    /**
     * @description: 查询所有的装备技师，以列表list的形式返回
     *
     */
    List<Worker> queryAllEqtech();

}
