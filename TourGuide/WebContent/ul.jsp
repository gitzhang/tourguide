<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传</title>
</head>
<body>
	<s:form namespace="/" action="uploadFile" method="post" enctype="multipart/form-data">
		<s:file value="选择文件" name="file"></s:file>
		<s:submit value="导入"></s:submit>
	</s:form>
</body>
</html>