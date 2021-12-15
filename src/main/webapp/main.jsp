<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web Framework</title>
</head>
<body>
	<div align = "right">
		<form action = "login.encore" method = "post">
			<label>아이디</label>
			<input type = "text" placeholder = "아이디" name = "id" />
			<label>비밀번호</label>
			<input type = "password" placeholder = "비밀번호" name = "pwd" />
			<input type = "submit" value = "로그인" />
		</form>
	</div>
	
	<div align = "left">
		<a href = "">게시물 목록보기</a>
	</div>
</body>
</html>