package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.pojo.UserFile;
import com.eload.website.service.UserFileService;
import com.eload.website.util.UploadUtil;
import com.eload.website.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.util.List;


@Controller
public class UserFileController {

    @Autowired
    private UserFileService userFileService;

    @Autowired
    private ServletContext servletContext;

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

    @RequestMapping("userFile_apply")
    @ResponseBody
    public String apply(MultipartFile file){
        String path = this.servletContext.getRealPath("/upload");
        String fileName =  UploadUtil.upload(file, path);
        fileName = "/upload/"+fileName ;
        this.userFileService.apply(fileName);
        return fileName ;
    }
}
