<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
</head>
<body>
	<form action="addUser.do" method="post">
		<div align="center">
			<br> <br> <font color="red" size="15">注册界面</font><br>
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
				<tr>
					<td>密保问题:</td>
					<td><input type="text" name="answers"></td>
				</tr>
				<tr>
					<td>答案:</td>
					<td><input type="text" name="questions"></td>
				</tr>
			</table>
			<br> <br> <input type="submit" value="注册">
			<input type="reset" value="重置"><br> <br> 
		</div>
	</form>
</body>
</html>