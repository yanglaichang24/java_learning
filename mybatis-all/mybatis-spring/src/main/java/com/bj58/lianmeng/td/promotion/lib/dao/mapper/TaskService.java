package com.bj58.lianmeng.td.promotion.lib.dao.mapper;


import com.bj58.lianmeng.td.promotion.lib.dao.model.TaskModel;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class TaskService {

    @Resource
    private TaskMapper taskMapper;

    @Transactional
    public TaskModel selectByPrimaryKey(Integer taskId){
        return taskMapper.selectByPrimaryKey(taskId);
    }


}
