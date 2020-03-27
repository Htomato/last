package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Trplan;

import java.util.List;

public interface TrplanService {
    /**
     * 查询所有的培训方案
     * @return 培训方案对象放入List
     */
    List<Trplan> queryAllTrplan();
}
