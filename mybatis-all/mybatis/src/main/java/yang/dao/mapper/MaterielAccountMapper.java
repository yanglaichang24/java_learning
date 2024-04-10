package yang.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import yang.dao.model.AccountModel;
import yang.dao.model.AccountModelExample;

public interface MaterielAccountMapper {
    long countByExample(AccountModelExample example);

    int deleteByExample(AccountModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountModel record);

    int insertSelective(AccountModel record);

    List<AccountModel> selectByExampleWithRowbounds(AccountModelExample example, RowBounds rowBounds);

    List<AccountModel> selectByExample(AccountModelExample example);

    AccountModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountModel record, @Param("example") AccountModelExample example);

    int updateByExample(@Param("record") AccountModel record, @Param("example") AccountModelExample example);

    int updateByPrimaryKeySelective(AccountModel record);

    int updateByPrimaryKey(AccountModel record);
}