<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<div>
		<form action="/login.do" method="post">
		<fieldset>
				<label>로그인</label>
				<input type="text" id="id" name="id">아이디
				<input type="password" id="pwd" name="pwd">패스워드
				<button type="submit" id="login">로그인</button>
			</fieldset>
		</form>
	</div>
</body>
</html>