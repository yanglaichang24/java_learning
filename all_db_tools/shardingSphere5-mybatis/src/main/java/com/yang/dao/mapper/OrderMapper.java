package com.yang.dao.mapper;

import com.yang.dao.model.OrderModel;
import com.yang.dao.model.OrderModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderMapper {
    long countByExample(OrderModelExample example);

    int deleteByExample(OrderModelExample example);

    int insert(OrderModel record);

    int insertSelective(OrderModel record);

    List<OrderModel> selectByExampleWithRowbounds(OrderModelExample example, RowBounds rowBounds);

    List<OrderModel> selectByExample(OrderModelExample example);

    int updateByExampleSelective(@Param("record") OrderModel record, @Param("example") OrderModelExample example);

    int updateByExample(@Param("record") OrderModel record, @Param("example") OrderModelExample example);
}