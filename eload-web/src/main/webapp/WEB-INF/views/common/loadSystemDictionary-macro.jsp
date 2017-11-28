<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<#macro loadSdi sn>
	<#assign list = _SYSTEMDIC_UTIL.listBySn(sn) />
	<#list list as item>
		<option value="${item.id}">${item.title}</option>
	</#list>
</#macro>