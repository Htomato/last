package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Eqexpert;

import java.util.List;

/**
 * @author 李宇超
 */
public interface EqexpertService {
    /**
     * 查询所有的装备专家
     * @return 装备专家列表
     */
    List<Eqexpert> queryAllEqExpert();

    /**
     *
     * @return 今年未经过审查的装备专家
     */
    List<Eqexpert> queryUnReview();

    /**
     * 根据id修改装备专家信息
     * @param id 查询对象的id
     * @return 修改状态。1成功 0 失败
     */
    Eqexpert selectById(int id);

    /**
     * 更新eqexpert中有修改的部分，其他不变。
     * @param eqexpert 更新后的对象
     * @return  操作状态。0失败 1成功
     */
    int update(Eqexpert eqexpert);
}
