package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.pojo.UserInfo;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BankInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("bankInfo")
    public String index(Model model,HttpServletRequest request){
        LoginInfo logininfo = (LoginInfo) request.getSession().getAttribute("logininfo");
        UserInfo userInfo = userInfoService.getUserInfo(logininfo.getId());
        model.addAttribute("userInfo",userInfo);
        return "bankInfo";
    }
}
