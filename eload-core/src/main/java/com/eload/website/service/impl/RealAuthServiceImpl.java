package com.eload.website.service.impl;

import com.eload.dao.RealAuthMapper;
import com.eload.dao.UserInfoMapper;
import com.eload.pojo.RealAuth;
import com.eload.pojo.UserInfo;
import com.eload.website.service.RealAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RealAuthServiceImpl implements RealAuthService{
    @Autowired
    private RealAuthMapper realAuthMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public RealAuth getRealAuth(long l) {
        return realAuthMapper.selectByPrimaryKey(l);
    }

    @Transactional
    @Override
    public int apply(RealAuth realAuth) {
        int insert = realAuthMapper.insert(realAuth);
        Long applierId = realAuth.getApplierId();
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(applierId);
        userInfo.setRealauthid(3L);
        int i = userInfoMapper.updateByPrimaryKey(userInfo);
        return insert+i;
    }
}
