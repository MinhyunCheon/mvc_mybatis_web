<%@ page 	language="java" 
					contentType="text/html; charset=EUC-KR"
    				pageEncoding="EUC-KR"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html > 
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
	
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
					<option value="subject">제목</option>
					<option value="content">내용</option>
				</select>
				<input type="text" name="keyword" id="keyword" size="30">
				<input type="button" value="검색" id="searchBtn">
			</form>
		</td>
	</tr>
	</table>
	<%-- ////////////////// --%>
	<table align=center width="100%" border=0 cellspacing=0 cellpadding=3>

	<tr align=center bgcolor=#D0D0D0 height=120%>
	<td width="15%"> 번 호 </td><td width="35%"> 제 목 </td><td width="15%"> 작성자 </td><td width="20%"> 날 짜 </td><td width="15%"> 조회수 </td>
		</tr>
		<tbody id="tbody">
			<c:forEach var = "BbsVO" items = "${ bbsList }">
			<tr> 
				<td align=center>${BbsVO.seq}</td>
				<td><a href="read.encore?seq=${BbsVO.seq}">${BbsVO.subject}</td>
				<td align=center>${BbsVO.writer}</a></td>
				<td align=center>${BbsVO.regdate}</td>
				<td align=center>${BbsVO.viewCnt}</td>
			</tr>
			</c:forEach>
		</tbody>
			
		<tr>
			<td align="right" colspan="5"> 
				<a href="/bbs/post.encore" >[글쓰기]</a> <a href="../index.encore">[처음으로]</a> 
			</td>
		</tr>
	
	<%-- /////////////////////////////////////////// --%>
		

	</table>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
	$("#searchBtn").click(function() {
		condition = $("#condition").val()
		keyword   = $("#keyword").val()
		//alert(condition+" , "+keyword)
		$.ajax({
			url  : "../search.ajax" , 
			type : "post" ,
			data : { condition : condition , 
				     keyword   : keyword } , 
			dataType : "json" , 
			success  : function(data) {
				//alert(data);
				$("#tbody").empty();
				trs = ""
				$.each(data , function(idx, obj) {
					trs +="<tr>"
					trs +="<td align=center>"+obj.seq+"</td>"
					trs +="<td align=center>"+obj.writer+"</td>"
					trs +="<td><a href='read.encore?seq="+obj.seq+"'>"+obj.subject+"</a></td>"
					trs +="<td align=center>"+obj.regdate+"</td>"
					trs +="<td align=center>"+obj.viewCnt+"</td>"
					trs +="</tr>"
				})
				//alert(trs) ; 
				$("#tbody").html(trs);
			}
		})
	});

	</script>


</body>
</html>




