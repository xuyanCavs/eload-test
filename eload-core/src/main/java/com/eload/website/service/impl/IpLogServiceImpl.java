package com.eload.website.service.impl;

import com.eload.dao.IpLogMapper;
import com.eload.pojo.IpLog;
import com.eload.query.IplogQueryObject;
import com.eload.query.PageResult;
import com.eload.website.service.IpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IpLogServiceImpl implements IpLogService {

    @Autowired
    private IpLogMapper ipLogMapper;

    @Override
    public PageResult fingIpLog(IplogQueryObject qo) {
        Integer integer = ipLogMapper.queryCount(qo);
        if (integer>0){
            List<IpLog> list = ipLogMapper.queryByPage(qo);
            PageResult pageResult = new PageResult(list,integer,qo.getCurrentPage(),qo.getPageSize());
            return pageResult;
        }
        return PageResult.empty(qo.getPageSize());
    }
}
