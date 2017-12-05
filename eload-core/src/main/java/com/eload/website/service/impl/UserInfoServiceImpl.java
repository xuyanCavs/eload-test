package com.eload.website.service.impl;

import com.eload.dao.UserInfoMapper;
import com.eload.pojo.UserInfo;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional
    @Override
    public void updateRealauthScore(Integer score, Long id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        userInfo.setAuthscore(score);
    }

    @Override
    public UserInfo getUserInfo(long l) {

        return userInfoMapper.selectByPrimaryKey(l);
    }
}
