package com.eload.dao;

import com.eload.pojo.PaymentScheduleDetail;
import com.eload.pojo.PaymentScheduleDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentScheduleDetailMapper {
    int countByExample(PaymentScheduleDetailExample example);

    int deleteByExample(PaymentScheduleDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PaymentScheduleDetail record);

    int insertSelective(PaymentScheduleDetail record);

    List<PaymentScheduleDetail> selectByExample(PaymentScheduleDetailExample example);

    PaymentScheduleDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PaymentScheduleDetail record, @Param("example") PaymentScheduleDetailExample example);

    int updateByExample(@Param("record") PaymentScheduleDetail record, @Param("example") PaymentScheduleDetailExample example);

    int updateByPrimaryKeySelective(PaymentScheduleDetail record);

    int updateByPrimaryKey(PaymentScheduleDetail record);
}