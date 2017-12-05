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
		<link rel="stylesheet" href="/css/bank.css">
		<script type="text/javascript" src="/js/bank.js"></script>
		<link type="text/css" rel="stylesheet" href="/css/account.css" />
		<script type="text/javascript" src="/js/plugins/uploadify/jquery.uploadify.min.js"></script>
		<script type="text/javascript">
		
		</script>
	</head>
	<body>
		<!-- 网页顶部导航 -->
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
					<div class="panel panel-default">
						<div class="panel-heading">
							绑定银行卡
						</div>
						<c:if test="${userInfo.realauthid==1}">
						<form class="form-horizontal" id="bankForm" method="post" action="/bankInfo_save.do" novalidate="novalidate">
							<fieldset>
								<div class="form-group">
									<p class="text-center text-danger">为保护您账户安全，绑定银行卡之后，不能自己修改，请认真填写！</p>
								</div>
								<div class="form-group">
						        	<label class="col-sm-4 control-label ">开户名</label>
					        		<div class="col-sm-8">
						        		<p class="form-control-static">${userInfo.realname}</p>
										<input type="hidden" value="${userInfo.realname}" name="accountname">
						        	</div>
						        </div>
						        <div class="form-group">
						        	<label class="col-sm-4  control-label" for="bankName">开户行</label>
					        		<div class="col-sm-4">
						        		<select class="form-control" name="bankname" size="1">
											<script>
											for(var k in SITE_BANK_TYPE_NAME_MAP){
												var v = SITE_BANK_TYPE_NAME_MAP[k];
												var html = '<option value="'+ k +'">' + v + '</option>' 
												document.write(html);
											}
											</script>
										</select>
						        	</div>
						        </div>
						        <div class="form-group">
						        	<label class="col-sm-4  control-label" for="bankforkname">支行名称</label>
					        		<div class="col-sm-4">
						        		<input id="id2Number" class="form-control" name="bankforkname"  type="text" value="">
						        	</div>
						        </div>
						        <div class="form-group">
						        	<label class="col-sm-4  control-label" for="accountNumber">银行账号</label>
					        		<div class="col-sm-4">
						        		<input id="idNumber" class="form-control" name="banknumber"  type="text" value="">
						        	</div>
						        </div>
						        <div class="form-group">
						        	<button type="submit" id="asubmit" class="btn btn-primary col-sm-offset-4" data-loading-text="正在提交"><i class="icon-ok"></i> 绑定银行卡</button>
						        </div>
							</fieldset>
						</form>
						</c:if>
						<c:if test="${userInfo.realauthid!=1}">
							<div class="el-tip-info">
								<p class="text-info">请先完成实名认证之后，才能进行银行卡绑定；</p>
							</div>
						</c:if>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="common/footer-tpl.jsp" %>
	</body>
</html>