<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<div>
		<h3>메인 페이지</h3>
		<p>도서 DB 제공 : 알라딘 인터넷서점( www.aladin.co.kr)</p>
		<div>
			<button type="button" id="login" onclick="/login">로그인</button>
			<button type="button" id="logout">로그아웃</button>
			<button type="button" id="mypage">마이페이지</button>
		</div>

		<hr>
		<br>
		<h4>best seller</h4>
		<ul>
			<c:forEach items="${bestlist }" var="book">
				<li>
					<div class="post_wrapper">
						<!-- flex -->
						<div><img src="${book.thum_img }" alt="${book.book_name }"></div>
						<div class="post_number">${book.isbn }</div>
						<div class="post_title">${book.book_name }</div>
						<div class="post_writer">${book.author }</div>
						<div class="post_date">${book.publisher }</div>
						<div class="post_date">${book.book_intro }</div>

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
						<div><img src="${book.thum_img }" alt="${book.book_name }"></div>
						<div class="post_number">${book.isbn }</div>
						<div class="post_title">${book.book_name }</div>
						<div class="post_writer">${book.author }</div>
						<div class="post_date">${book.publisher }</div>
						<div class="post_date">${book.book_intro }</div>

					</div>
				</li>
			</c:forEach>
		</ul>
		<hr>
		<div>
			<img alt="" src="">
			<div>
				<p id="book_name"></p>
				<p id="author"></p>
				<br>
				<div>
					<p id="total_grade"></p>
					<p id="grade_peo"></p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>