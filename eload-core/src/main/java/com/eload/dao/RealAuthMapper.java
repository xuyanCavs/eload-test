package com.eload.dao;

import com.eload.pojo.RealAuth;
import com.eload.pojo.RealAuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RealAuthMapper {
    int countByExample(RealAuthExample example);

    int deleteByExample(RealAuthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RealAuth record);

    int insertSelective(RealAuth record);

    List<RealAuth> selectByExample(RealAuthExample example);

    RealAuth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RealAuth record, @Param("example") RealAuthExample example);

    int updateByExample(@Param("record") RealAuth record, @Param("example") RealAuthExample example);

    int updateByPrimaryKeySelective(RealAuth record);

    int updateByPrimaryKey(RealAuth record);
}