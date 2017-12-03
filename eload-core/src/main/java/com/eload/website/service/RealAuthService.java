package com.eload.website.service;

import com.eload.pojo.RealAuth;
import com.eload.pojo.UserInfo;

public interface RealAuthService {
    RealAuth getRealAuth(long l);
    void apply(RealAuth realAuth, UserInfo userInfo);
}
