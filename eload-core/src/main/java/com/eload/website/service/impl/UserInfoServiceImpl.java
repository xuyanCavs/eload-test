package com.eload.website.service.impl;

import com.eload.dao.UserInfoMapper;
import com.eload.pojo.UserInfo;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(long l) {
        return userInfoMapper.selectByPrimaryKey(l);
    }
}
