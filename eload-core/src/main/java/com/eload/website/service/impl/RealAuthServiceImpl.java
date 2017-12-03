package com.eload.website.service.impl;

import com.eload.dao.RealAuthMapper;
import com.eload.dao.UserInfoMapper;
import com.eload.pojo.RealAuth;
import com.eload.pojo.UserInfo;
import com.eload.util.UserContext;
import com.eload.website.service.RealAuthService;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class RealAuthServiceImpl implements RealAuthService{
    @Autowired
    private RealAuthMapper realAuthMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional
    @Override
    public void apply(RealAuth realAuth,UserInfo userInfo) {
            //判断当前用户是否能够申请实名认证
        if(userInfo.getRealauthid()!=null&&userInfo.getRealauthid()==2){
            RealAuth r = new RealAuth();
            r.setState((byte)3);
            r.setApplytime(new Date());
            r.setApplierId(userInfo.getId());
            r.setSex(realAuth.getSex());
            r.setAddress(realAuth.getAddress());
            r.setBirthdate(realAuth.getBirthdate());
            r.setIdnumber(realAuth.getIdnumber());
            r.setImage1(realAuth.getImage1());
            r.setImage2(realAuth.getImage2());
            r.setRealname(realAuth.getRealname());
            realAuthMapper.insert(r);
            userInfo.setRealauthid(3L);
            userInfoMapper.updateByPrimaryKey(userInfo);
        }


    }

    @Override
    public RealAuth getRealAuth(long l) {
        return realAuthMapper.selectByPrimaryKey(l);
    }
}
