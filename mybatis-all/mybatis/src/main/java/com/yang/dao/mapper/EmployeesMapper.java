package com.yang.dao.mapper;

import com.yang.dao.model.EmployeesModel;
import com.yang.dao.model.EmployeesModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EmployeesMapper {
    long countByExample(EmployeesModelExample example);

    int deleteByExample(EmployeesModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeesModel record);

    int insertSelective(EmployeesModel record);

    List<EmployeesModel> selectByExampleWithRowbounds(EmployeesModelExample example, RowBounds rowBounds);

    List<EmployeesModel> selectByExample(EmployeesModelExample example);

    EmployeesModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeesModel record, @Param("example") EmployeesModelExample example);

    int updateByExample(@Param("record") EmployeesModel record, @Param("example") EmployeesModelExample example);

    int updateByPrimaryKeySelective(EmployeesModel record);

    int updateByPrimaryKey(EmployeesModel record);
}