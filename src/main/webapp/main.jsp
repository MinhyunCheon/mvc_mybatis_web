<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@ page import = "encore.user.model.vo.UserVO" --%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web Framework</title>
</head>
<body>
	<div align = "right">
	<c:if test="${ loginUser == null }">
	<%--
	UserVO user = (UserVO)session.getAttribute("loginUser");
	if(user == null) { 
	--%>
		<form action = "login.encore" method = "post">
			<label>아이디</label>
			<input type = "text" placeholder = "아이디" name = "id" />
			<label>비밀번호</label>
			<input type = "password" placeholder = "비밀번호" name = "pwd" />
			<input type = "submit" value = "로그인" />
		</form>
	<%--
	}
	
	else {
	--%>
	</c:if>
	<c:if test="${ loginUser != null }">
		<label>
		<%--= user.getName() --%>
		${ loginUser.name }님 환영합니다.</label>
		<a href = "logout.encore">로그아웃</a>
	<%--
	}
	--%>
	</c:if>
	</div>
	
	<div align = "left">
		<a href = "">게시물 목록보기</a>
	</div>
</body>
</html>