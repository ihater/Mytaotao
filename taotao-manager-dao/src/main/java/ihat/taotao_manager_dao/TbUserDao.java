package ihat.taotao_manager_dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import ihat.taotao_manager_pojo.TbUser;
import ihat.taotao_manager_pojo.TbUserQuery;

public interface TbUserDao {
    int countByExample(TbUserQuery example);

    int deleteByExample(TbUserQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserQuery example);

    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserQuery example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserQuery example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}