/*
package com.yang.dao;


import com.yang.dao.model.OrderModel;
import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

*/
/**
 * @author Mr.Yang
 * @desc MybatisMain
 * @date 2023/4/24 17:46
 *//*

public class MybatisMain {


    @Test
    public void select(){
        try {

            URL resource = MybatisMain.class.getResource("shardingsphere-mysql.yaml");
            DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(new File(resource.toURI()));

            Environment environment = new Environment("id", new JdbcTransactionFactory(), dataSource);

            Configuration configuration = new Configuration();
            configuration.setEnvironment(environment);

            XMLMapperBuilder xmlMapperBuilder = new XMLMapperBuilder(mapperLocation.getInputStream(),
                    targetConfiguration, mapperLocation.toString(), targetConfiguration.getSqlFragments());
            xmlMapperBuilder.parse();



            DefaultSqlSessionFactory defaultSqlSessionFactory = new DefaultSqlSessionFactory(configuration);
            //3,创建SessionFactory
            SqlSession session = defaultSqlSessionFactory.openSession();

            String statement = "com.yang.dao.mapper.OrderMapper.selectByPrimaryKey";
            List<OrderModel> objects = session.selectList(statement,1);
            for (OrderModel user : objects) {
                System.out.println(user);
            }
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
*/
