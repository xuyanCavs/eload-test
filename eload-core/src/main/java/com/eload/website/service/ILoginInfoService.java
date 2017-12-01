package com.eload.website.service;

import com.eload.pojo.LoginInfo;

/**
 * User: Administrator
 * Date: 2017/11/29
 * Time: 22:47
 * Version:V1.0
 */
public interface ILoginInfoService {

// 用户登录
    void register(String username, String password);
// 校验用户名是否已经存在
    boolean checkUserNameExist(String username);
// 前台登录
    LoginInfo login(String username, String password);
    //  String remoteAddr 不知道什么用 先拿出来
}
