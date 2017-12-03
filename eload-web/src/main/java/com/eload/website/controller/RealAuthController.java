package com.eload.website.controller;

import com.eload.pojo.LoginInfo;
import com.eload.pojo.RealAuth;
import com.eload.pojo.UserInfo;
import com.eload.util.JSONResult;
import com.eload.util.UploadUtil;
import com.eload.util.UserContext;
import com.eload.website.service.RealAuthService;
import com.eload.website.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RealAuthController {

    @Autowired
    private RealAuthService realAuthService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("realAuth")
    public String realAuth(Model model, HttpServletRequest request){
        LoginInfo logininfo = (LoginInfo) request.getSession().getAttribute("logininfo");
        UserInfo userInfo = userInfoService.getUserInfo(logininfo.getId());
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

    /**
     * 提交实名认证资料的审核
     * @param
     * @return
     */
    @RequestMapping("realAuth_save")
    @ResponseBody
    public JSONResult realAuthSave(RealAuth realAuth) {
        UserInfo userInfo = this.userInfoService.getUserInfo(UserContext.getCurrent().getId());
        this.realAuthService.apply(realAuth,userInfo);
        return new JSONResult();
    }

    //这里不能写 @RequireLogin
    /**
     * 处理前台实名时候上传的图片
     * @param file
     * @return
     */
    @RequestMapping("realAuth_upload")
    @ResponseBody
    public String upload(MultipartFile file){
        String dic = "/upload" ;
        String fileName = UploadUtil.upload(file, this.servletContext.getRealPath(dic));
        return dic+"/"+ fileName ;  //返回一个相对路径  给页面使用
    }
}
