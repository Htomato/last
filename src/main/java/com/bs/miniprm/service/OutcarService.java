package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Outcar;

import java.util.List;

public interface OutcarService {
    /**
     *
     * @Description: 查询所有的外来车辆对象，以列表list的形式返回
     *
     */
    List<Outcar> queryAll();

    /**
     * 查询所有现在在队内的车辆
     * @return
     */
    List<Outcar> queryIn();

    /**
     * 添加外来车辆
     * @param outcar
     * @return
     */
    int add(Outcar outcar);

}
