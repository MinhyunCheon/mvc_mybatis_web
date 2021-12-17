<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join.encore" method="post">
		<label>아이디 </label>
		<input type="text" name="id" 		placeholder="아이디">
		<br/> 
		<label>패스워드 </label>
		<input type="password" name="pwd" 	placeholder="패스워드">
		<br/>
		<label>이름 </label>
		<input type="text" name="name" 		placeholder="이름">
		<br/>
		<label>포인트</label>
		<select name="point">
			<option value="1000">1,000</option>
			<option value="2000">2,000</option>
			<option value="3000">3,000</option>
		</select>
		<br/>
		<button type="submit">등 록</button>   
	</form>

</body>
</html>