<%@ page 	language="java" 
					contentType="text/html; charset=UTF-8"
    				pageEncoding="UTF-8" %>

<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
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
	
	<form name="updateFmt" id="updateFmt" action="updateBbs.encore?seq=${ bbs.seq }" method="post">
		<tr>
		<td align=center>
		<table border=0 width=100% >
		<!-- <input type="hidden" name="seq" value=${ bbs.seq }> -->
		<tr>
		<td width=20% align="right">성 명</td>
		<td width=80% align="left"><input type=text name="writer" size=10 maxlength=8 value=${ loginUser.name }  readonly ></td>
		<tr>
		<td width=20% align="right">제 목</td>
		<td width=80% align="left"><input type=text name="subject" size=50 maxlength=30 value=${ bbs.subject }></td>
		<tr>
		<td width=20% align="right">내 용</td>
		<td width=80% align="left"><textarea name="content" rows=5 cols=50>${ bbs.content }</textarea>
		</td>
		<tr>
		<td width=20% align="right">비밀 번호</td> 
		<td width=80% align="left" ><input type=password name="pass" id="pass" size=15 maxlength=15></td>
		<tr>
		<td colspan=2><hr size=1></td>
		<tr>
		<td> </td>
		<td>
			<input type="submit" value="수 정">
		</td>
		</tr> 
		
		
		</table>
		</td>
		</tr>
	</form> 
	</table>
</body>

</html>




