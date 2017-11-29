package com.eload.website.controller;

import com.eload.pojo.RealAuth;
import com.eload.pojo.UserInfo;
import com.eload.website.service.RealAuthService;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RealAuthController {

    @Autowired
    private RealAuthService realAuthService;

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("realAuth")
    public String realAuth(Model model){
        UserInfo userInfo = userInfoService.getUserInfo(6);
        if (userInfo.getRealauthid()==2){
            return "realAuth";
        }else if(userInfo.getRealauthid()==1||userInfo.getRealauthid()==3){
            if (userInfo.getRealauthid()==1){
                RealAuth realAuth = realAuthService.getRealAuth(1L);
                model.addAttribute("realAuth",realAuth);
                model.addAttribute("auditing",true);
            }else if (userInfo.getRealauthid()==3){
                model.addAttribute("auditing",false);
            }
            return "realAuth_result";
        }else if(userInfo.getRealauthid()==4){
            return null;
        }
        return null;
    }
}
