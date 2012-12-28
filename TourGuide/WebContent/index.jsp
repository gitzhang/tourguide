<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="system.jsp"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>陕西省2012年出境旅游领队考试成绩查询系统</title>
<link type="text/css" rel="stylesheet"
	href="<%=basePath%>js/formvalidator/style/validator.css"></link>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>js/formvalidator/formValidator-4.0.1.js"></script>
<script type="text/javascript"
	src="<%=basePath%>js/formvalidator/formValidatorRegex.js"></script>
<script type="text/javascript" src="<%=basePath%>js/index.js"></script>
<style type="text/css" media="all">
body,div {
	font-size: 18px;
	margin: 0 auto;
	margin-left: auto;
	margin-right: auto;
	width: 1024px;
	font-family: "微软雅黑";
}

body {
	color: #4f6b72;
	background: #E6EAE9;
}

a {
	color: #c75f3e;
}

tr {
	height: 20px;
}

td {
	background: #fff;
	padding: 6px 6px 6px 12px;
	color: #4f6b72;
}

td.alt {
	background: #F5FAFA;
	color: #797268;
}

body,td,th {
	font-family: 微软雅黑, Arial;
}
</style>
</head>

<body>
	<h2 style="text-align: center;">陕西省2012年出境旅游领队考试成绩查询系统</h2>
		<form id="scoreForm" action="<%=basePath%>guide/getGuideScore.action" 
			method="post">
			<s:token />
			<s:actionerror cssStyle="text-align:left;"/>
			<table border="0px" style="font-size: 18px" width="700px" align="center">
				<tr>
					<td align="right">考生姓名:</td>
					<td><input type="text" id="name" name="name" autocomplete="off"
						style="width: 220px;height: 30px;font-size: 20px" value="" /></td>
					<td><div id="nameTip" style="width: 250px"></div></td>
				</tr>
				<tr>
					<td align="right">考生考号:</td>
					<td><input type="text" id="examnum" name="examnum" autocomplete="off"
						style="width: 220px;height: 30px;font-size: 20px" value="" /></td>
					<td><div id="examnumTip" style="width: 250px"></div></td>
				</tr>
				<tr>
					<td align="right">身份证号:</td>
					<td><input type="text" id="sfzh" name="identification" autocomplete="off"
						style="width: 220px;height: 30px;font-size: 20px" value="" maxlength="18"/></td>
					<td><div id="sfzhTip" style="width: 250px"></div></td>
				</tr>
				<tr>
					<td align="center" colspan="3" width="180px;"><input type="submit" value="查询" /></td>
				</tr>
			</table>
		</form>
</body>
</html>