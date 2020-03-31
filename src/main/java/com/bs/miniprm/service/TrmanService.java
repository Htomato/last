package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Trman;

import java.util.List;

/**
 * @author 李宇超
 */
public interface TrmanService {
    /**
     * 查询所有的培训方案
     * @return 培训方案对象放入List
     */
    List<Trman> queryAllTrMan();
}
