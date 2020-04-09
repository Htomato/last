package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Adminlicense;

import java.util.List;

public interface AdminlicenseService {
    /**
     * 查询所有的行政车辆车牌
     * @return 行政车牌的队列
     */
    List<Adminlicense> queryAll();
    /**
     *
     * 查询一个车牌
     * @return 车牌对象
     */
    Adminlicense queryOne();

    /**
     * 车牌申请通过后，车牌从车牌库中删除
     * @param id
     * @return 删除结果码
     */
    int delete(int id);

    /**
     * 更换的车牌回收到车牌库中
     * @param adminlicense 车牌
     * @return 添加结果码
     */
    int add(Adminlicense adminlicense);
}
