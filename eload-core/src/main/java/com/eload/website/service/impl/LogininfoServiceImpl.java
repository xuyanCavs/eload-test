package com.eload.website.service.impl;


import com.eload.dao.AccountMapper;
import com.eload.dao.IpLogMapper;
import com.eload.dao.LoginInfoMapper;
import com.eload.dao.UserInfoMapper;
import com.eload.pojo.*;
import com.eload.util.*;
import com.eload.website.service.ILoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class LogininfoServiceImpl implements ILoginInfoService {

	
	@Autowired
	private LoginInfoMapper logininfoMapper ;
	
	@Autowired
	private UserInfoMapper userInfoMapper  ;
	
	@Autowired
	private AccountMapper accountMapper  ;
	@Autowired
	private IpLogMapper iplogMapper;
	
	
	//前端用户的注册
	public void register(String username, String password) {
		//判断用户名字是否存在
		LoginInfoExample loginInfoExample = new LoginInfoExample();
		LoginInfoExample.Criteria criteria = loginInfoExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<LoginInfo> loginInfos = this.logininfoMapper.selectByExample(loginInfoExample);
		if (loginInfos.size() <= 0) {
			//用户名不存在的情况下保存用户
			LoginInfo li = new LoginInfo();
			li.setId(IDUtils.getId());
			li.setUsername(username);
			li.setPassword(MD5.encode(password));

			li.setState((byte)0);
			 li.setUsertype((byte)0);
			this.logininfoMapper.insert(li);
			
			/*//初始化账户信息和UserInfo
			Account account = new Account();
			account.setId(li.getId());
			account.setUsableamount(new BigDecimal(5000));
			account.setFreezedamount(new BigDecimal(1));
			account.setBorrowlimitamount(new BigDecimal(0));
			account.setRemainborrowlimit(new BigDecimal(5000));
			account.setTradepassword("123456");
			account.setUnreceiveinterest(new BigDecimal(0));
			account.setUnreturnamount(new BigDecimal(0));
			account.setUnreceiveprincipal(new BigDecimal(0));
			account.setVersion(1);
			this.accountMapper.insert(account);
			UserInfo ui = new UserInfo();
			ui.setId(li.getId());
			this.userInfoMapper.insert(ui);*/
		}else{
			//存在的话直接抛异常
			throw new RuntimeException("该用户名已经存在!");
		}
		
	}

	public boolean checkUserNameExist(String username) {
		//判断用户名字是否存在
		LoginInfoExample loginInfoExample = new LoginInfoExample();
		LoginInfoExample.Criteria criteria = loginInfoExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<LoginInfo> loginInfos = logininfoMapper.selectByExample(loginInfoExample);

		if(loginInfos.size() ==0){
			return false;
		}else {
			return true;
		}
	}

	//检查用户登录
	public LoginInfo login(String username, String password) {

		LoginInfoExample loginInfoExample = new LoginInfoExample();
		LoginInfoExample.Criteria criteria = loginInfoExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(MD5.encode(password));
		List<LoginInfo> loginInfos = logininfoMapper.selectByExample(loginInfoExample);
		LoginInfo current =null;
		if(loginInfos.size()==1 ){
			current = loginInfos.get(0);
			//登陆日志的相关信息
			IpLog iplog = new IpLog();
			iplog.setIp(IpAddressUtils.getIpAddress());
			iplog.setLogintime(new Date());
			iplog.setLogintype((byte)1);
			iplog.setUsername(username);
			iplog.setLogininfoid(current.getId());
			// iplog.setUserType(userType);
			if (current != null  ) {
				//查询有,登录成功,将对象放到session中,否则返回一个null
				UserContext.putCurrent(current);
				//登陆成功的iplog信息
				iplog.setLoginstate((byte)1);
			}else{
				iplog.setLoginstate((byte)0);
			}
			iplogMapper.insert(iplog);
		}
		return current;
 	}

	//初始化第一个管理员
	public void initAdmin() {
		//查询当前是否有管理员
		LoginInfoExample loginInfoExample = new LoginInfoExample();
		LoginInfoExample.Criteria criteria = loginInfoExample.createCriteria();
		criteria.andUsertypeEqualTo((byte)1);
		List<LoginInfo> loginInfos = this.logininfoMapper.selectByExample(loginInfoExample);
		//如果没有就创建一个管理员
		if (loginInfos.size() == 0 ) {
			LoginInfo admin  = new LoginInfo() ;
			admin.setUsername(BidConst.DEFAULT_ADMIN_NAME);
			admin.setPassword(MD5.encode(BidConst.DEFAULT_ADMIN_PASSWORD));
			admin.setUsertype((byte)1);
			this.logininfoMapper.insert(admin);
		}
	}
}
