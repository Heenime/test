<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>添加主机</title>
	</head>
	<body>
		<form >
		主机名：<inpuut name="hostname" /><br>
		主机IP：<inpuut name="hostIP" /><br>
		模板ID：<inpuut name="templateId" /><br>
		组ID：<inpuut name="groupId" /><br> 
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交">
		</form>
	
	</body>
	action="${pageContext.request.contextPath}/host/CreatHost" method="post"
</html>