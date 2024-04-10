package com.bj58.lianmeng.td.promotion.lib.dao.mapper;

import com.bj58.lianmeng.td.promotion.lib.dao.model.ImageModel;
import com.bj58.lianmeng.td.promotion.lib.dao.model.ImageModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterielImageMapper {
    long countByExample(ImageModelExample example);

    int deleteByExample(ImageModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImageModel record);

    int insertSelective(ImageModel record);

    List<ImageModel> selectByExampleWithRowbounds(ImageModelExample example, RowBounds rowBounds);

    List<ImageModel> selectByExample(ImageModelExample example);

    ImageModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImageModel record, @Param("example") ImageModelExample example);

    int updateByExample(@Param("record") ImageModel record, @Param("example") ImageModelExample example);

    int updateByPrimaryKeySelective(ImageModel record);

    int updateByPrimaryKey(ImageModel record);
}