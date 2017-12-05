package com.eload.website.controller;

import com.eload.pojo.BankInfo;
import com.eload.pojo.LoginInfo;
import com.eload.pojo.UserInfo;
import com.eload.util.UserContext;
import com.eload.website.service.BankInfoService;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BankInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private BankInfoService bankInfoService;

    @RequestMapping("bankInfo")
    public String index(Model model,HttpServletRequest request){
        LoginInfo logininfo = (LoginInfo) request.getSession().getAttribute("logininfo");
        UserInfo userInfo = userInfoService.getUserInfo(logininfo.getId());
        BankInfo bankInfo = bankInfoService.getBankInfoByUid(logininfo.getId());
        if (bankInfo!=null){
            model.addAttribute("bankInfo",bankInfo);
            model.addAttribute("userInfo",userInfo);
            return "bankInfo_result";
        }
        model.addAttribute("userInfo",userInfo);
        return "bankInfo";
    }

    @RequestMapping(value = "bankInfo_save")
    public void saveBankInfo(BankInfo bankInfo, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginInfo current = UserContext.getCurrent();
        bankInfo.setUid(Integer.parseInt(current.getId()+""));
        bankInfoService.saveBankInfo(bankInfo);
        request.getRequestDispatcher("bankInfo.do").forward(request,response);
    }

}
