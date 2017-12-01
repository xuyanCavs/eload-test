package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.util.JSONResult;
import com.eload.website.service.ILoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

//注册
@Controller
public class RegisterController {

	@Autowired
	private ILoginInfoService logininfoService;

	// 注册
	@RequestMapping("/register")
	@ResponseBody
	public JSONResult register(String username, String password) {
		JSONResult json = new JSONResult();
		try {
			logininfoService.register(username, password);
		} catch (RuntimeException e) {
			e.printStackTrace();
			json.setSuccess(false);
			json.setMsg(e.getMessage());
		}
		return json;
	}

	/**
	 * 检查用户名是否存在
	 * 
	 *
	 *
	 */
	@RequestMapping("/checkUserName")
	@ResponseBody
	public boolean checkUserName(String username) {

		return !this.logininfoService.checkUserNameExist(username);
	}

	/**
	 * 用户登录
	 * 
	 *
	 */
	@RequestMapping("/login")
	@ResponseBody
	public JSONResult login(String username, String password,
			HttpServletRequest request) {

		JSONResult json = new JSONResult();
		LoginInfo current = this.logininfoService.login(username, password);
		//前端用户的登陆, LoginInfo.USER_CLIENT   request.getRemoteAddr()，request.getRemoteAddr()
		if (current == null) {
			json.setSuccess(false);
			json.setMsg("用户名或密码错误!");
		}
		return json;
	}

}
