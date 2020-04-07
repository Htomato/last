package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.WorkerMapper;
import com.bs.miniprm.pojo.Worker;
import com.bs.miniprm.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author 李宇超
 */
@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerMapper workerMapper;


    @Override
    public List<Worker> queryAllInspectors() {
        Example InspectorsExample = new Example(Worker.class);
        InspectorsExample.createCriteria().andEqualTo("workerJob","质检员");
        return workerMapper.selectByExample(InspectorsExample);
    }

    @Override
    public List<Worker> queryAllEqtech() {
        Example EqtechExample = new Example(Worker.class);
        EqtechExample.createCriteria().andEqualTo("workerJob","装备技师");
        return workerMapper.selectByExample(EqtechExample);
    }
}
