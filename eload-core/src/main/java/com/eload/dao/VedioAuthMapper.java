package com.eload.dao;

import com.eload.pojo.VedioAuth;
import com.eload.pojo.VedioAuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VedioAuthMapper {
    int countByExample(VedioAuthExample example);

    int deleteByExample(VedioAuthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VedioAuth record);

    int insertSelective(VedioAuth record);

    List<VedioAuth> selectByExample(VedioAuthExample example);

    VedioAuth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VedioAuth record, @Param("example") VedioAuthExample example);

    int updateByExample(@Param("record") VedioAuth record, @Param("example") VedioAuthExample example);

    int updateByPrimaryKeySelective(VedioAuth record);

    int updateByPrimaryKey(VedioAuth record);
}