<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="account/findAll">测试</a>
	<h3>测试保存</h3>
	<br/>
	<form action="account/save" method="post">
		姓名：<input type="text" name="name"><br/>
		金额：<input type="text" name="money"><br/>
		<input type="submit" value="保存"><br/>
	</form>
</body>
</html>