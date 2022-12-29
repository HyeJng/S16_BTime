<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>읽고 있는 책</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<div>
	<h3>읽고 있는 책 목록</h3>
	<p>도서 DB 제공 : 알라딘 인터넷서점( www.aladin.co.kr)</p>
		<div>
		<button type="button">찜</button>
		<button type="button">읽고 있는 책</button>
		<button type="button">구독 정보</button>
	</div>
		<img alt="" src="">
		<div>
			<p id="book_name"></p>
			<p id="author"></p>
			<br>
			<div>
				<p id="total_grade"></p>
				<p id="grade_peo"></p>
			</div>
			<p id="read_page"></p>
			<p id="readstr_date"></p>
		</div>
	</div>
	<script>
		$(loadHandler);
		function loadHandler(){
			$('#loveaddList').on("click",loveaddListClickHandler);
			$('#readingList').on("click",readingListClickHandler);
			$('#subInfo').on("click",subInfoClickHandler);
		}
		function loveaddListClickHandler(){
			console.log("loveaddListClickHandler");
			location.href = "<%=request.getContextPath()%>/loveadd";
		}
		function readingListClickHandler(){
			console.log("readingListClickHandler");
			location.href = "<%=request.getContextPath()%>/readingnow";
		}
		function subInfoClickHandler(){
			console.log("subInfoClickHandler");
			location.href = "<%=request.getContextPath()%>/subscribeinfo";
		}
	</script>
</body>
</html>