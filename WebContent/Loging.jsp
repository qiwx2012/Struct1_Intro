<%@page import="java.nio.file.Path"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="f1" id="f1" action="login.do" mdthod="post">

		<table border="0">
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" id="username"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="login"></td>
				
			</tr>
		</table>
	</form>


</body>
</html>