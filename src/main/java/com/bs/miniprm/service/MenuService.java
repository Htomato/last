package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Menu;

import java.util.List;

public interface MenuService {
    /**
     *
     * @Description: 查询所有的服务页对象，以列表list的形式返回
     *
     */
    List<Menu> queryAllMenu();
}
