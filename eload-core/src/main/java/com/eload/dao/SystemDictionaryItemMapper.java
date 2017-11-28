package com.eload.dao;

import com.eload.pojo.SystemDictionaryItem;
import com.eload.pojo.SystemDictionaryItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemDictionaryItemMapper {
    int countByExample(SystemDictionaryItemExample example);

    int deleteByExample(SystemDictionaryItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemDictionaryItem record);

    int insertSelective(SystemDictionaryItem record);

    List<SystemDictionaryItem> selectByExample(SystemDictionaryItemExample example);

    SystemDictionaryItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemDictionaryItem record, @Param("example") SystemDictionaryItemExample example);

    int updateByExample(@Param("record") SystemDictionaryItem record, @Param("example") SystemDictionaryItemExample example);

    int updateByPrimaryKeySelective(SystemDictionaryItem record);

    int updateByPrimaryKey(SystemDictionaryItem record);
}