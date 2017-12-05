package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.pojo.SystemDictionaryItem;
import com.eload.pojo.UserFile;
import com.eload.util.UploadUtil;
import com.eload.util.UserContext;
import com.eload.vo.UserFileType;
import com.eload.website.service.SystemDictionaryItemService;
import com.eload.website.service.UserFileService;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
public class UserFileController {

    @Autowired
    private UserFileService userFileService;

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private SystemDictionaryItemService systemDictionaryItemService;

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("userFile")
    public String getUserFile(Model model, HttpServletRequest request){
        LoginInfo logininfo = (LoginInfo) request.getSession().getAttribute("logininfo");
        List<UserFileType> userFileTypes = userFileService.getUserFilesType(logininfo.getId());
        //算取目前该用户获取的总分
        Integer score = 0;
        for (UserFileType userFileType : userFileTypes) {
            if (userFileType.getFiletypeId()==null){
                List<SystemDictionaryItem> list = systemDictionaryItemService.getUserFileInfo();
                model.addAttribute("userFileTypes",userFileTypes);
                model.addAttribute("list",list);
                return "userFiles_commit";
            }
            if(userFileType.getState()==1){
                Byte score1 = userFileType.getScore();
                score = score+score1;
            }
        }
        //把总分更新到userinfo这个表中
        userInfoService.updateRealauthScore(score,logininfo.getId());
        model.addAttribute("score",score);
        model.addAttribute("sessionId",request.getSession().getId());
        model.addAttribute("userFileTypes",userFileTypes);
        return "userFiles";
    }

    @RequestMapping("userFile_apply")
    @ResponseBody
    public String apply(MultipartFile file,HttpServletRequest request){
        String path = this.servletContext.getRealPath("/upload");
        String fileName =  UploadUtil.upload(file, path);
        fileName = "/upload/"+fileName ;
        LoginInfo logininfo = (LoginInfo) request.getSession().getAttribute("logininfo");
        this.userFileService.apply(fileName,logininfo);
        return fileName ;
    }
    @Transactional
    @RequestMapping("userFile_selectType")
    @ResponseBody
    public void updateType(Long[] id, Long[] fileType, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userFileService.updateType(id,fileType);
        request.getRequestDispatcher("userFile").forward(request,response);
    }
}
