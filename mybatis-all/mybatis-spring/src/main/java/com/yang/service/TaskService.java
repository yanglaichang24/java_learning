package com.yang.service;

import com.yang.dao.mapper.TaskMapper;
import com.yang.dao.model.TaskModel;
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
