<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
	<form action="login" method="post">
		<div align="center">
			<br> <br> <font color="red" size="15">登陆界面</font><br>
			<br> <br>
			<table style="width: 200">
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<br> <br> <input type="submit" value="登录">
			<input type="reset" value="重置"><br> <br> <a
				href="addUser.jsp">还没有账号点击注册</a><br> <br>
		</div>
	</form>
</body>
</html>