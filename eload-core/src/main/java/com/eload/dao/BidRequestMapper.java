package com.eload.dao;

import com.eload.pojo.BidRequest;
import com.eload.pojo.BidRequestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BidRequestMapper {
    int countByExample(BidRequestExample example);

    int deleteByExample(BidRequestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BidRequest record);

    int insertSelective(BidRequest record);

    List<BidRequest> selectByExample(BidRequestExample example);

    BidRequest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BidRequest record, @Param("example") BidRequestExample example);

    int updateByExample(@Param("record") BidRequest record, @Param("example") BidRequestExample example);

    int updateByPrimaryKeySelective(BidRequest record);

    int updateByPrimaryKey(BidRequest record);
}