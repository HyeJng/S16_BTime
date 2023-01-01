<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 구독 정보</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<h3>나의 구독 정보</h3>
	<div>
		<button type="button" id="loveaddList">찜</button>
		<button type="button" id="readingList">읽고 있는 책</button>
		<button type="button" id="subInfo">구독 정보</button>
	</div>
	<div>
		<p><%=session.getAttribute("id") %> 님의 구독제 정보</p>
	</div>
	<div id="mu_sub_info">
		<p id="subType">
			구독제 종류: 
			<c:choose>
				<c:when test="${empty subinfo }">
					<h4>현재 이용 중인 구독제가 없습니다!</h4>
				</c:when>
				<c:when test="${subinfo.subType eq 1 }">
					베이직-30일
				</c:when>
				<c:when test="${subinfo.subType eq 2 }">
					스탠다드-60일
				</c:when>
				<c:otherwise>
					프리미엄-90일
				</c:otherwise>
			</c:choose>
			
		</p>
		<p>구독 기간</p>
		<!-- substr_date, subend_date -->
		<p>${subinfo.substr_date }~${subinfo.subend_date }</p>
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
			location.href = "<%=request.getContextPath()%>/love";
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