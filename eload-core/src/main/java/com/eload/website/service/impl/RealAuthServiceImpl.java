package com.eload.website.service.impl;

import com.eload.dao.RealAuthMapper;
import com.eload.pojo.RealAuth;
import com.eload.website.service.RealAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealAuthServiceImpl implements RealAuthService{
    @Autowired
    private RealAuthMapper realAuthMapper;
    @Override
    public RealAuth getRealAuth(long l) {
        return realAuthMapper.selectByPrimaryKey(l);
    }
}
