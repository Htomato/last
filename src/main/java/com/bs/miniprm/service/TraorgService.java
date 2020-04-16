package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Traorg;

import java.util.List;

/**
 * @author 李宇超
 */
public interface TraorgService {
    /**
     * 查询所有的培训机构
     * @return 培训机构列表
     */
    List<Traorg> queryAll();

    /**
     *
     * @return 今年未经过审查的培训机构
     */
    List<Traorg> queryUnReview();

    /**
     * 根据id修改装备专家信息
     * @param id 查询对象的id
     * @return 修改状态。1成功 0 失败
     */
    Traorg selectById(int id);

    /**
     * 更新traorg中有修改的部分，其他不变。
     * @param traorg 更新后的对象
     * @return  操作状态。0失败 1成功
     */
    int update(Traorg traorg);
    /**
     * 条件查询
     * @param number
     * @param name
     * @return
     */
    List<Traorg> selector(Integer number,String name);
    /**
     * 条件查询未审核培训机构
     * @param number
     * @param name
     * @return
     */
    List<Traorg> selectorUnReview(Integer number,String name);

    /**
     * 添加培训机构
     * @param traorg
     * @return
     */
    int add(Traorg traorg);
}
