package com.eload.dao;

import com.eload.pojo.BidRequestAuditHistory;
import com.eload.pojo.BidRequestAuditHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BidRequestAuditHistoryMapper {
    int countByExample(BidRequestAuditHistoryExample example);

    int deleteByExample(BidRequestAuditHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BidRequestAuditHistory record);

    int insertSelective(BidRequestAuditHistory record);

    List<BidRequestAuditHistory> selectByExample(BidRequestAuditHistoryExample example);

    BidRequestAuditHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BidRequestAuditHistory record, @Param("example") BidRequestAuditHistoryExample example);

    int updateByExample(@Param("record") BidRequestAuditHistory record, @Param("example") BidRequestAuditHistoryExample example);

    int updateByPrimaryKeySelective(BidRequestAuditHistory record);

    int updateByPrimaryKey(BidRequestAuditHistory record);
}