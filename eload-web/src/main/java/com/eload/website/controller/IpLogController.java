package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.query.IplogQueryObject;
import com.eload.query.PageResult;
import com.eload.util.UserContext;
import com.eload.website.service.IpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IpLogController {

    @Autowired
    private IpLogService ipLogService;

    @RequestMapping("ipLog")
    public String index(@ModelAttribute("qo")IplogQueryObject qo,Model model){
        LoginInfo current = UserContext.getCurrent();
        qo.setLoginInfoId(Integer.parseInt(current.getId()+""));
        PageResult pageResult = ipLogService.fingIpLog(qo);
        model.addAttribute("pageResult",pageResult);
        return "iplog_list";
    }
}
