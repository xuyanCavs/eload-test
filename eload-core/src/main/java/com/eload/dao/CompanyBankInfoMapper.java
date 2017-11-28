package com.eload.dao;

import com.eload.pojo.CompanyBankInfo;
import com.eload.pojo.CompanyBankInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyBankInfoMapper {
    int countByExample(CompanyBankInfoExample example);

    int deleteByExample(CompanyBankInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyBankInfo record);

    int insertSelective(CompanyBankInfo record);

    List<CompanyBankInfo> selectByExample(CompanyBankInfoExample example);

    CompanyBankInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyBankInfo record, @Param("example") CompanyBankInfoExample example);

    int updateByExample(@Param("record") CompanyBankInfo record, @Param("example") CompanyBankInfoExample example);

    int updateByPrimaryKeySelective(CompanyBankInfo record);

    int updateByPrimaryKey(CompanyBankInfo record);
}