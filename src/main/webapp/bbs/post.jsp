<%@ page 	language="java" 
					contentType="text/html; charset=UTF-8"
    				pageEncoding="UTF-8" %>
    				
<!DOCTYPE html >
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	
	<script type="text/javascript">
	</script>
	
</head>

<body>

	
<table width=100% cellspacing=0 cellpadding=3>
<tr>
<td>글 남기기</td>
</tr>
</table>
<br>
	<table width=100% cellspacing=0 cellpadding=3 align=center>
	
	<form name="postForm" action = "postInsert.encore">
		<tr>
		<td align=center>
		<table border=0 width=100% >
		
		<tr>
		<td width=20% align="right">작성자</td>
		<td width=80% align="left"><input type=text name="name" size=10 maxlength=8  ></td>
		
		<tr>
		<td width=20% align="right">제 목</td>
		<td width=80% align="left"><input type=text name="subject" size=50 maxlength=30></td>
		
		<tr>
		<td width=20% align="right">내 용</td>
		<td width=80% align="left"><textarea name="content" rows=5 cols=50></textarea>
		</td>
		
		<tr>
		<td colspan=2><hr size=1></td>
		<tr>
		
		<td> </td>
		<td>
			<input type="submit" value="등 록">
			<input type=reset value="취 소">
			<input type="button" value="뒤 로" onClick="history.back();">
		</td>
		</tr> 
		
		</table>
		</td>
		</tr>
	</form> 
	</table>
</body>

</html>




