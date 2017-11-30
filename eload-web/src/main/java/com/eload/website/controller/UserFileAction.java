package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.pojo.UserFile;
import com.eload.website.service.UserFileService;
import com.eload.website.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class UserFileAction {

    @Autowired
    private UserFileService userFileService;

    @RequestMapping("userFile")
    public String getUserFile(Model model){
        //todo 坐等叶总session到位
        LoginInfo current = UserContext.getCurrent();
        if (current==null){
            current = new LoginInfo();
            current.setId(6L);
        }else {
            current.setId(6L);
        }
        List<UserFile> userFiles = userFileService.getUserFiles(current.getId());
        model.addAttribute("userFiles",userFiles);
        return "userFiles";
    }
}
