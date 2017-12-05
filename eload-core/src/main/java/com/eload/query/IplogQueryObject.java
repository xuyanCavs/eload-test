package com.eload.query;

import com.eload.util.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.util.Date;




//分页查询的条件
public class IplogQueryObject extends QueryObject {

	private Date beginDate;
	private Date endDate;

	private int state = -1;
	private int userType = 1 ;
	
	private String username;
	
	private Integer loginInfoId;

	public Integer getLoginInfoId() {
		return loginInfoId;
	}

	public void setLoginInfoId(Integer loginInfoId) {
		this.loginInfoId = loginInfoId;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setBeginDate(Date beginDate){
		this.beginDate = beginDate ;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setEndDate(Date endDate){
		this.endDate = endDate ;
	}
	
	//获取到endDate时间的最后一秒
	public Date getEndDate(){
		return endDate == null ? null : DateUtil.endOfDay(endDate);
	}	
	
	public String getUsername(){
		return StringUtils.hasLength(username) ? username : null ;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
