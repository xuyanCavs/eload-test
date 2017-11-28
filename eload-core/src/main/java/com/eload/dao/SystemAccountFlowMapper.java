package com.eload.dao;

import com.eload.pojo.SystemAccountFlow;
import com.eload.pojo.SystemAccountFlowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemAccountFlowMapper {
    int countByExample(SystemAccountFlowExample example);

    int deleteByExample(SystemAccountFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemAccountFlow record);

    int insertSelective(SystemAccountFlow record);

    List<SystemAccountFlow> selectByExample(SystemAccountFlowExample example);

    SystemAccountFlow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemAccountFlow record, @Param("example") SystemAccountFlowExample example);

    int updateByExample(@Param("record") SystemAccountFlow record, @Param("example") SystemAccountFlowExample example);

    int updateByPrimaryKeySelective(SystemAccountFlow record);

    int updateByPrimaryKey(SystemAccountFlow record);
}