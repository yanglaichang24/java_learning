package com.yang;

import com.yang.dao.mapper.TaskMapper;
import com.yang.dao.model.TaskModel;
import com.yang.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis-tx.xml")
public class TestXml {

    @Resource
    TaskMapper taskMapper;

    @Test
    public void testSelect(){
        TaskModel taskModel = taskMapper.selectByPrimaryKey(1);
        System.out.println(taskModel);
    }

    @Resource
    TaskService taskService;

    @Test
    public void testT(){
        TaskModel taskModel = taskService.selectByPrimaryKey(1);
        System.out.println(taskModel);
    }




}
