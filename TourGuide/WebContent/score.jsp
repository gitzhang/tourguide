<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="system.jsp"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导游考试成绩查询系统</title>
<style type="text/css" media="all">
body,div {
	font-size: 18px;
	text-align: center;
	width:1024px;
	margin: 0 auto;
}

body {
	color: #4f6b72;
	background: #E6EAE9;
}

a {
	color: #c75f3e;
}

#mytable {
	width: 700px;
	padding: 0;
	margin: 0;
}

td {
	border-right: 1px solid #C1DAD7;
	border-bottom: 1px solid #C1DAD7;
	background: #fff;
	padding: 6px 6px 6px 12px;
	color: #4f6b72;
}
/*power by www.winshell.cn*/
td.alt {
	background: #F5FAFA;
	color: #797268;
}

th.spec {
	border-left: 1px solid #C1DAD7;
	border-top: 0;
	background: #fff no-repeat;
	font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
}

th.specalt {
	border-left: 1px solid #C1DAD7;
	border-top: 0;
	background: #f5fafa no-repeat;
	font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
	color: #797268;
}
/*---------for IE 5.x bug*/
html>body td {
	font-size: 18px;
}

body,td,th {
	font-family: 宋体, Arial;
	font-size: 18px;
}
</style>
</head>

<body>
	<h3>查詢成功!</h3>

	<table id="mytable" align="center" cellspacing="0" summary="成绩查询结果">
		<tr>
			<td class="row">考生姓名</td>
			<td class="row">${guideScore.name}</td>
		</tr>
		<tr>
			<td class="row">准考证号</td>
			<td class="row">${guideScore.examnum}</td>
		</tr>
		<tr>
			<td class="row">身份证号</td>
			<td class="row">${guideScore.identification}</td>
		</tr>
		<tr>
			<td class="row">考试成绩</td>
			<td class="row"><font size="18">${guideScore.score}</font></td>
		</tr>
	</table>
	<p>
		<a href="<%=basePath%>">返回</a>
		<a href="javascript:window.close()">关闭</a>
	</p>
</body>
</html>