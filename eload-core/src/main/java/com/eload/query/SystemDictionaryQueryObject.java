package com.eload.query;

import org.springframework.util.StringUtils;

import lombok.Getter;
import lombok.Setter;


/**
 * 数据字典 字典明细 相关的高级查询
 * @author Linv999!
 *
 */
@Setter
@Getter 
public class SystemDictionaryQueryObject extends QueryObject {

	private String keyword ;
	private Long parentId ;
	
	/**
	 * 判断是否空字符串  也设置为null
	 * @return
	 */
	public String getKeyword(){
		return StringUtils.hasLength(keyword) ? keyword : null ;
	}
	
}
