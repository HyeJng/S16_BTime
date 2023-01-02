<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<button type="button" id="loveaddList">찜</button>
			<button type="button" id="readingList">읽고 있는 책</button>
			<button type="button" id="subInfo">구독 정보</button>
		</div>
	</div>
	<ul>
		<c:if test="${empty brnlist }">
			<h4>열람 중인 도서가 없습니다!</h4>
		</c:if>
		<c:forEach items="${brnlist }" var="book" varStatus="status">
		<li>
			<div>
				<img src="${book.thum_img }" alt="${book.book_name }">
				<div>
					<p class="book_name">${book.book_name }</p>
					<p class="author">${book.author }</p>
					<br>
					<div>
						<p class="total_grade">${book.total_grade }</p>
						<p class="grade_peo">${book.grade_peo }</p>
					</div>
					<p class="read_page">123/245</p>
					<p class="readstr_date">${rnlist[status.index].readstr_date }</p>
				</div>
				<div>
					<button type="button" class="btn_reading">도서 읽기</button>
					<form action="<%=request.getContextPath() %>/readingnowdelete.do" method="post">
						<input type="text" value="${book.isbn }" name="isbn_data" class="isbn_data" style="display: none;">
						<button type="submit" class="btn_reading_delete">삭제</button>
					</form>
				</div>
			</div>
		</li>
		</c:forEach>
	</ul>
	<script>
		$(loadHandler);
		function loadHandler(){
			$('#loveaddList').on("click",loveaddListClickHandler);
			$('#readingList').on("click",readingListClickHandler);
			$('#subInfo').on("click",subInfoClickHandler);
			$('.btn_reading').on("click", readingClickHandler);
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
		function readingClickHandler(){
			var isbn = $('.isbn_data').val();
			var w = window.open("about:blank", "_blank", "width=800, height=700, resizable=yes" );
			w. location.href = "<%=request.getContextPath()%>/reading?isbn="+ isbn;
		}
	</script>
</body>
</html>