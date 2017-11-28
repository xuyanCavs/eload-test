package com.eload.dao;

import com.eload.pojo.EmailActive;
import com.eload.pojo.EmailActiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmailActiveMapper {
    int countByExample(EmailActiveExample example);

    int deleteByExample(EmailActiveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EmailActive record);

    int insertSelective(EmailActive record);

    List<EmailActive> selectByExample(EmailActiveExample example);

    EmailActive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EmailActive record, @Param("example") EmailActiveExample example);

    int updateByExample(@Param("record") EmailActive record, @Param("example") EmailActiveExample example);

    int updateByPrimaryKeySelective(EmailActive record);

    int updateByPrimaryKey(EmailActive record);
}