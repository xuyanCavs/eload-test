package com.eload.dao;

import com.eload.pojo.PaymentSchedule;
import com.eload.pojo.PaymentScheduleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentScheduleMapper {
    int countByExample(PaymentScheduleExample example);

    int deleteByExample(PaymentScheduleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PaymentSchedule record);

    int insertSelective(PaymentSchedule record);

    List<PaymentSchedule> selectByExample(PaymentScheduleExample example);

    PaymentSchedule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PaymentSchedule record, @Param("example") PaymentScheduleExample example);

    int updateByExample(@Param("record") PaymentSchedule record, @Param("example") PaymentScheduleExample example);

    int updateByPrimaryKeySelective(PaymentSchedule record);

    int updateByPrimaryKey(PaymentSchedule record);
}