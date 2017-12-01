package com.eload.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 封装了验证码 手机号 发送时间
 * 
 * 
 */
@Setter
@Getter
public class VerifyCodeVO {

	private String phoneNumber;
	private String code;
	private Date sendTime;
	
	public VerifyCodeVO(String phoneNumber, String code, Date sendTime) {
		this.phoneNumber = phoneNumber;
		this.code = code;
		this.sendTime = sendTime;
	}
	public VerifyCodeVO() {
	}
	

}
