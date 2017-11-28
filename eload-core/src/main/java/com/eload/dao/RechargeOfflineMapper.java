package com.eload.dao;

import com.eload.pojo.RechargeOffline;
import com.eload.pojo.RechargeOfflineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RechargeOfflineMapper {
    int countByExample(RechargeOfflineExample example);

    int deleteByExample(RechargeOfflineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RechargeOffline record);

    int insertSelective(RechargeOffline record);

    List<RechargeOffline> selectByExample(RechargeOfflineExample example);

    RechargeOffline selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RechargeOffline record, @Param("example") RechargeOfflineExample example);

    int updateByExample(@Param("record") RechargeOffline record, @Param("example") RechargeOfflineExample example);

    int updateByPrimaryKeySelective(RechargeOffline record);

    int updateByPrimaryKey(RechargeOffline record);
}