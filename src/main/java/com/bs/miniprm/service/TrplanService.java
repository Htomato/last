package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Trplan;

import java.util.List;

public interface TrplanService {
    /**
     * 查询所有的培训方案
     * @return 培训方案对象放入List
     */
    List<Trplan> queryAllTrplan();

    /**
     * 添加培训计划
     * @param trplan
     * @return
     */
    int add(Trplan trplan);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 条件查询
     * @param number
     * @param name
     * @param trplantype
     * @return
     */
    List<Trplan> selector(Integer number,String name,String trplantype);



}
