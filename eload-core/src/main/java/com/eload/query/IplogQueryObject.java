package com.eload.query;

import com.eload.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.util.Date;




//分页查询的条件
@Setter @Getter
public class IplogQueryObject extends QueryObject {

	private Date beginDate;
	private Date endDate;

	private int state = -1;
	private int userType = -1 ;
	
	private String username;
	
	
	
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
	

}
