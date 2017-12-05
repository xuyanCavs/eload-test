package com.eload.website.service;


import com.eload.pojo.UserInfo;

public interface UserInfoService {
    UserInfo getUserInfo(long l);

    void updateRealauthScore(Integer score, Long id);
}
