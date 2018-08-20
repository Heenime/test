<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<style type="text/css">
			.divcss5-left{float:left} 
			/* css注释：对divcss5-right设置float:right即可让对象靠右浮动 */
		</style>
		<title>zabbix主机监控页面</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
			<link rel="stylesheet" type="text/css" href="styles.css">
			-->
		<script type="text/javascript">
		</script>
	</head>
	<body>
	<!-- 查询所有主机 -->
		<form id="searchForm"  action="${pageContext.request.contextPath}/host/showHostList"  method="post">
			<table>
				<tr>
					<td>主机名</td>
					<td>主机ID</td>
					<td>主机状态</td>
					<td>操作</td>
				</tr>
			<c:forEach var="h" items="${hostlist}">
				<tr>
					<td>${h.host}</td>
					<td>${h.hostid}</td>
					<td>
					 <c:if test="${h.status == 0}"><font color="green">正常</font></c:if>
					<c:if test="${h.status !=0 }"><font color="red">故障</font></c:if>  
					
					</td>
					<td><a href="javascript:deleteb()">删除主机</a>
					</td>
				</tr>
			</c:forEach>
			</table>
		</form>
			<!-- 小按钮 添加主机 删除主机 -->
	<div id="tb"  class="divcss5-left">
		<a href="${pageContext.request.contextPath}/host/addHost.jsp" >添加主机 </a>
	</div> 

		
		
	
	</body>



</html>