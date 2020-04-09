package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Firelicense;

import java.util.List;

public interface FirelicenseService {
    /**
     * 查询所有的消防车辆车牌
     * @return 消防车牌的队列
     */
    List<Firelicense> queryAll();
    /**
     *
     * @description: 查询一个车牌
     * @return 车牌对象
     */
    Firelicense queryOne();

    /**
     * 车牌申请通过后，车牌从车牌库中删除
     * @param id
     * @return 删除结果码
     */
    int delete(int id);

    /**
     * 更换的车牌回收到车牌库中
     * @param firelicense 车牌
     * @return 添加结果码
     */
    int add(Firelicense firelicense);
}
