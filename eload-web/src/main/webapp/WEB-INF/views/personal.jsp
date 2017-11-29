<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>蓝源Eloan-P2P平台</title>
<!-- 包含一个模板文件,模板文件的路径是从当前路径开始找 -->
<%@ include file="common/links-tpl.jsp" %>
<script type="text/javascript" src="/js/plugins/jquery.form.js"></script>
<link type="text/css" rel="stylesheet" href="/css/account.css" />

<script type="text/javascript">
	$(function() {
		//邮箱的马上绑定按钮
		$("#showBindEmailModal").click(function() {
			$("#bindEmailModal").modal("show");
		});
		
		//给邮箱的保存按钮添加点击事件发送ajax请求
		$("#bindEmail").click(function() {
			//提交整个表单 (url 是默认的action)
			$("#bindEmailForm").ajaxSubmit({
				success : function(data) {
					if (data.success) {
						window.location.reload(); //刷新当前页面  关闭模式窗
					} else {
						$.messager.popup(data.msg);
					}
				}
			})
		});
		
		
		//点击马上绑定
		$("#showBindPhoneModal").click(function() {
			$("#bindPhoneModal").modal("show");
		});
		//给发送验证码按钮添加事件
		$("#sendVerifyCode").click(function() {
			var phoneNumber = $("#phoneNumber").val(); //获取到手机号后发送ajax请求
			var _this = $(this);
			_this.attr("disabled", true); //点击之后立刻禁用按钮
			if (phoneNumber) {
				$.ajax({
					type : "POST",
					url : "/sendVerifyCode.do",
					dataType : "json",
					data : { //发送到服务器的数据
						phoneNumber : phoneNumber
					},
					success : function(data) {
						if (data.success) { //做倒计时
							var count = 5;
							var timer = window.setInterval(function() {
								count--;
								if (count <= 0) {
									window.clearInterval(timer);
									_this.text("重新发送验证码");
									_this.attr("disabled", false);
								} else {
									_this.text(count + "秒后重新发送");
								}
							}, 1000);
						} else {
							$.messager.popup(data.msg);
							_this.attr("disabled", false);
						}
					}
				})
			}
		});
		//保存按钮绑定事件
		$("#bindPhone").click(function() {
			//提交整个表单
			$("#bindPhoneForm").ajaxSubmit({
				success : function(data) {
					if (data.success) {
						window.location.reload(); //刷新当前页面  关闭模式窗
					} else {
						$.messager.popup(data.msg);
					}
				}
			})
		});
	});
</script>
</head>
<body>
	<!-- 网页顶部导航 -->
	<%@ include file="common/head-tpl.jsp" %>
	<!-- 网页导航 -->
	<!-- 在当前的freemarker的上下文中,添加一个变量,变量的名字叫currentNav,变量的值叫personal -->
	<!--<#assign currentNav="personal" /> 
	<#include "common/navbar-tpl.ftl" />-->
	<%@ include file="common/navbar-tpl.jsp" %>
	<div class="container">
		<div class="row">
			<!--导航菜单-->
			<div class="col-sm-3"><!--<#assign currentMenu="personal" />
									<#include "common/leftmenu-tpl.ftl" />-->
				<%@ include file="common/leftmenu-tpl.jsp" %>
				</div>
			<!-- 功能页面 -->
			<div class="col-sm-9">
				<div class="panel panel-default">
					<div class="panel-body el-account">
						<div class="el-account-info">
							<div class="pull-left el-head-img">
								<img class="icon" src="/images/ms.png" />
							</div>
							<div class="pull-left el-head">
								<p>用户名:${logininfo.username}</p>
								<p>最后登录时间：2015-01-25 15:30:10</p>
							</div>
							<div class="pull-left"
								style="text-align: center; width: 400px; margin: 30px auto 0px auto;">
								<a class="btn btn-primary btn-lg" href="/recharge.do">账户充值</a> <a
									class="btn btn-danger btn-lg" href="/moneyWithdraw.do">账户提现</a>
							</div>
							<div class="clearfix"></div>
						</div>

						<div class="row h4 account-info">
							<div class="col-sm-4">
								账户总额：<span class="text-primary"><%--${account.totalAmount}--%>元</span>
							</div>
							<div class="col-sm-4">
								可用金额：<span class="text-primary">${account.usableamount}元</span>
							</div>
							<div class="col-sm-4">
								冻结金额：<span class="text-primary">${account.freezedamount}元</span>
							</div>
						</div>

						<div class="row h4 account-info">
							<div class="col-sm-4">
								待收利息：<span class="text-primary">${account.unreceiveinterest}元</span>
							</div>
							<div class="col-sm-4">
								待收本金：<span class="text-primary">${account.unreceiveprincipal}元</span>
							</div>
							<div class="col-sm-4">
								待还本息：<span class="text-primary">${account.unreturnamount}元</span>
							</div>
						</div>

						<div class="el-account-info top-margin">
							<div class="row">
								<div class="col-sm-4">
									<div class="el-accoun-auth">
										<div class="el-accoun-auth-left">
											<img src="images/shiming.png" />
										</div>
										<div class="el-accoun-auth-right">
											<h5>实名认证</h5>
											<c:choose>
												<c:when test = "${userInfo.realauthid==1}"><p>已认证 <a href="/realAuth.do">查看</a></p></c:when>
												<c:when test = "${userInfo.realauthid==2}"><p>未认证 <a href="/realAuth.do">马上认证 </a></p></c:when>
											</c:choose>
										</div>
										<div class="clearfix"></div>
										<p class="info">实名认证之后才能在平台投资</p>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="el-accoun-auth">
										<div class="el-accoun-auth-left">
											<img src="images/shouji.jpg" />
										</div>
										<div class="el-accoun-auth-right">
											<h5>手机认证</h5>
											<c:choose>
												<c:when test = "${userInfo.phonenumber!=null}"><p>已认证 <a href="#">查看</a></p></c:when>
												<c:otherwise><p>未认证 <a href="javascript:;" id="showBindPhoneModal">马上绑定</a></p></c:otherwise>
											</c:choose>
										</div>
										<div class="clearfix"></div>
										<p class="info">可以收到系统操作信息,并增加使用安全性</p>
									</div>
								</div>
								<div class="col-sm-4">
									<div class="el-accoun-auth">
										<div class="el-accoun-auth-left">
											<img src="images/youxiang.jpg" />
										</div>
										<div class="el-accoun-auth-right">
											<h5>邮箱认证</h5>
											<c:choose>
												<c:when test = "${userInfo.email!=null}"><p>已绑定 <a href="#">修改</a></p></c:when>
												<c:otherwise><p>未绑定  <a href="javascript:;" id="showBindEmailModal">马上绑定</a></p></c:otherwise>
											</c:choose>
										</div>
										<div class="clearfix"></div>
										<p class="info">您可以设置邮箱来接收重要信息</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-4">
									<div class="el-accoun-auth">
										<div class="el-accoun-auth-left">
											<img src="images/baozhan.jpg" />
										</div>
										<div class="el-accoun-auth-right">
											<h5>VIP会员</h5>
											<p>
												普通用户 <a href="#">查看</a>
											</p>
										</div>
										<div class="clearfix"></div>
										<p class="info">VIP会员，让你更快捷的投资</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


			<div class="modal fade" id="bindPhoneModal" tabindex="-1" role="dialog"
				 aria-labelledby="exampleModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="exampleModalLabel">绑定手机</h4>
						</div>
						<div class="modal-body">
							<form class="form-horizontal" id="bindPhoneForm" method="post"
								  action="/bindPhone.do">
								<div class="form-group">
									<label for="phoneNumber" class="col-sm-2 control-label">手机号:</label>
									<div class="col-sm-4">
										<input type="text" class="form-control" id="phoneNumber"
											   name="phoneNumber" />
										<button id="sendVerifyCode" class="btn btn-primary"
												type="button" autocomplate="off">发送验证码</button>
									</div>
								</div>
								<div class="form-group">
									<label for="verifyCode" class="col-sm-2 control-label">验证码:</label>
									<div class="col-sm-4">
										<input type="text" class="form-control" id="verifyCode"
											   name="verifyCode" />
									</div>
								</div>
							</form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
							<button type="button" class="btn btn-primary" id="bindPhone">保存</button>
						</div>
					</div>
				</div>
			</div>

			<div class="modal fade" id="bindEmailModal" tabindex="-1" role="dialog"
				 aria-labelledby="exampleModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="exampleModalLabel2">绑定邮箱</h4>
						</div>
						<div class="modal-body">
							<form class="form-horizontal" id="bindEmailForm" method="post" action="/sendEmail.do">
								<div class="form-group">
									<label for="email" class="col-sm-2 control-label">Email:</label>
									<div class="col-sm-4">
										<input type="text" class="form-control" id="email" name="email" />
									</div>
								</div>
							</form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
							<button type="button" class="btn btn-primary" id="bindEmail">保存</button>
						</div>
					</div>
				</div>
			</div>


	<%@ include file="common/footer-tpl.jsp" %>
</body>
</html>