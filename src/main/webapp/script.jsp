<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>

	<div id="result"></div>
	<br>
	<button type="button" id="btn" class="btn">script button</button>
	제조사 :
	<select id="maker">
		<option>benz</option>
		<option>audi</option>
		<option>bmw</option>
	</select>
	모델 :
	<select id="model">
		<option>제조사를 선택하세요.</option>
	</select>
	<form id="#fmt">
		<input type="text" name="id" id="id">
		<button type="button" id="sendBtn">send</button>
	</form>
	
	<!-- 보편적으로 head에 선언하지만, 받을 파일이 많은 경우 시간이 소요되기 때문에 화면을 다 처리한 뒤 선언하는 방식도 사용 -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
		var arr = [{seq:1, title:'test1'}, {seq:2, title:'test2'}];
		var models = {
			benz : ['c200', 'e200', 's200']
			, audi : ['a4', 'a6', 'a8']
			, bmw : ['320d', '520d', '740d']
		}
	
		$(document).ready(function() {
			$("#btn").click(function() {
				// .text()를 사용할 경우 태그가 활설화 되지 않음
				// $("#result").html("<h1>script test</h1>");
				$.each(arr, function(idx, obj) {
					alert(obj.seq + ', ' + obj.title);
				});
			});
			
			$("#maker").change(function() {
				setModel($(this).val());
			});
		});
		
		$("#sendBtn").click(function() {
			console.log("send button click");			
			id = $("#id").val();

			if(id == "") {
				alert("id를 입력하세요.");
				$("#id").focus();
				return false;
			}
			
			$("#fmt")
			.prop("method", "get")
			.prop("action", "xxxx.encore")
			.submit();
		});
		
		function setModel(maker) {
			var options;
			$.each(models[maker], function(idx, obj) {
				options += "<option value='"+ idx + "'> " + obj + "</option>";
			});
			$("#model").html(options);
		}
	</script>
</body>
</html>