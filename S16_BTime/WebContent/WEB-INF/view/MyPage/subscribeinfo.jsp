<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 구독 정보</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<div>
		<button type="button">찜</button>
		<button type="button">읽고 있는 책</button>
		<button type="button">구독 정보</button>
	</div>
	<div>
		<p>님의 구독제 정보</p>
	</div>
	<div id="mu_sub_info">
		<p id="subtype">구독제 종류</p>
		<p>구독 기간</p>
		<!-- substr_date, subend_date -->
		<p>~</p>
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