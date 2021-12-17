<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var = "BbsVO" items = "${ bbsList }">
		${BbsVO.seq}&nbsp;
		${BbsVO.subject}&nbsp;
		${BbsVO.content}&nbsp;
		${BbsVO.writer}&nbsp;
		${BbsVO.regdate}&nbsp;
		${BbsVO.viewCnt}&nbsp;
		<br>
	</c:forEach>
</body>
</html>