package com.eload.website.service;


import com.eload.pojo.Account;

/**
 * 账户相关服务
 *
 */
public interface IAccountService {
	
	// 写完mapper之后马上写该update   因为该update是支持乐观锁的
	void  update(Account account);

	void add(Account account);

	Account get(Long id);

}
