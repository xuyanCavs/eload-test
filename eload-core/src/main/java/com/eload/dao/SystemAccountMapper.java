package com.eload.dao;

import com.eload.pojo.SystemAccount;
import com.eload.pojo.SystemAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemAccountMapper {
    int countByExample(SystemAccountExample example);

    int deleteByExample(SystemAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemAccount record);

    int insertSelective(SystemAccount record);

    List<SystemAccount> selectByExample(SystemAccountExample example);

    SystemAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemAccount record, @Param("example") SystemAccountExample example);

    int updateByExample(@Param("record") SystemAccount record, @Param("example") SystemAccountExample example);

    int updateByPrimaryKeySelective(SystemAccount record);

    int updateByPrimaryKey(SystemAccount record);
}