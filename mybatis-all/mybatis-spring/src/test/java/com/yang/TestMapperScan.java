package com.yang;

import com.yang.dao.mapper.TaskMapper;
import com.yang.dao.model.TaskModel;
import com.yang.service.TaskService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestMapperScan.class)
@ComponentScan({"com.yang.conf","com.yang.service"})
@MapperScan("com.yang.dao.")
public class TestMapperScan {

    @Resource
    TaskMapper taskMapper;

    @Test
    public void select(){
        TaskModel taskModel = taskMapper.selectByPrimaryKey(1);
        System.out.println(taskModel);
    }


    /*
    *   @select 将sql 配置在mapper中，不用写xml
    * */
    @Test
    public void testAnno_select() {
        TaskModel taskModel = taskMapper.selectByPrimaryKeyAnno_select(2);
        System.out.println(taskModel);

    }


    @Resource
    TaskService taskService;

    @Test
    public void testTx(){
        TaskModel taskModel = taskService.selectByPrimaryKey(1);
        System.out.println(taskModel);
    }


}
