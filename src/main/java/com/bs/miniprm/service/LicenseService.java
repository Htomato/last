package com.bs.miniprm.service;

import com.bs.miniprm.pojo.License;
import com.bs.miniprm.pojo.Menu;

import java.util.List;

public interface LicenseService {
    /**
     *
     * @Description: 获取一个驾驶员档案编号
     * @return 驾驶员档案编号
     */
    License queryOne();

    /**
     * 删除一个驾驶员档案编号
     * @param license
     * @return
     */
    int delete(License license);
}
