package yang.mybatis;


import com.yang.dao.mapper.TaskMapper;
import com.yang.dao.model.TaskModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Mr.Yang
 * @desc MybatisMain
 * @date 2023/4/24 17:46
 */
public class MybatisMain {


    @Test
    public void select(){
        try {
            //1,加载mybatis核心配置文件SqlMapperConfig.xml
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
            //2,创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //3,创建SessionFactory
            SqlSession session = sqlSessionFactory.openSession();

            String statement = "com.yang.dao.mapper.TaskMapper.selectByPrimaryKey";
            List<TaskModel> objects = session.selectList(statement,1);
            for (TaskModel user : objects) {
                System.out.println(user);
            }
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test_cache_1(){
        try {
            //1,加载mybatis核心配置文件SqlMapperConfig.xml
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
            //2,创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //3,创建SessionFactory
            SqlSession session = sqlSessionFactory.openSession();
            String statement = "com.bj58.lianmeng.td.promotion.lib.dao.mapper.TaskMapper.selectByPrimaryKey";
            List<TaskModel> objects = session.selectList(statement,1);
            for (TaskModel user : objects) {
                System.out.println(user);
            }

            List<TaskModel> objects2 = session.selectList(statement,1);
            for (TaskModel user : objects2) {
                System.out.println(user);
            }

            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void test_cache_2(){
        try {
            //1,加载mybatis核心配置文件SqlMapperConfig.xml
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig-cache.xml");
            //2,创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //3,创建SessionFactory
            SqlSession session = sqlSessionFactory.openSession();
            String statement = "com.bj58.lianmeng.td.promotion.lib.dao.mapper.TaskMapper.selectByPrimaryKey";
            List<TaskModel> objects = session.selectList(statement,1);
            for (TaskModel user : objects) {
                System.out.println(user);
            }

            session.commit();
            session.close();

            //3,创建SessionFactory
            SqlSession session2 = sqlSessionFactory.openSession();
            List<TaskModel> objects2 = session2.selectList(statement,1);
            for (TaskModel user : objects2) {
                System.out.println(user);
            }

            session2.commit();
            session2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void test_cache_2_1(){
        try {
            //1,加载mybatis核心配置文件SqlMapperConfig.xml
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig-cache.xml");
            //2,创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //3,创建SessionFactory
            SqlSession session = sqlSessionFactory.openSession();
            TaskMapper mapper = session.getMapper(TaskMapper.class);
            TaskModel taskModel = mapper.selectByPrimaryKey(1);
            System.out.println(taskModel);

            session.commit();
            session.close();

            //3,创建SessionFactory
            SqlSession session2 = sqlSessionFactory.openSession();
            TaskMapper mapper2 = session2.getMapper(TaskMapper.class);
            TaskModel taskModel2 = mapper2.selectByPrimaryKey(1);
            System.out.println(taskModel2);

            session2.commit();
            session2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
