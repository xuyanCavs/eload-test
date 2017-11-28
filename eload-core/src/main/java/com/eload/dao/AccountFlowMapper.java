package com.eload.dao;

import com.eload.pojo.AccountFlow;
import com.eload.pojo.AccountFlowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountFlowMapper {
    int countByExample(AccountFlowExample example);

    int deleteByExample(AccountFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountFlow record);

    int insertSelective(AccountFlow record);

    List<AccountFlow> selectByExample(AccountFlowExample example);

    AccountFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountFlow record, @Param("example") AccountFlowExample example);

    int updateByExample(@Param("record") AccountFlow record, @Param("example") AccountFlowExample example);

    int updateByPrimaryKeySelective(AccountFlow record);

    int updateByPrimaryKey(AccountFlow record);
}