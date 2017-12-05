package com.eload.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserInfoController {

    @RequestMapping("basicInfo.do")
    public String index(){

        return "userInfo";
    }
}
