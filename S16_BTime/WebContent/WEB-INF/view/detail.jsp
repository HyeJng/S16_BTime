<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 도서</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<div>
		<h3>도서 상세 페이지</h3>
		<p>도서 DB 제공 : 알라딘 인터넷서점( www.aladin.co.kr)</p>
		<img src="${bookdetail.thum_img }" alt="${bookdetail.book_name }">
		<div>
			<p id="book_name">${bookdetail.book_name }</p>
			<p id="isbn">${bookdetail.isbn }</p>
			<p id="author">${bookdetail.author }</p>
			<p id="publisher">${bookdetail.publisher }</p>
			<p id="category">${bookdetail.category }</p>
			<br>
			<hr>
			<div>
				<p id="book_intro">${bookdetail.book_intro }</p>
			</div>
			<br>
			<div>
				<p id="total_grade">${bookdetail.total_grade }</p>
				<p id="grade_peo"></p>
			</div>
		</div>
		<br>
		<div>
			<p id="book_intro">${book.detail.book_intro }</p>
		</div>
		<div>
			<c:choose>
				<c:when test="${empty addChk }">
					<button type="button" id="loveadd" class="add">찜</button>
				</c:when>
				<c:otherwise>
					<button type="button" id="loveadd">찜 해제</button>
				</c:otherwise>
			</c:choose>
			<button type="button">도서 읽기</button>
			<!-- 여기서는 버튼을 누르면 마이페이지에 추가만 되도록 구현 -->
		</div>
		<br>
		<div>
			<div>
				<input type="text" name="review_add" value="추천합니다!">
				<button type="submit" id="btn_review_add">리뷰 작성</button>
			</div>
			<div>
				<div>리뷰목록</div>
				<div>
					<c:forEach items="${reviewlist }" var="review">
						<p class="id">${review.id }</p>
						<p class="each_grade">${review.each_grade }</p>
						<p class="rev_txt">${review.rev_txt }</p>
						<p class="rev_date">${review.rev_date }</p>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<script>
		$(loadedHandler);
		function loadedHandler(){
			$("#loveadd").on("click", loveAddClickHandler);
		}
		function loveAddClickHandler(){
			var id = '<%=(String)session.getAttribute("id")%>';
			var isbn = $("#isbn").text();

			if ($("#loveadd").hasClass("add")) {
				var add = "no";
				$.ajax({
					type : "post",
					url : "loveadd.ajax",
					data : {
						id : id,
						isbn : isbn,
						add : add
					},
					success : btnSendSuccessCb,
					error : ajaxErrorCb
				});
			} else {
				var add = "yes";
				$.ajax({
					type : "post",
					url : "loveadd.ajax",
					data : {
						id : id,
						isbn : isbn,
						add : add
					},
					success : btnSendSuccessCb,
					error : ajaxErrorCb
				});
			}
		}

		function btnSendSuccessCb(loveAdd) {
			console.log(loveAdd);
			console.log(loveAdd.result);
			console.log(loveAdd["result"]);
		}
		function ajaxErrorCb(request, status, error) {
			alert("code:" + request.status + "\n" + "message"
					+ request.responseText + "\n" + "error" + error);
		}
	</script>
</body>
</html>