<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}" var="mian">
		<p>欢迎${mian.empName}职工登录本系统！</p>
	<c:set value="${mian.empId}" var="EmpId" scope="page"></c:set>
	</c:forEach>
	<hr>
		<a href="EmpSearch.jsp">查询薪水和部门</a><p>
	<hr>
	<form action="EmpModify" method="post">
		您的员工ID为：<input type="text" name="userId" value="${EmpId}"><p>
		请输入您原来的密码：<input type="password" name="beforePwd"><p>
		请输入您要修改后的密码：<input type="password" name="userPwd"><p>
		请输入您原来的部门：<input type="text" name="beforePart"><p>
		请输入您要修改后的部门：<input type="text" name="partName"><p>
		<button type="submit">点击修改</button>
	
	</form>
	
</body>
</html>