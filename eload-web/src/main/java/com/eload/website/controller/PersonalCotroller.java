package com.eload.website.controller;

import com.eload.pojo.Account;
import com.eload.pojo.UserInfo;
import com.eload.website.service.AccountService;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 个人中心
 * 
 */
@Controller
public class PersonalCotroller {

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private AccountService accountService;


	@RequestMapping("personal")
	public String personalCenter(Model model) {

		UserInfo userInfo = userInfoService.getUserInfo(6L);
		Account account = accountService.getAccount(6L);
		model.addAttribute("account",account);
		model.addAttribute("userInfo",userInfo);
		return "personal";
	}

	/**
	 * 用户绑定手机
	 * 
	 * @param phoneNumber
	 * @param verifyCode
	 * @return
	 *//*
	@RequireLogin
	@RequestMapping("bindPhone")
	@ResponseBody
	public JSONResult bindPhone(String phoneNumber, String verifyCode) {
		JSONResult json = new JSONResult();
		try {
			this.userinfoService.bindPhone(phoneNumber, verifyCode);
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg(e.getMessage());
		}
		return json;
	}

	*//**
	 * 验证邮件
	 *//*
	@RequestMapping("bindEmail")
	public String bingEmail(String uuid, Model model) {
		try {
			this.userinfoService.bindEmail(uuid);
			model.addAttribute("success",true);
		} catch (Exception e) {
			model.addAttribute("success",false);
			model.addAttribute("msg",e.getMessage());
		}
		return "checkmail_result";
	}*/

}
