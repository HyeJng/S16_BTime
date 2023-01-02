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
		<form action="<%=request.getContextPath() %>/login.do" method="post">
		<fieldset>
				<label>로그인</label>
				<p>아이디<input type="text" id="id" name="id"></p>
				<p>패스워드<input type="password" id="pwd" name="pwd"></p>
				<button type="submit" id="login">로그인</button>
			</fieldset>
		</form>
	</div>
</body>
</html>