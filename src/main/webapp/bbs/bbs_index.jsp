<%@ page 	language="java" 
					contentType="text/html; charset=EUC-KR"
    				pageEncoding="EUC-KR"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html > 
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ���</title>
	
	<script type="text/javascript">
	</script>
	
</head>
<body>
	<table align=center border=0 width=100%>
	<tr>
		<td align=left >
			page
		</td>
		<td align="right" >
			<form id="searchFmt" method="post" action="">
				<select id="condition" name="condition">
					<option value="subject">����</option>
					<option value="content">����</option>
				</select>
				<input type="text" name="keyword" id="keyword" size="30">
				<input type="submit" value="�˻�" id="searchBtn">
			</form>
		</td>
	</tr>
	</table>
	<%-- ////////////////// --%>
	<table align=center width="100%" border=0 cellspacing=0 cellpadding=3>

	<tr align=center bgcolor=#D0D0D0 height=120%>
	<td width="15%"> �� ȣ </td><td width="35%"> �� �� </td><td width="15%"> �ۼ��� </td><td width="20%"> �� ¥ </td><td width="15%"> ��ȸ�� </td>
	</tr>
		<c:forEach var = "BbsVO" items = "${ bbsList }">
		<tr> 
			<td align=center>${BbsVO.seq}</td>
			<td><a href="">${BbsVO.subject}</td>
			<td align=center>${BbsVO.writer}</a></td>
			<td align=center>${BbsVO.regdate}</td>
			<td align=center>${BbsVO.viewCnt}</td>
		</tr>
		</c:forEach>
		
	<tr>
		<td align="right" colspan="5"> 
			<a href="/bbs/post.encore" >[�۾���]</a> <a href="../index.encore">[ó������]</a> 
		</td>
	</tr>
	
	<%-- /////////////////////////////////////////// --%>
		

</table>


</body>
</html>



