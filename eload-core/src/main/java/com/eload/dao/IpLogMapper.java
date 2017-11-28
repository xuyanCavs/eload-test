package com.eload.dao;

import com.eload.pojo.IpLog;
import com.eload.pojo.IpLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IpLogMapper {
    int countByExample(IpLogExample example);

    int deleteByExample(IpLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IpLog record);

    int insertSelective(IpLog record);

    List<IpLog> selectByExample(IpLogExample example);

    IpLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IpLog record, @Param("example") IpLogExample example);

    int updateByExample(@Param("record") IpLog record, @Param("example") IpLogExample example);

    int updateByPrimaryKeySelective(IpLog record);

    int updateByPrimaryKey(IpLog record);
}