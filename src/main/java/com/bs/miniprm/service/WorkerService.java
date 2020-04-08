package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Worker;

import java.util.List;

public interface WorkerService {
    /**
     *
     * 查询所有的质检员，以列表list的形式返回
     * @return 质检员列表
     *
     */
    List<Worker> queryAllInspectors();

    /**
     * 查询所有的装备技师，以列表list的形式返回
     * @return 装备技师列表
     */
    List<Worker> queryAllEqtech();

    /**
     * 更新worker的属性值
     * @param worker 更改属性后的worker对象
     * @return 返回更改的结果码
     */
    int update(Worker worker);

}
