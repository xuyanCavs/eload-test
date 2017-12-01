package com.eload.util;

import com.eload.pojo.LoginInfo;
import com.eload.vo.VerifyCodeVO;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * 用户的上下文
 * 
 * 
 */
// 通过监听请求的创建 将请求扔到threadlocal里 源代码RequestContextListener类
public class UserContext {

	public static final String LOGININFO_IN_SESSION = "logininfo";
	public static final String VERIFYCODE_IN_SESSION = "verifycode_in_session";

	
	 //注意web.xml配置该监听器 RequestContextHolder
	private static HttpSession getSession() {
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest().getSession();
	}

	public static void putCurrent(LoginInfo current) {
		getSession().setAttribute(LOGININFO_IN_SESSION, current);
}

	
	public static LoginInfo getCurrent() {
		return (LoginInfo) getSession().getAttribute(LOGININFO_IN_SESSION);
	}

	/**
	 *存放 VerifyCodeVO
	 */
	public static void putVerifyCode(VerifyCodeVO vo){
		getSession().setAttribute(VERIFYCODE_IN_SESSION, vo);
	}
	
	/**
	 * 取出session中的verifyCodeVO
	 * @return
	 */
	public static VerifyCodeVO getVerifyCode(){
		VerifyCodeVO vo = (VerifyCodeVO) getSession().getAttribute(VERIFYCODE_IN_SESSION);
		return vo ;
	} 
}







