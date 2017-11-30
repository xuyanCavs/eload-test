package com.eload.website.controller;

import com.eload.pojo.RealAuth;
import com.eload.pojo.UserInfo;
import com.eload.website.service.RealAuthService;
import com.eload.website.service.UserInfoService;
import com.eload.website.util.JSONResult;
import com.eload.website.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.util.Date;

@Controller
public class RealAuthController {

    @Autowired
    private RealAuthService realAuthService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private ServletContext servletContext ;

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

    @RequestMapping("realAuth_upload")
    @ResponseBody
    public String upload(MultipartFile file){
        String dic = "/upload" ;
        String fileName = UploadUtil.upload(file, this.servletContext.getRealPath(dic));
        return dic+"/"+ fileName ;  //返回一个相对路径  给页面使用
    }

    @ResponseBody
    @RequestMapping("realAuth_save")
    public JSONResult saveRealAuth(RealAuth realAuth){
        realAuth.setApplierId(6L);
        realAuth.setState((byte)3);
        realAuth.setApplytime(new Date());
        //System.out.println(realAuth);
        int i = realAuthService.apply(realAuth);
        return new JSONResult();
    }
}
