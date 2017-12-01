package com.eload.website.service;

import com.eload.pojo.UserInfo;

import java.util.List;
import java.util.Map;



/**
 * 用户相关信息服务
 *
 */
public interface IUserinfoService {

	//该update是支持乐观锁的
	void update(UserInfo userinfo);

	void add(UserInfo ui);

	UserInfo  get(Long id);

	void bindPhone(String phoneNumber, String verifyCode);

	void bindEmail(String uuid);

	void updateBasicInfo(UserInfo userinfo);

	List<Map<String, Object>> autoComplate(String str);


	
}
