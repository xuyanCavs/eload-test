package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.pojo.UserFile;
import com.eload.util.UploadUtil;
import com.eload.util.UserContext;
import com.eload.website.service.UserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class UserFileController {

    @Autowired
    private UserFileService userFileService;

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("userFile")
    public String getUserFile(Model model, HttpServletRequest request){
        //todo 坐等叶总session到位
        LoginInfo logininfo = (LoginInfo) request.getSession().getAttribute("logininfo");
        List<UserFile> userFiles = userFileService.getUserFiles(logininfo.getId());
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
