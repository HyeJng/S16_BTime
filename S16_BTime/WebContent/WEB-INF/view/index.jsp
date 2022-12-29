<%@page import="kh.semi.s16.bt.model.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<script src='./js/jquery-3.6.1.js'></script>
<%
	MemberVo vo = (MemberVo) request.getSession().getAttribute("loginInfo");
%>
</head>
<body>
	<div>
		<h3>메인 페이지</h3>
		<p>도서 DB 제공 : 알라딘 인터넷서점( www.aladin.co.kr)</p>
		<div>
			<c:choose>
				<c:when test="${empty loginInfo }">
					<button type="button" id="login">로그인</button>
				</c:when>
				<c:otherwise>
					<button type="button" id="logout">로그아웃</button>
					<button type="button" id="mypage">마이페이지</button>
				</c:otherwise>
			</c:choose>
		</div>
		<hr>
		<br>
		<h4>best seller</h4>
		<ul>
			<c:forEach items="${bestlist }" var="book">
				<li>
					<div class="post_wrapper">
						<!-- flex -->
						<div>
							<img src="${book.thum_img }" alt="${book.book_name }">
						</div>
						<div class="book_isbn">${book.isbn }</div>
						<button type="button" class="book_name">${book.book_name }</button>
						<div class="book_author">${book.author }</div>
					</div>
				</li>
			</c:forEach>
		</ul>
		<hr>
		<br>
		<h4>new essay</h4>
		<ul>
			<c:forEach items="${bookessay }" var="book">
				<li>
					<div class="post_wrapper">
						<!-- flex -->
						<div>
							<img src="${book.thum_img }" alt="${book.book_name }">
						</div>
						<div class="book_isbn">${book.isbn }</div>
						<button type="button" class="book_name">${book.book_name }</button>
						<div class="book_author">${book.author }</div>
					</div>
				</li>
			</c:forEach>
		</ul>
		<hr>
	</div>
	<script>
			$(function(){
				$('#login').on("click",LoginClickHandler);
				$('#logout').on("click",LogoutClickHandler);
				$('.book_name').on("click",DetailClickHandler);
				$('#mypage').on("click",MyPageClickHandler);
			});
			function LoginClickHandler(){
				console.log("LoginClickHandler");
				location.href = "<%=request.getContextPath()%>/login";
			}
			function LogoutClickHandler(){
				console.log("LogoutClickHandler");
				location.href = "<%=request.getContextPath()%>/logout";
			}
			function DetailClickHandler(){
				console.log("DetailClickHandler");
				var id = '<%=(String)session.getAttribute("id")%>';
				var isbn = $(this).prev().text();
				location.href = "<%=request.getContextPath()%>/detail?isbn="+isbn;
			}
			function MyPageClickHandler(){
				console.log("MyPageClickHandler");
				location.href = "<%=request.getContextPath()%>/loveadd";
			}
	</script>
</body>
</html>