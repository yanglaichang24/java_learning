package com.bj58.lianmeng.td.promotion.lib.dao;

import com.bj58.lianmeng.td.promotion.lib.dao.mapper.TaskMapper;
import com.bj58.lianmeng.td.promotion.lib.dao.mapper.TaskService;
import com.bj58.lianmeng.td.promotion.lib.dao.model.TaskModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis-demo-tx.xml")
public class TestT {

    @Resource
    TaskService taskService;

    @Test
    public void testT(){
        TaskModel taskModel = taskService.selectByPrimaryKey(1);
        System.out.println(taskModel);
    }



}
