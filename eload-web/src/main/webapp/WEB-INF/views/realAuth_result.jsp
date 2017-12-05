<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>蓝源Eloan-P2P平台</title>
		<%@ include file="common/links-tpl.jsp" %>
		<link type="text/css" rel="stylesheet" href="/css/account.css" />
	</head>
	<body>
		<%@ include file="common/head-tpl.jsp" %>
		<%@ include file="common/navbar-tpl.jsp" %>
		
		<div class="container">
			<div class="row">
				<!--导航菜单-->
				<div class="col-sm-3">
					<%@ include file="common/leftmenu-tpl.jsp" %>
				</div>
				<!-- 功能页面 -->
				<div class="col-sm-9">
						<c:choose>
							<c:when test="${auditing==false}">
								<div class="el-tip-info">
									<h3>实名认证</h3>
									<p class="text-info">实名认证资料已经提交，等待业务员审核，请耐心等待；如果急需审核请联系客服；</p>
								</div>
							</c:when>
							<c:when test="${auditing==true}">
								<div class="panel panel-default">
									<div class="panel-heading">
										实名认证
									</div>
									<div class="panel-body">
										<h4 class="text-success ">你已经通过实名认证</h4>
										<hr />
										<table style="width: 100%;height: 100px;">
											<tr>
												<td><span>真实姓名： ${realAuth.realname}</span></td>
												<td><span>
													性别：<c:if test="${realAuth.sex==0}">男</c:if>
													<c:if test="${realAuth.sex==1}">女</c:if>
												</span></td>
											</tr>
											<tr>
												<td><span>证件号码： ${realAuth.idnumber}</span></td>
												<td><span>出生日期：${(realAuth.birthdate)}</span></td>
											</tr>
										</table>
									</div>
								</div>
							</c:when>
						</c:choose>
				</div>
			</div>
		</div>

		<%@ include file="common/footer-tpl.jsp" %>
	</body>
</html>