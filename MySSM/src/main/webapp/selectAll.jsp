<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.shiyi.baby.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询全部</title>
</head>
<body>
	<% 
	List<StudentVo> list = (List<StudentVo>)session.getAttribute("list");
	%>
	<div align="center">
	<table border="1">
		<tr>
		<td>学号</td><td>姓名</td><td>性别</td><td>年龄</td><td>总成绩</td>
		</tr>
		<% 
		for(StudentVo s:list){
			%>
		<tr>
		<td><%=s.getId()%></td><td><%=s.getName()%></td><td><%=s.getSex()%></td><td><%=s.getAge()%></td><td><%=s.getSourcesum()%></td>
		</tr>
			<%
		}
		%>
	</table>
	</div>
</body>
</html>