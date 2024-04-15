package com.yang;

import com.yang.dao.model.TaskModel;
import com.yang.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestAnnoTX.class)
@EnableTransactionManagement
@ComponentScan({"com.yang.conf","com.yang.service"})
@MapperScan("com.yang.dao.")
public class TestAnnoTX {








}
