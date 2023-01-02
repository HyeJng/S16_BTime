<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>찜</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<div>
	<h3>찜 목록</h3>
	<p>도서 DB 제공 : 알라딘 인터넷서점( www.aladin.co.kr)</p>
	<div>
		<button type="button" id="loveaddList">찜</button>
		<button type="button" id="readingList">읽고 있는 책</button>
		<button type="button" id="subInfo">구독 정보</button>
	</div>
	<ul>
		<c:if test="${empty lovelist }">
			<h4>찜한 도서가 없습니다!</h4>
		</c:if>
		<c:forEach items="${lovelist }" var="book">
		<li>
			<img src="${book.thum_img }" alt="${book.book_name }">
			<div>
				<p id="book_name">${book.book_name }</p>
				<p id="author">${book.author }</p>
				<br>
				<div>
					<p id="total_grade">${book.total_grade }</p>
					<p id="grade_peo"></p>
				</div>
			</div>
		</li>
		</c:forEach>
	</ul>
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