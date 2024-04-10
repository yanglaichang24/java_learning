package com.bj58.lianmeng.td.promotion.lib.dao.mapper;

import com.bj58.lianmeng.td.promotion.lib.dao.model.TaskModel;
import com.bj58.lianmeng.td.promotion.lib.dao.model.TaskModelExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface TaskMapper {
    long countByExample(TaskModelExample example);

    int deleteByExample(TaskModelExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskModel record);

    int insertSelective(TaskModel record);

    List<TaskModel> selectByExampleWithBLOBsWithRowbounds(TaskModelExample example, RowBounds rowBounds);

    List<TaskModel> selectByExampleWithBLOBs(TaskModelExample example);

    List<TaskModel> selectByExampleWithRowbounds(TaskModelExample example, RowBounds rowBounds);

    List<TaskModel> selectByExample(TaskModelExample example);

    TaskModel selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TaskModel record, @Param("example") TaskModelExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskModel record, @Param("example") TaskModelExample example);

    int updateByExample(@Param("record") TaskModel record, @Param("example") TaskModelExample example);

    int updateByPrimaryKeySelective(TaskModel record);

    int updateByPrimaryKeyWithBLOBs(TaskModel record);

    int updateByPrimaryKey(TaskModel record);


    @Select({"select task_id,title,start_date from tasks where task_id = #{taskId}"})
    @Results(id="taskModel",value = {
            @Result(column="task_id", property="taskId", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR)
    })
    TaskModel selectByPrimaryKey2(Integer taskId);


    @Select({"select task_id,title,start_date from tasks where task_id = #{taskId}"})
    @ResultMap("BaseResultMap")
    TaskModel selectByPrimaryKey3(Integer taskId);

}