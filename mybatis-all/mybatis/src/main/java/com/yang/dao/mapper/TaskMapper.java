package com.yang.dao.mapper;

import com.yang.dao.model.TaskModel;
import com.yang.dao.model.TaskModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskMapper {
    long countByExample(TaskModelExample example);

    int deleteByExample(TaskModelExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskModel record);

    int insertSelective(TaskModel record);

    List<TaskModel> selectByExampleWithRowbounds(TaskModelExample example, RowBounds rowBounds);

    List<TaskModel> selectByExample(TaskModelExample example);

    TaskModel selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TaskModel record, @Param("example") TaskModelExample example);

    int updateByExample(@Param("record") TaskModel record, @Param("example") TaskModelExample example);

    int updateByPrimaryKeySelective(TaskModel record);

    int updateByPrimaryKey(TaskModel record);
}