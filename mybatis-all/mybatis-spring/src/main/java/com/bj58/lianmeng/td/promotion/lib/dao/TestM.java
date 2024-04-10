package com.bj58.lianmeng.td.promotion.lib.dao;

import com.bj58.lianmeng.td.promotion.lib.dao.mapper.TaskMapper;
import com.bj58.lianmeng.td.promotion.lib.dao.model.TaskModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis-demo.xml")
public class TestM {

    @Resource
    TaskMapper taskMapper;

    @Test
    public void testQ(){
        TaskModel taskModel = taskMapper.selectByPrimaryKey(1);
        System.out.println(taskModel);
    }



}
