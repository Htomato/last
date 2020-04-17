package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.WorkerMapper;
import com.bs.miniprm.pojo.Worker;
import com.bs.miniprm.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
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

    @Override
    public int update(Worker worker) {
        return workerMapper.updateByPrimaryKeySelective(worker);
    }

    @Override
    public List<Worker> selectEqTech(Integer number, String name) {
        if (number != null){
            List<Worker> workerList = new ArrayList<>();
            Worker worker = workerMapper.selectByPrimaryKey(number);
            if (worker==null){
                return null;
            }
           if ("装备技师".equals(worker.getWorkerJob())){
               workerList.add(worker);
           }
            return workerList;
        }else {
            Example workerExample = new Example(Worker.class);
            workerExample.createCriteria().andEqualTo("workerName",name).andEqualTo("workerJob","质检员");
            return workerMapper.selectByExample(workerExample);
        }
    }

    @Override
    public List<Worker> selectIns(Integer number, String name) {
        if (number != null){
            List<Worker> workerList = new ArrayList<>();
            Worker worker = workerMapper.selectByPrimaryKey(number);
            if (worker == null){
                return null;
            }
            if ("质检员".equals(worker.getWorkerJob())){
                workerList.add(worker);
            }
            return workerList;
        }else {
            Example workerExample = new Example(Worker.class);
            workerExample.createCriteria().andEqualTo("workerName",name).andEqualTo("workerJob","装备技师");
            return workerMapper.selectByExample(workerExample);
        }
    }

    @Override
    public int add(Worker worker) {
        return workerMapper.insert(worker);
    }

    @Override
    public int delete(int id) {
        return workerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Worker queryById(int id) {
        return workerMapper.selectByPrimaryKey(id);
    }
}
