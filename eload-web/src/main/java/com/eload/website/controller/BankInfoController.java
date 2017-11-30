package com.eload.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankInfoController {

    @RequestMapping("bankInfo")
    public String bankCenter(){

        return "bankInfo";
    }
}
