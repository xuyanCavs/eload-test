package com.eload.query;


import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

/**
 * 视频认证的高级查询对象
 * @author Linv999
 *
 */
@Setter
@Getter
public class VedioAuthQueryObject extends AuditQueryObject {

	private String keyword ;
	
	public String getKeyword(){
		return StringUtils.hasLength(keyword) ? keyword : null;
	}
	
	
}
